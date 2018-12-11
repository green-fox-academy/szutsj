public class Helicopter extends Vehicle {
  private int fleightHeight;
  private int fliedHours;

  public Helicopter(){
    super();
    this.setType("Helicopter");
    this.setMaxSpeed(1000);
    this.fliedHours = 0;

  }

  @Override
  public void land() {
    this.setActualSpeed(0);
    this.fleightHeight = 0;
  }

  @Override
  public void fly() {
    fliedHours += 2;
  }

  @Override
  public void takeoff() {
    this.fleightHeight = 10000;
    this.setActualSpeed(1000);

  }

  @Override
  public String toString() {
    return String.format("%s: maximum speed: %d, flied hours so far: %d. Its actual speed is %d and its actual flying height is: %d.", getType(), getMaxSpeed(), fliedHours, getActualSpeed(), fleightHeight);
  }
}
