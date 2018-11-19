//Petrol Station
//
//    Create Station and Car classes
//    Station
//    gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//    Car
//    gasAmount
//    capacity
//    create constructor for Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100


public class Main {

  public static void main(String[] args) {
    PetrolStation one = new PetrolStation("one");
    PetrolStation two = new PetrolStation("two");
    Car car1 = new Car("KJA153");
    Car car2 = new Car("HJZ193");
    Car car3 = new Car("KMF279");

    System.out.println(one);
    System.out.println(two);
    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println();

    one.refill(car1);
    one.refill(car2);
    two.refill(car3);

    System.out.println(one);
    System.out.println(two);
    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println();

    car1.runs(20);

    System.out.println(car1);
    System.out.println();

    two.refill(car1);

    System.out.println(car1);
    System.out.println(two);
  }
}