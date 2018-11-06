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
        char toSort;
        boolean anagrams = true;

        for (int i = 0; i < inp1.length - 1; i++) {
            for (int j = i+1; j < inp1.length; j++){
                if (inp1[i] > inp1[j]){
                    toSort = inp1[i];
                    inp1[i] = inp1[j];
                    inp1[j] = toSort;
                }
            }
        }

        for (int i = 0; i < inp2.length - 1; i++) {
            for (int j = i+1; j < inp2.length; j++){
                if (inp2[i] > inp2[j]){
                    toSort = inp2[i];
                    inp2[i] = inp2[j];
                    inp2[j] = toSort;
                }
            }
        }

        if (String.valueOf(inp1).equals(String.valueOf(inp2))){
            anagrams = true;
        } else {
            anagrams = false;
        }

        return anagrams;
    }
}
