import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

  public static void main(String[] args) {
    String string = "Ez Most EGY Próba";
    List<Character> charachtersOfTheString = new ArrayList<>();

    for (int i = 0; i < string.length(); i++) {
      charachtersOfTheString.add(string.charAt(i));
    }
    charachtersOfTheString.stream().filter(Character::isUpperCase).forEach(System.out::println);
  }

}
