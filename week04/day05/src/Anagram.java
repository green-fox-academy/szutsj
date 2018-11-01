import java.util.Scanner;
import java.lang.String;

public class Anagram {

    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        String input1;
        String input2;
        System.out.println("Please, give me the first word:");
        input1 = scannerString.nextLine();
        System.out.println("Please, give me the second word:");
        input2 = scannerString.nextLine();
        System.out.println("It is an anagram: " + anagram(input1, input2));
    }

    public static boolean anagram(String input1, String input2) {
        char[] inp1 = input1.toCharArray();
        char[] inp2 = input2.toCharArray();
        boolean anagrams = true;
        if (inp1.length != inp2.length){
            anagrams = false;
        } else {
            for (int i = 0; i < inp1.length; i++) {
                if (inp1[i] != inp2[inp2.length - 1 - i]){
                    anagrams = false;
                }
            }
        }
        return anagrams;
    }
}
