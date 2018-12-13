import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  public boolean checkWetherAnagrams(String firstWord, String secondWord) {
    if (firstWord == null || secondWord == null) return false;
    if (firstWord.length() == 0 || secondWord.length() == 0) return false;
    if (firstWord.length() != secondWord.length()) return false;
    boolean anagrams = false;

    if (stringToList(firstWord).containsAll(stringToList(secondWord)) && stringToList(secondWord).containsAll(stringToList(firstWord))){
      anagrams = true;
    }
    return anagrams;
  }

  private ArrayList<Character> stringToList(String word) {
    word = word.toLowerCase();
    ArrayList<Character> list = new ArrayList<Character>();

    for (int i = 0; i < word.length(); i++) {
      list.add(word.charAt(i));
    }

    return list;
  }

}