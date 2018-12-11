public abstract class Vehicle implements Flyable {
  private String type;
  private int maxSpeed;
  private int actualSpeed;


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int getActualSpeed() {
    return actualSpeed;
  }

  public void setActualSpeed(int actualSpeed) {
    this.actualSpeed = actualSpeed;
  }

}
