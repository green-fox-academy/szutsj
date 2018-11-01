//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Please, enter a number:");
        Scanner scannerInt = new Scanner(System.in);
        int numberUpToCount = scannerInt.nextInt();
        System.out.println("The sum of the whole numbers up to the given number is: "  + sum(numberUpToCount));
    }

    public static int sum(int number){
        int sum = 0;
        for (int i=0; i <= number; i++){
            sum += i;
        }
        return (sum);
    }
}