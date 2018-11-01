

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        int numberIn = 0;
        while (numberIn <= 3) {
            System.out.println("Please, give me the number of rows for the diagonal to draw (it has to be higher than 3):");
            numberIn = scannerInt.nextInt();
        }

        for (int j = 0; j < numberIn; j++) {
                if (j == 0 || (j == (numberIn - 1))) {
                    for (int k = 0; k < numberIn; k++) {
                        System.out.print("%");
                    }
                    System.out.println();
                } else {
                    for (int i = 0; i < numberIn; i++){
                        if ((i == 0) || (i == (numberIn - 1)) || (i == j)){
                            System.out.print("%");
                        } else System.out.print(" ");
                        }
                    System.out.println();
                    }

        }


    }



}



