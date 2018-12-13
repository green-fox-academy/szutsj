import java.util.HashMap;

public class Count {

  public HashMap<Character, Integer> countLetters(String word){
    HashMap<Character, Integer> map = new HashMap<>();
    if (word == null) return map;
    if (word.length() == 0) return map;

    for (int i = 0; i < word.length(); i++) {
      word = word.toLowerCase();
      char key = word.charAt(i);
      if (map.containsKey(key)){
        map.replace(key, map.get(key), map.get(key) + 1);
      } else {
        map.put(key, 1);
      }

    }
    return map;
  }
}
