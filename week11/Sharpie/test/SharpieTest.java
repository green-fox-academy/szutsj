import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  @Test
  public void testUseOnceSharpie(){
    Sharpie test = new Sharpie("blue", 10F);
    Float expectedResult = 99F;

    test.use();
    Float result = test.inkAmout;

    assertEquals(expectedResult, result);
  }

  @Test
  public void testUseThreeTimesSharpie(){
    Sharpie test1 = new Sharpie("blue", 10F);
    Float expectedResult = 97F;

    test1.use();
    test1.use();
    test1.use();
    Float result = test1.inkAmout;

    assertEquals(expectedResult, result);
  }

}