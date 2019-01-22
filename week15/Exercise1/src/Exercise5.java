import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

  public static void main(String[] args) {
    String string = "most Ez EGY próba";
    List<Character> charsOfTheString = new ArrayList<>();

    for (int i = 0; i < string.length(); i++) {
      charsOfTheString.add(string.charAt(i));
    }
    charsOfTheString.stream().filter(letter -> Character.isUpperCase(letter)).forEach(System.out::println);
  }

}
