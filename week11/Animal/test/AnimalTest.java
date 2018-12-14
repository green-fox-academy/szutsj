import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  private Animal test;

  @Before
  public void beforeEveryTest(){
    test = new Animal();
  }

  @Test
  public void testEat() {
    int expectedResult = 49;

    test.eat();
    int result = test.hunger;

    assertEquals(expectedResult, result);
  }

  @Test
  public void testAteToMuch() {
    int expectedResult = 0;

    for (int i = 0; i < 60; i++) {
      test.eat();
    }
    int result = test.hunger;

    assertEquals(expectedResult, result);
  }

  @Test
  public void testDrink() {
    int expectedResult = 49;

    test.drink();
    int result = test.thirst;

    assertEquals(expectedResult, result);
  }

  @Test
  public void testDrinkToMuch() {
    int expectedResult = 0;

    for (int i = 0; i < 60; i++) {
      test.drink();
    }
    int result = test.thirst;

    assertEquals(expectedResult, result);
  }

  @Test
  public void testPlay() {
    int expectedHungerLevel = 51;
    int expectedThirstLevel = 51;

    test.play();
    int hungerLevel = test.hunger;
    int thisrtLevel = test.thirst;

    assertEquals(expectedHungerLevel, hungerLevel);
    assertEquals(expectedThirstLevel, thisrtLevel);
  }

  @Test
  public void testToString() {
    String expectedResult = "Animal{" +
        "hunger=" + test.hunger +
        ", thirst=" + test.thirst +
        '}';

    String result = test.toString();

    assertEquals(expectedResult, result);
  }

}