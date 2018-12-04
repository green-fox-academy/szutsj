//The Tree
//    needs water if its current water amount is less then 10
//    when watering it the tree can only absorb the 40% of the water
//    eg. watering with 10 the tree's amount of water should only increase with 4
//

public class Tree extends Plant {

  public Tree(){
    super();
  }

  public Tree(String color) {
    this.setWaterlevel(0);
    this.setAbsorblevel(0.4);
    this.setMinimumWaterlevel(10);
    this.setColor(color);
  }

}
