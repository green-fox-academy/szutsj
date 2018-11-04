//Armstrong number
//        What is Armstrong number?
//        An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
//        Let's demonstrate this for a 4-digit number:
//          1634 is a 4-digit number, raise each digit to the fourth power,
//          and add: 1^4 + 6^4 + 3^4 + 4^4 = 1634, so it is an Armstrong number.
//        For a 3-digit number:
//          153 is a 3-digit number, raise each digit to the third power,
//              and add: 1^3 + 5^3 + 3^3 = 153, so it is an Armstrong number.
//        Exercise
//        Write a simple program to check if a given number is an armstrong number.
//          The program should ask for a number. E.g. if we type 371,
//      the program should print out: The 371 is an Armstrong number.


import java.util.Scanner;

public class ArmstrongNumber{

    public static void main(String[] args) {
        System.out.println("Please, give me a number: ");
        Scanner scannerint = new Scanner(System.in);
        int number = scannerint.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number){
        String[] digits = String.valueOf(number).split("(?<=.)");
        int [] digitsInt = new int[digits.length];
        for (int i = 0; i < digits.length ; i++) {
            digitsInt[i] = Integer.parseInt(digits[i]);
        }
        int armstrongNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            armstrongNumber +=(int)Math.pow((double)digitsInt[i], (double)digitsInt.length);
        }
        if (armstrongNumber == number){
            System.out.println("It is an Armstrong number!");
        } else System.out.println("It isn't an Armstrong number.");
    }
}
