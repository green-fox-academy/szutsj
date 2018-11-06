import java.util.Scanner;
import java.lang.String;

public class PalindromeBuilder {

    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        String input;
        System.out.println("Please, enter a word to build a palindrome:");
        input = scannerString.nextLine();
        System.out.println(palindromeBuild(input));
    }

    public static char[] palindromeBuild(String input) {
        char[] inp = input.toCharArray();
        char[] palindrome = new char[inp.length * 2];
        int j = inp.length -1;

        for (int i = 0; i < inp.length * 2; i++) {
            if (i < inp.length){
                palindrome[i] = inp[i];
            } else {
                palindrome[i] = inp[j];
                j--;
            }
        }

        return palindrome;
    }
}
