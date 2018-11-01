//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

import java.util.Scanner;

public class PrintArguments {

    public static void main(String[] args) {
        System.out.println("How many words would you like to print?");
        Scanner scannerInt = new Scanner(System.in);
        int answer = scannerInt.nextInt();
        String[] parameter = new String[answer];
        for (int i = 0; i < answer; i++){
            System.out.println("Please, the " + (i + 1) + ". word: ");
            Scanner scannerString = new Scanner(System.in);
            parameter[i] = scannerString.nextLine();
        }
        printParam(parameter);
    }

    public static void printParam(String[] parameter){
        for (String word : parameter){
            System.out.print(word + " ");
        }
    }
}