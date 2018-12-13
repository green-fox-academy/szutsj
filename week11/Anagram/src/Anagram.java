import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  public boolean checkWetherAnagrams(String firstWord, String secondWord) {
    boolean anagrams = false;
    if (firstWord.length() != secondWord.length()) return false;
    if (stringToList(firstWord).containsAll(stringToList(secondWord)) && stringToList(secondWord).containsAll(stringToList(firstWord))){
      anagrams = true;
    }
    return anagrams;
  }

  private ArrayList<Character> stringToList(String word) {
    word = word.toLowerCase();
    char[] array = word.toCharArray();
    ArrayList<Character> list = new ArrayList<Character>();

    for (char letter : array){
      list.add(letter);
    }

    return list;
  }

}