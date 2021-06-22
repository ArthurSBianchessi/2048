import java.io.IOException;
import java.util.Scanner;

/**
 * The class {@code MainApp} contains the method {@code main}, which has the code
 * to run the game 2048.
 * 
 * @author Arthur Bianchessi (arthursbianchessi@gmail.com).
 * @version 1.0 (2021-06-22).
 */
public class MainApp extends Auxiliar{
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        boolean moveValidity1, moveValidity2, moveValidity3, endGame, notWon;
        String move, newGame;
        int i, j, points, score;
        int[][] grid;
        Scanner input;

        greetings();

        do{
            grid = new int[4][4];
            input = new Scanner (System.in);

            score = 0;
            endGame = false;
            notWon = true;

            newNumber(grid);

            while (!endGame){
                newNumber(grid);
                printMatrix(grid, score);

                System.out.println();
                do{
                    move = input.nextLine();
                    move = move.toLowerCase();

                    moveValidity1 = true;
                    moveValidity2 = true;
                    moveValidity3 = true;
                    points = 0;

                    if (move.equals("left") || move.equals("l")){
                        moveValidity2 = moveLeft(grid);
                        points = fuseLeft(grid);
                        moveLeft(grid);
                    }
                    else if (move.equals("right") || move.equals("r")){
                        moveValidity2 = moveRight(grid);
                        points = fuseRight(grid);
                        moveRight(grid);
                    }
                    else if (move.equals("up") || move.equals("u")){
                        moveValidity2 = moveUp(grid);
                        points = fuseUp(grid);
                        moveUp(grid);
                    }
                    else if (move.equals("down") || move.equals("d")) {
                        moveValidity2 = moveDown(grid);
                        points = fuseDown(grid);
                        moveDown(grid);
                    }
                    else{
                        moveValidity1 = false;
                    }

                    if (points == 0){
                        moveValidity3 = false;
                    }

                    endGame = !emptySpaces(grid);
                    score += points;
                }while (endGame || !(moveValidity1 && (moveValidity2 || moveValidity3)));

                if (notWon && highestValue(grid) == 2048){
                    notWon = false;
                    printYouWon();
                    System.out.println("Do you wish to continue?");
                    do{
                        newGame = input.nextLine();
                        newGame = newGame.toLowerCase();
                    }while(!(newGame.equals("yes") || newGame.equals("no") || newGame.equals("y") || newGame.equals("n")));

                    if (newGame.equals("no") || newGame.equals("n")){
                        endGame = true;
                    }
                }

            }

            printGameOver();

            do{
                newGame = input.nextLine();
                newGame = newGame.toLowerCase();
            }while(!(newGame.equals("yes") || newGame.equals("no") || newGame.equals("y") || newGame.equals("n")));

            input.close();
            System.out.printf("\n\n\n\n\n");

        }while(newGame.equals("yes") || newGame.equals("y"));
    }
}
