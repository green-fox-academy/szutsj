import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        boolean acceptableOperator = true;
        String operator = "";
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Please, enter the first number;");
        firstNumber = scannerInt.nextInt();
        System.out.println("Please, enter the second number:");
        secondNumber = scannerInt.nextInt();
        while (acceptableOperator){
            System.out.println("Please, give me the operator (only +,-,*,/% accepted):");
            operator = scannerString.nextLine();
            if (operator.equals("/") || operator.equals("*") || operator.equals("+") || operator.equals("-") || operator.equals("%")){
                acceptableOperator = false;
                System.out.println(calculate(operator, firstNumber, secondNumber));
            }
        }
    }

    public static int calculate(String operator, int firstNumber, int secondNumber) {
        int result = 0;
        if (operator.equals("+")){
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")){
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")){
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")){
            result = firstNumber / secondNumber;
        } else {
            result = firstNumber % secondNumber;
        }
        return result;
    }
}

