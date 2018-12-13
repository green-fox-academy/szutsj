import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  private static Anagram test;

  @Before
  public void beforeEveryTest(){
    test = new Anagram();
  }

  @Test
  public void testCheckWetherAnagramsWithAnagrams(){
    String input1 = "Lali";
    String input2 = "Ilal";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertTrue(result);
  }

  @Test
  public void testCheckWetherAnagramsWithDifferentLenght(){
    String input1 = "Lal";
    String input2 = "lala";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithNotAnagrams(){
    String input1 = "Lall";
    String input2 = "Ilal";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithEmptyStrings(){
    String input1 = "";
    String input2 = "";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithFirstEmptyString(){
    String input1 = "";
    String input2 = "l";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithSecondEmptyStrings(){
    String input1 = "l";
    String input2 = "";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWith2Null(){
    String input1 = null;
    String input2 = null;

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithFirstNull(){
    String input1 = null;
    String input2 = "Lali";

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

  @Test
  public void testCheckWetherAnagramsWithSecondNull(){
    String input1 = "Lali";
    String input2 = null;

    boolean result = test.checkWetherAnagrams(input1, input2);

    assertFalse(result);
  }

}

