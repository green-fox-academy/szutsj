import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {

    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String[] quoteToWorkWith = quote.split(" ");
        for (String word : quoteToWorkWith) {
            System.out.println(word);
        }
        ArrayList<String> quoteRepaired =  new ArrayList<>(Arrays.asList(quoteToWorkWith));
        quoteRepaired.add(3, " always takes longer than ");
        quote = "";
        for (String word : quoteRepaired) {
            quote += word + " ";
                    }
        System.out.println(quote);
    }
}
