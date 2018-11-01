
import java.util.Scanner;
public class DraPyramid {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        int numberIn = 3;
        int actualRow;
        int howManyStar = 1;
        int howManySpace;
        boolean even = true;
        while (even) {
            System.out.println("Please, give me the number of rows for the pyramid to draw (only odd number):");
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
            howManyStar++;
            howManyStar++;
        }
    }
}