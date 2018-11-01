// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int  numberToGuess = 12;
        System.out.println("Guess what is the number (between 1-20):");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        while (numberToGuess != userGuess) {
            if (numberToGuess > userGuess) {
                System.out.println("The stored number is higher.");
            } else if (numberToGuess < userGuess) {
                System.out.println("The stored number is lower.");
            }
            System.out.println("Guess again:");
            userGuess = scanner.nextInt();
        }
        System.out.println("You found the number.");
    }


}


