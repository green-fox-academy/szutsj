
import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        int numberIn;
        System.out.println("Please, give me the number of rows for the square:");
        numberIn = scannerInt.nextInt();
        for (int j = 0; j < numberIn; j++) {
            if (j == 0 || (j == (numberIn - 1))) {
                for (int k = 0; k < numberIn; k++) {
                    System.out.print("%");
                }
                System.out.println();
            } else {
                for (int i = 0; i < numberIn; i++) {
                    if ((i == 0) || (i == (numberIn - 1))) {
                        System.out.print("%");
                    } else System.out.print(" ");
                }
                System.out.println();
            }

        }
    }

}





