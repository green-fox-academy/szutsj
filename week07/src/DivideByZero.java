import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    System.out.println("Please, enter a number to divide 10 by it:");
    Scanner scannerInt = new Scanner(System.in);
    try{
      int divisor = scannerInt.nextInt();
      int result = 10 / divisor;
      System.out.println(result);
    } catch (InputMismatchException e){
      System.out.println("This is not a number!");
    } catch (ArithmeticException e){
      System.out.println("Can not divide by zero!");
    }
  }
}
