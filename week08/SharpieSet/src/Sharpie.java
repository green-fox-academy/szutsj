public class Sharpie {
  public String color;
  public Float width;
  public Float inkAmout;

  public Sharpie(String color, Float width){
    this.color = color;
    this.width = width;
    this.inkAmout = 5F;
  }

  public void use(){
    inkAmout--;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
        "color='" + color + '\'' +
        ", width=" + width +
        ", inkAmout=" + inkAmout +
        '}';
  }
}