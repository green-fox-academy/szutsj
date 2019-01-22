import java.util.Arrays;
import java.util.List;

public class Exercise7 {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    char parameter = 'A';
    cities.stream().filter(word -> word.startsWith(String.valueOf(parameter))).forEach(System.out::println);
  }

}
