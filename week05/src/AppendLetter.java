import java.util.*;

public class AppendLetter {

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacod", "koal", "pand", "zebr");
        System.out.println(appendA(far));
    }

    public static List<String> appendA(List<String> far){
        List<String> fara = new ArrayList<String>();
        for (String word : far) {
            word += "a";
            fara.add(word);
        }
        return fara;
    }
}

