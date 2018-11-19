public class PetrolStation {
  String name;
  int gasAmount;

  public PetrolStation(String name){
    this.name = name;
    gasAmount = 200;
  }

  public void refill(Car name){
    this.gasAmount -= name.capacity - name.gasAmount;
    name.gasAmount = name.capacity;
  }

  @Override
  public String toString() {
    return "PetrolStation{" +
        "name='" + name + '\'' +
        ", gasAmount=" + gasAmount +
        '}';
  }
}
