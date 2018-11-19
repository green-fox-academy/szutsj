public class Car {
  String rendszam;
  int gasAmount;
  int capacity;

  public Car(String rendszam){
    this.rendszam = rendszam;
    gasAmount = 0;
    capacity = 100;
  }

  public void runs(int km){
    if ((gasAmount - km * 2) < 0){
      gasAmount = 0;
    } else {
      gasAmount = gasAmount - km * 2;
    }
  }

  @Override
  public String toString() {
    return "Car{" +
        "rendszam='" + rendszam + '\'' +
        ", gasAmount=" + gasAmount +
        ", capacity=" + capacity +
        '}';
  }
}
