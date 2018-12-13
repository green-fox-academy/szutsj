import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumElementsTest {

  @Test
  public void testSumwithEmptyList(){
    SumElements sum = new SumElements();
    ArrayList<Integer> list = new ArrayList<>();
    int expectedResult = 0;

    int result = sum.sum(list);

    assertEquals(expectedResult, result);

  }

  @Test
  public void testSumWithOneElement(){
    SumElements sum = new SumElements();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    int expectedResult = 4;

    int result = sum.sum(list);

    assertEquals(expectedResult, result);

  }

  @Test
  public void testSumWithMultiplyElements(){
    SumElements sum = new SumElements();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    int expectedResult = 10;

    int result = sum.sum(list);

    assertEquals(expectedResult, result);

  }

  @Test
  public void testSumWithNull(){
    SumElements sum = new SumElements();
    ArrayList<Integer> list = new ArrayList<>();
    list = null;
    int expectedResult = 0;

    int result = sum.sum(list);

    assertEquals(expectedResult, result);

  }


}