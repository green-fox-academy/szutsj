import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {
    List<CharSequence> characterList = Arrays.asList("M", "I", "C", "I", "M", "A", "C", "K", "Ó");
    System.out.println(characterList.stream().collect(Collectors.joining("")));
  }

}
