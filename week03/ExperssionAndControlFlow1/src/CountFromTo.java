// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        boolean bigger = true;
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Please, enter the first number:");
        firstNumber = scannerInt.nextInt();
        while (bigger) {
            System.out.println("Please, enter the second number:");
            secondNumber = scannerInt.nextInt();
            bigger = firstNumber > secondNumber;
            if (bigger) {
                System.out.println("The second number should be bigger.");
            }
        }
         for (int i = firstNumber; i <= secondNumber; i++) {
             System.out.println(i);
         }
    }
}
