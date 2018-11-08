import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSearcher {

    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        String wordToFindPalindromeIn ="";
        boolean acceptableWord = true;

        while (acceptableWord) {
            System.out.println("Please, give me a word (at least 3 characters long!): ");
            wordToFindPalindromeIn = scannerString.nextLine();
            if (wordToFindPalindromeIn.length() < 3) {
                acceptableWord = true;
            } else {
                acceptableWord = false;
            }
        }
        char[] withSpaces = wordToFindPalindromeIn.toCharArray();
        wordToFindPalindromeIn = "";

        for (int i = 0; i < withSpaces.length; i++) {
            if (withSpaces[i] != ' '){
                wordToFindPalindromeIn = wordToFindPalindromeIn.concat(String.valueOf(withSpaces[i]));
            }
        }
        System.out.println("The list of palindromes in the word are: ");
        System.out.println(palindrome(wordToFindPalindromeIn));
    }


    public static ArrayList<String> palindrome(String wordToFindPalindromeIn) {
        char[] letters = wordToFindPalindromeIn.toCharArray();
        ArrayList<String> palindromes = new ArrayList<>();

        for (int palindromeLength = 3; palindromeLength <= letters.length; palindromeLength++) {

            for (int indexInArrayList = 0; indexInArrayList < letters.length; indexInArrayList++) {
               if (!endOfString(letters.length, palindromeLength, indexInArrayList) && reallyPalindrome(wordToFindPalindromeIn.substring(indexInArrayList, palindromeLength + indexInArrayList))) {
                   palindromes.add(wordToFindPalindromeIn.substring(indexInArrayList, palindromeLength + indexInArrayList));
                }
            }
        }
        return palindromes;
    }

    public static boolean endOfString(int lettersLength, int palindromeLength, int index){
        boolean ended = true;
        if (lettersLength >= palindromeLength + index){
            ended = false;
        }

        return ended;
    }

    public static boolean reallyPalindrome(String subString) {
        char[] subStringAsCharArray = subString.toCharArray();
        boolean reallyP = true;

        for (int j = 0; j < subStringAsCharArray.length; j++) {
            if (subStringAsCharArray[j] != subStringAsCharArray[subStringAsCharArray.length - 1 - j]) {
            reallyP = false;
            }
        }
        return reallyP;
    }
}
