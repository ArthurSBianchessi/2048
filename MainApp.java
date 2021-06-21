import java.io.IOException;
import java.util.Scanner;

/**
 * The class {@code MainApp} contains the method {@code main}, which has the code
 * to run the game 2048.
 * 
 * <p> @author Arthur Bianchessi (arthursbianchessi@gmail.com).
 * <p> @date 2021-06-18.
 */
public class MainApp extends Auxiliar{
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        boolean movevalidity1, movevalidity2, movevalidity3, endgame, notwon;
        String move, newgame;
        int i, j, points, score;
        int[][] grid;
        Scanner input;

        greetings();

        do{
            grid = new int [4] [4];
            input = new Scanner (System.in);

            score = 0;
            endgame = false;
            notwon = true;

            newNumber(grid);

            while (!endgame){
                newNumber(grid);
                printMatrix(grid, score);

                System.out.println();
                do{
                    move = input.nextLine();
                    move = move.toLowerCase();

                    movevalidity1 = true;
                    movevalidity2 = true;
                    movevalidity3 = true;
                    points = 0;

                    if (move.equals("left") || move.equals("l")){
                        movevalidity2 = moveLeft(grid);
                        points = fuseLeft(grid);
                        moveLeft(grid);
                    }
                    else if (move.equals("right") || move.equals("r")){
                        movevalidity2 = moveRight(grid);
                        points = fuseRight(grid);
                        moveRight(grid);
                    }
                    else if (move.equals("up") || move.equals("u")){
                        movevalidity2 = moveUp(grid);
                        points = fuseUp(grid);
                        moveUp(grid);
                    }
                    else if (move.equals("down") || move.equals("d")) {
                        movevalidity2 = moveDown(grid);
                        points = fuseDown(grid);
                        moveDown(grid);
                    }
                    else{
                        movevalidity1 = false;
                    }

                    if (points == 0){
                        movevalidity3 = false;
                    }

                    endgame = !emptySpaces(grid);
                    score += points;
                }while (endgame || !(movevalidity1 && (movevalidity2 || movevalidity3)));

                if (notwon && highestValue(grid) == 2048){
                    notwon = false;
                    printYouWon();
                    System.out.println("Do you wish to continue?");
                    do{
                        newgame = input.nextLine();
                        newgame = newgame.toLowerCase();
                    }while(!(newgame.equals("yes") || newgame.equals("no") || newgame.equals("y") || newgame.equals("n")));

                    if (newgame.equals("no") || newgame.equals("n")){
                        endgame = true;
                    }
                }

            }

            printGameOver();

            do{
                newgame = input.nextLine();
                newgame = newgame.toLowerCase();
            }while(!(newgame.equals("yes") || newgame.equals("no") || newgame.equals("y") || newgame.equals("n")));

            input.close();
            System.out.printf("\n\n\n\n\n");

        }while(newgame.equals("yes") || newgame.equals("y"));
    }
}
