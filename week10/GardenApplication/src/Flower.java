//
//The Flower
//
//    needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5
//

public class Flower extends Plant{

  public Flower(){
    super();
  }

  public Flower(String color) {
      this.setWaterlevel(0);
      this.setAbsorblevel(0.75);
      this.setMinimumWaterlevel(5);
      this.setColor(color);
  }

}
