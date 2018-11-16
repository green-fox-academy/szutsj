//Exercise
//       Write a program where the program chooses a number between 1 and 100.
//  The player is then asked to enter a guess.
// If the player guesses wrong, then the program gives feedback and
// ask to enter an other guess until the guess is correct.
//        Make the range customizable (ask for it before starting the guessing).
//        You can add lives. (optional)
//       Example
//        I've the number between 1-100. You have 5 lives.
//        20
//        Too high. You have 4 lives left.
//        10
//        Too low. You have 3 lives left.
//        15
//        Congratulations. You won!


import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {
    System.out.println("Please enter the first number of the range: ");
    Scanner scannerInt = new Scanner(System.in);
    int rangeMin = scannerInt.nextInt();
    System.out.println("Please enter the first number of the range: ");
    int rangeMax = scannerInt.nextInt();
    System.out.println("How many lives do you want: ");
    int lives = scannerInt.nextInt();
    GuessMyNumber(rangeMin, rangeMax, lives);
  }

  public static void GuessMyNumber(int rangeMin, int rangeMax, int lives) {
    int randomNumber = rangeMin + (int) (Math.random() * (rangeMax - rangeMin));

    for (int i = lives; i > 0; i--) {
      System.out.println("Please give me your tipp: ");
      Scanner scannerInt = new Scanner(System.in);
      int guess = scannerInt.nextInt();
      if (guess == randomNumber) {
        System.out.println("You won!");
        break;
      }
      System.out.println("You have " + (i - 1) + " lives left.");
    }
  }
}

