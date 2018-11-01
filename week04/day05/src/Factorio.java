//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        System.out.println("Please,enter a number:");
        Scanner scannerInt = new Scanner(System.in);
        int numberToFact = scannerInt.nextInt();
        System.out.println("The factorial of this number is: " + factorio(numberToFact));
    }

    public static int factorio(int numberToFact){
        int fact = 1;
        for (int i = 1; i <= numberToFact; i++){
            fact *= i;
        }
        return(fact);
    }
}