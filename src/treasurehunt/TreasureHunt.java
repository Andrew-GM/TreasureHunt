package treasurehunt;

import java.util.Scanner;
import java.util.Random;

public class TreasureHunt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[10][8];
        Random random = new Random();
        int points = 0;
        String PointsHolder = null;
        int amountofTreasure = random.nextInt((20 - 15) + 1) + 15;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[  ]";
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < amountofTreasure; i++) {
            int randX = random.nextInt(10);
            int randY = random.nextInt(8);

            board[randX][randY] = "[" + Integer.toString(random.nextInt((99 - 10) + 1) + 10) + "]";
        }


        System.out.println("Guess which row the treasure is in. (Between 1 and 8)");
        int Row = input.nextInt() - 1;

        System.out.println("Guess which column is in. (Between 1 and 10)");
        int Column = input.nextInt() - 1;

        if (board[Column][Row].equals("[  ]")) {
            System.out.println("You got no points!");
        } else {
            PointsHolder = (board[Row][Column]).substring(1, 3);
            points = points + Integer.parseInt(PointsHolder);
            System.out.println("You got " + points + " points.");
        }

    }

}
