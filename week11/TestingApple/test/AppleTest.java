import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

  @Test
  public void testgetApple() {
    Apple app = new Apple();
    String expectedResult = "Apple";

    String result = app.getApple();

    assertEquals(expectedResult, result);
  }
}