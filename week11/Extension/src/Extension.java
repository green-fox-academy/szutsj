import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    int max = 0;
    if (a > b) {
      if (a > c) {
        max = a;
      } else {
        max = c;
      }
    } else if (a > c) {
          max = b;
        } else {
          max = c;
        }
        return max;
  }



  int median(List<Integer> pool) {
    if (pool == null) return 0;
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    if (hungarian == null) return "";
    if (hungarian.length() == 0) return "";
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}