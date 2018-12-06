//The Tree
//    needs water if its current water amount is less then 10
//    when watering it the tree can only absorb the 40% of the water
//    eg. watering with 10 the tree's amount of water should only increase with 4
//

public class Tree extends Plant {
    public static final int minimumWaterlevel = 10;
    public static final double absorsblevel = 0.4;

  public Tree(String color) {
    super(color, absorsblevel, minimumWaterlevel);
  }


}
