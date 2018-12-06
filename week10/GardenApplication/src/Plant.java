//
//The Flower
//
//    needs water if its current water amount is less then 5
//    when watering it the flower can only absorb the 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase with 7.5
//
//The Tree
//    needs water if its current water amount is less then 10
//    when watering it the tree can only absorb the 40% of the water
//    eg. watering with 10 the tree's amount of water should only increase with 4
//
//The Garden
//
//    is able to hold unlimited amount of flowers or trees
//    when watering it should only water those what needs water with equally divided amount amongst them
//    eg. watering with 40 and 4 of them need water then each gets watered with 10
//


public abstract class Plant {
  private int waterlevel;
  private double absorblevel;
  private int minimumWaterlevel;
  private String color;

  public Plant(String color, double absorblevel, int minimumWaterlevel){
    this.color = color;
    this.absorblevel = absorblevel;
    this.minimumWaterlevel = minimumWaterlevel;
    }

  public String getColor() {
    return color;
  }

  public void setWaterlevel(int waterlevel) {
    this.waterlevel += waterlevel;
  }

  public void setAbsorblevel(double absorblevel) {
    this.absorblevel = absorblevel;
  }

  public void setMinimumWaterlevel(int minimumWaterlevel) {
    this.minimumWaterlevel = minimumWaterlevel;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void watering(int amountOfWater){
    waterlevel += (int)(amountOfWater * absorblevel);
  }

  public boolean needsWatering(){
    return(waterlevel < minimumWaterlevel);
  }

}
