import java.util.*;
import java.lang.*;

public class Calculator1 {

    public static void main(String[] args) {
        String expression = "+55";
        boolean acceptableExpression = true;
        Scanner scannerString = new Scanner(System.in);

        while (acceptableExpression){
            System.out.println("Please, give me the expression (for example +33, where '+' is the operator, the first 3 is the first operand, and the second 3 is the second operand):");
            expression = scannerString.nextLine();
            if (expression.length() == 3){
                acceptableExpression = !expressionIsOk(expression);
            }
        }

        System.out.println(calculate(expression.substring(0, 1), Integer.parseInt(expression.substring(1, 2)), Integer.parseInt(expression.substring(2)) ));
    }

    public static Integer calculate(String operator, Integer firstNumber, Integer secondNumber) {
        Integer result = 0;
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

    public static boolean expressionIsOk(String expression){
        boolean ok;
        String operatorRange = "+-*/%";
        String operandRange = "0123456789";
        if (operatorRange.contains(expression.substring(0, 1)) && operandRange.contains(expression.substring(1, 2)) && operandRange.contains(expression.substring(2))){
            ok = true;
        } else {
            ok = false;
        }
        return ok;
    }
}