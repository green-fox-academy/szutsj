public class Sharpie {
  String color;
  Float width;
  Float inkAmout;

  public Sharpie(String color, Float width){
    this.color = color;
    this.width = width;
    this.inkAmout = 100F;
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