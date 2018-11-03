//  Create a function that takes a number and a list of numbers as a parameter
//  Returns the indeces of the numbers in the list where the first number is part of
//  Returns an empty list if the number is not part any of the numbers in the list

//  Example:
// System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
// System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.lang.*;
import java.util.Arrays;

public class SubInt {

    public static void main(String[] args) {
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    }

    public static  ArrayList<Integer> subInt(Integer number, int[] intArray){
        ArrayList<Integer> index = new ArrayList<>();
        String numberToFind = number.toString();
        System.out.println(numberToFind);
        for (int i = 0; i < intArray.length; i++) {
            String[] stringArray = new String[intArray.length];
            stringArray[i] = Integer.valueOf(intArray[i]).toString();
            if (stringArray[i].contains(numberToFind)){
                index.add(i);
            }
        }
        return index;
    }
}