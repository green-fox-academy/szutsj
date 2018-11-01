import java.lang.String;
import java.util.*;

public class QuoteSwap {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create", "I", "cannot","not", "understand."));
        System.out.println(quoteSwap(list));
    }

    public static String quoteSwap(ArrayList<String> list){
        String word = list.get(2);
        String word2 = list.get(5);
        String finalList = "";
        list.remove(2);
        list.add(2, word2);
        list.remove(5);
        list.add(5,word);
        for (String words: list) {
            finalList = finalList.concat(words).concat(" ");
        }
        return finalList;
    }
}

