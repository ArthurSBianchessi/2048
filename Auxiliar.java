/**
 * The class {@code Auxiliar} is the superclass that contains the subroutines 
 * called by the class {@code Main} to alter, check or print values of the
 * matrix used for the game 2048 or to display messages in the Bluej terminal.
 * 
 * @author Arthur Bianchessi (arthursbianchessi@gmail.com).
 * @version 1.0 (2021-06-22).
 */
public class Auxiliar{
    /**
     * This method prints instructions of how to play, win and loose the game.
     */
    public static void greetings(){
        System.out.println("Hi! This is 2048. The objective of the game is to get to ");
        System.out.println("2048. If every position is filled, the game ends. Actions ");
        System.out.println("that can taken include moving every value in the grid ");
        System.out.println("left(l), right(r), up(u) or down(d). ");
        System.out.println("Have Fun :)");
    }

    /**
     * {@code emptySpaces} checks if there is any position in the matrix {@code grid} 
     * that hasn't any value in it.
     * @param grid
     * @return bollean value indicating if it is true that there are values
     * 0 in the matrix.
     */
    public static boolean emptySpaces(int[][] grid){
        int i, j;
        boolean t;

        t = false;
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                if (grid[i][j] == 0){
                    t = true;
                }
            }
        }
        return t;
    }

    /**
     * {@code newNumber} chooses a random empty position  in the matrix and then 
     * add the value 2 or 4 to it.
     * @param grid - location of the game matrix on the memory.
     */
    public static void newNumber(int[][] grid){
        int i, j;

        do{
            i = (int) (Math.random() * 4);
            j = (int) (Math.random() * 4);
        }while (grid[i][j] != 0);
        if (Math.random() < 0.9){
            grid[i][j] = 2;
        } 
        else {
            grid[i][j] = 4;
        }
    }

    /**
     * {@code printMatrix} print the matrix and the score in the terminal.
     * @param grid - location of the game matrix on the memory.
     * @param score - score of the player in the current game.
     */
    public static void printMatrix(int[][] grid, int score){
        int i, j; 

        System.out.printf("\n  Score: %d\n\n", score);
        for (i = 0; i < 4; i++){
            System.out.printf("    ");
            for (j = 0; j < 4; j++)
            {
                System.out.printf("%-6s", String.valueOf(grid[i][j]));
            }
            System.out.printf("\n\n");
        }
    }

    /**
     * {@code moveLeft} moves every value to the left so that there isn't any 
     * value 0 between non-zero values in every column.
     * @param grid - location of the game matrix on the memory.
     * @return boolean value indicating if values where moved in the matrix.
     */
    public static boolean moveLeft(int[][] grid){
        int i, j;
        boolean moveValidity2;
        
        moveValidity2 = false;
        for(i = 0; i < 4; i++){
            for(j = 1; j < 4; j++){
                while(j < 4 && grid[i][j] != 0){
                    while (j > 0 && grid[i][j - 1] == 0){
                        grid[i][j - 1] = grid[i][j];
                        grid[i][j] = 0;
                        j--;
                        moveValidity2 = true;
                    }
                    j++;
                }
            }
        }
        return moveValidity2;
    }

    /**
     * {@code moveRight} moves every value to the right so that there isn't any 
     * value 0 between non-zero values in every column.
     * @param grid - location of the game matrix on the memory.
     * @return boolean value indicating if values where moved in the matrix.
     */
    public static boolean moveRight(int[][] grid){
        int i, j;
        boolean moveValidity2;

        moveValidity2 = false;
        for(i = 0; i < 4; i++){
            for(j = 3; j > -1; j--){
                while(j > -1 && grid[i][j] != 0){
                    while (3 > j && grid[i][j + 1] == 0){
                        grid[i][j + 1] = grid[i][j];
                        grid[i][j] = 0;
                        j++;
                        moveValidity2 = true;
                    }
                    j--;
                }
            }
        }
        return moveValidity2;
    }

    /**
     * {@code moveUp} moves every value up so that there isn't any 
     * value 0 between non-zero values in every row.
     * @param grid - location of the game matrix on the memory.
     * @return boolean value indicating if values where moved in the matrix.
     */
    public static boolean moveUp(int[][] grid){
        int i, j;
        boolean moveValidity2;

        moveValidity2 = false;
        for(j = 0; j < 4; j++){
            for(i = 1; i < 4; i++){
                while(i < 4 && grid[i][j] != 0){
                    while (i > 0 && grid[i - 1][j] == 0){
                        grid[i - 1][j] = grid[i][j];
                        grid[i][j] = 0;
                        i--;
                        moveValidity2 = true;
                    }
                    i++;
                }
            }
        }
        return moveValidity2;
    }

    /**
     * {@code moveDown} moves every value down so that there isn't any 
     * value 0 between non-zero values in every row.
     * @param grid - location of the game matrix on the memory.
     * @return boolean value indicating if values where moved in the matrix.
     */
    public static boolean moveDown(int[][] grid){
        int i, j;
        boolean moveValidity2;

        moveValidity2 = false;
        for(j = 0; j < 4; j++){
            for(i = 3; i > -1; i--){
                while(i > -1 && grid[i][j] != 0){
                    while (3 > i && grid[i + 1][j] == 0){
                        grid[i + 1][j] = grid[i][j];
                        grid[i][j] = 0;
                        i++;
                        moveValidity2 = true;
                    }
                    i--;
                }
            }
        }
        return moveValidity2;
    }

    /**
     * {@code fuseLeft} takes two adjacent equal values in the same column and adds them 
     * together (by doubling one and eliminating the other). It gives preference to
     * the pairs that are more to the left.
     * 
     * @param grid - location of the game matrix on the memory.
     * @return score gained equal to the sum of fused values.
     */
    public static int fuseLeft(int[][] grid){
        int i, j, points;

        points = 0;
        for(i = 0; i < 4; i++){
            for(j = 1; j < 4; j++){
                while(j < 4 && grid[i][j] != 0){
                    if (j > 0 && grid[i][j] == grid[i][j - 1]){
                        grid[i][j - 1] = 2 * grid[i][j];
                        points += 2 * grid[i][j];
                        grid[i][j] = 0;
                    }
                    j++;
                }
            }
        }
        return points;
    }

    /**
     * {@code fuseRight} takes two equal adjacent values in the same column and adds them 
     * together (by doubling one and eliminating the other). It gives preference to
     * the pairs that are more to the right.
     * 
     * @param grid - location of the game matrix on the memory.
     * @return score gained equal to the sum of fused values.
     */
    public static int fuseRight(int[][] grid){
        int i, j, points;

        points = 0;
        for(i = 0; i < 4; i++){
            for(j = 3; j > -1; j--){
                while(j > -1 && grid[i][j] != 0){
                    if (3 > j && grid[i][j + 1] == grid[i][j]) {
                        grid[i][j + 1] = 2 * grid[i][j];
                        points += 2 * grid[i][j];
                        grid[i][j] = 0;
                    }
                    j--;
                }
            }
        }
        return points;
    }

    /**
     * {@code fuseUp} takes two equal adjacent values in the same row and adds them 
     * together (by doubling one and eliminating the other). It gives preference to
     * the pairs that are above.
     * 
     * @param grid - location of the game matrix on the memory.
     * @return score gained equal to the sum of fused values.
     */
    public static int fuseUp(int[][] grid){
        int i, j, points;

        points = 0;
        for(j = 0; j < 4; j++){
            for(i = 1; i < 4; i++){
                while(i < 4 && grid[i][j] != 0){
                    if (i > 0 && grid[i][j] == grid[i - 1][j]) {
                        grid[i - 1][j] = 2 * grid[i][j];
                        points += 2 * grid[i][j];
                        grid[i][j] = 0;
                    }
                    i++;
                }
            }
        }
        return points;
    }

    /**
     * {@code fuseDown} takes two equal adjacent values in the same row and adds them 
     * together (by doubling one and eliminating the other). It gives preference to
     * the pairs that are below.
     * 
     * @param grid - location of the game matrix on the memory.
     * @return score gained equal to the sum of fused values.
     */
    public static int fuseDown(int[][] grid){
        int i, j, points;

        points = 0;
        for(j = 0; j < 4; j++){
            for(i = 3; i > -1; i--){
                while(i > -1 && grid[i][j] != 0){
                    if (3 > i && grid[i + 1][j] == grid[i][j]) {
                        grid[i + 1][j] = 2 * grid[i][j];
                        points += 2 * grid[i][j];
                        grid[i][j] = 0;
                    }
                    i--;
                }
            }
        }
        return points;
    }

    /**
     * {@code highestValue} checks what is the highest value in the matrix.
     * @param grid location of the game matrix on the memory.
     * @return highest value in the matrix.
     */
    public static int highestValue(int[][] grid){
        int i, j, value;
        
        value = 0;
        for (i = 0; i < 4; i++){
            for (j = 0; j < 4; j++){
                if (grid[i][j] > value){
                    value = grid[i][j];
                }
            }
        }
        return value;
    }

    /**
     * {@code printYouWon} prints the ascii art that reads "YOU WON!!" 
     * 
     * The text was generated using 
     * <a href="https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20">Patorjk TAAG</a>.
     */
    public static void printYouWon(){
        System.out.println("      ____    ____  ______    __    __           ");
        System.out.println("      \\   \\  /   / /  __  \\  |  |  |  |          ");
        System.out.println("       \\   \\/   / |  |  |  | |  |  |  |           ");
        System.out.println("        \\_    _/  |  |  |  | |  |  |  |           ");
        System.out.println("          |  |    |  `--'  | |  `--'  |           ");
        System.out.println("          |__|     \\______/   \\______/            ");
        System.out.println("____    __    ____  ______   .__   __.  __   __   ");
        System.out.println("\\   \\  /  \\  /   / /  __  \\  |  \\ |  | |  | |  |  ");
        System.out.println(" \\   \\/    \\/   / |  |  |  | |   \\|  | |  | |  |  ");
        System.out.println("  \\            /  |  |  |  | |  . `  | |  | |  |  ");
        System.out.println("   \\    /\\    /   |  `--'  | |  |\\   | |__| |__|  ");
        System.out.println("    \\__/  \\__/     \\______/  |__| \\__| (__) (__)  ");
        System.out.println();
    }
    
    /**
     * {@code printGameOver} prints the ascii art that reads "GAME OVER." 
     * 
     * The text was generated using 
     * <a href="https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20">Patorjk TAAG</a>.
     */
    public static void printGameOver(){
        System.out.printf("  _______      ___      .___  ___.  _______   \n");
        System.out.printf(" /  _____|    /   \\     |   \\/   | |   ____|  \n");
        System.out.printf("|  |  __     /  ^  \\    |  \\  /  | |  |__     \n");
        System.out.printf("|  | |_ |   /  /_\\  \\   |  |\\/|  | |   __|    \n");
        System.out.printf("|  |__| |  /  _____  \\  |  |  |  | |  |____   \n");
        System.out.printf(" \\______| /__/     \\__\\ |__|  |__| |_______|  \n");
        System.out.printf("                                              \n");
        System.out.printf("  ______   ____    ____  _______ .______      \n");
        System.out.printf(" /  __  \\  \\   \\  /   / |   ____||   _  \\     \n");
        System.out.printf("|  |  |  |  \\   \\/   /  |  |__   |  |_)  |    \n");
        System.out.printf("|  |  |  |   \\      /   |   __|  |      /     \n");
        System.out.printf("|  `--'  |    \\    /    |  |____ |  |\\  \\--.\n");
        System.out.printf(" \\______/      \\__/     |_______|| _| `.___|\n");
        System.out.printf("\n\nNew Game?\n");
    }
}
