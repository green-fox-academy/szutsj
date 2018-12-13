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

}