import java.lang.*;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "this"));
        //  should print: `-1`
    }

    public static int subStr(String input, String q) {
        int place = input.indexOf(q);

            return place;

    }
}