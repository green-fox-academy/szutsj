
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args) {
        boolean Fizz;
        boolean Buzz;
        boolean FizzBuzz;
        for (int  number = 1; number < 100; number++){
            Fizz = (number % 3) == 0;
            Buzz = (number % 5) == 0;
            FizzBuzz = Fizz && Buzz;
            if (FizzBuzz) {
                System.out.println("FizzBuzz");
            } else if (Fizz) {
                    System.out.println("Fizz");
            } else if (Buzz) {
                    System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}

