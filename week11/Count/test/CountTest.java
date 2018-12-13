import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTest {
  private Count test;

  @Before
  public void beforeEveryTest(){
    test = new Count();
  }

  @Test
  public void testCountWithUppercaseLetter(){
    String input = "Tutti";
    HashMap<Character, Integer> expectedResult = new HashMap<>();
    expectedResult.put('i', 1);
    expectedResult.put('u', 1);
    expectedResult.put('t', 3);

    HashMap<Character, Integer> result = test.countLetters(input);

    assertEquals(expectedResult.entrySet(), result.entrySet());
  }

  @Test
  public void testCountWithEmptyString(){
    String input = "";
    HashMap<Character, Integer> expectedResult = new HashMap<>();

    HashMap<Character, Integer> result = test.countLetters(input);

    assertEquals(expectedResult.entrySet(), result.entrySet());
  }

  @Test
  public void testCountWithNull(){
    String input = null;
    HashMap<Character, Integer> expectedResult = new HashMap<>();

    HashMap<Character, Integer> result = test.countLetters(input);

    assertEquals(expectedResult.entrySet(), result.entrySet());
  }

}