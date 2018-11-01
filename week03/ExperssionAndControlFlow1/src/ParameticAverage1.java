// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4


import java.util.Scanner;

public class ParameticAverage1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem,adja meg hány szám összegét és átlagát szeretné kiszámoltatni:");
        int numberIn = scanner.nextInt();
        int numberToCalculate;
        int sum = 0;
        int average;

        for (int i = 0; i < numberIn; i++) {
            int a = i + 1;
            System.out.println("Kérem, adja meg az " + a + ". számot:");
            numberToCalculate = scanner.nextInt();
            sum += numberToCalculate;
        }
        average = sum / numberIn;
        System.out.println("Összeg:" + sum);
        System.out.println("Átlag:" + average);
    }



}
