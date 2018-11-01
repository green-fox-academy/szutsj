
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        int numberIn = 3;
        int actualRow;
        int howManyStar = 1;
        int howManySpace;
        boolean even = true;
        while (even) {
            System.out.println("Please, give me the number of rows for the diagonal to draw (only odd number):");
            numberIn = scannerInt.nextInt();
            even = (numberIn % 2) == 0;
        }
        for (actualRow = 0; actualRow < numberIn; actualRow++) {
            howManySpace = numberIn - howManyStar / 2;
            for (int i = 0; i < howManySpace; i++) {
                System.out.print(" ");
            }
            for (int i = howManyStar; i > 0; i--) {
                System.out.print("*");
            }
            for (int i = 0; i < howManySpace; i++) {
                System.out.print(" ");
            }
            System.out.println();
            if (actualRow + 1 < numberIn / 2 + 1) {
                howManyStar++;
                howManyStar++;
            } else {
                howManyStar--;
                howManyStar--;
            }
        }
    }
}



