import java.util.ArrayList;

public class SumElements {

  public int sum(ArrayList<Integer> list){
    if (list == null) return 0;
    int sum = 0;

    for (Integer number : list){
      sum += number;
    }

    return sum;
  }
}
