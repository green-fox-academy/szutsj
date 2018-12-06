//
//The Flower
//
//    needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5
//

public class Flower extends Plant{
  public static final int minimumWaterlevel = 5;
  public static final double absorsblevel = 0.75;

  public Flower(String color) {
      super(color, absorsblevel, minimumWaterlevel);
  }

}
