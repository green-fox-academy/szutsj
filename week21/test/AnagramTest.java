import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnagramTest {

  private static Anagram anagramObj;

  @BeforeClass
  public static void init() {
    anagramObj = new Anagram();
  }



  @Test
  public void testIfLengthAreNOTTheSame() {
    String string1 = "baba";
    String string2 = "mam";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertFalse(result);
  }

  @Test
  public void testIfStringsAreNull() {
    String string1 = null;
    String string2 = null;

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertFalse(result);
  }

  @Test
  public void testIfOnlyOneStringIsNull() {
    String string1 = null;
    String string2 = "baba";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertFalse(result);
  }

  @Test
  public void testIfOneStringIsEmpty() {
    String string1 = "baba";
    String string2 = "";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertFalse(result);
  }

  @Test
  public void testIfStringsAreTheSame() {
    String string1 = "baba";
    String string2 = "baba";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertTrue(result);
  }

  @Test
  public void testIfNotAnagramWithSameLength() {
    String string1 = "baba";
    String string2 = "mama";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertFalse(result);
  }

  @Test
  public void testIfAnagramWithSameLength() {
    String string1 = "baba";
    String string2 = "abba";

    boolean result = anagramObj.checkIfAreAnagrams(string1, string2);

    Assert.assertTrue(result);
  }
}
