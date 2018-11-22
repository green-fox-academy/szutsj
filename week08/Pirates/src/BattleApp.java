
//Create a BattleApp class with a main method
//    Create 2 ships, fill them with pirates
//    Have a battle!
//

public class BattleApp {

  public static void main(String[] args) {
    PirateShip first = new PirateShip("first");
    PirateShip second = new PirateShip("second");

    first.fillShip();
    first.print();

    second.fillShip();
    second.print();

    System.out.println(second.getPirateShip().get(1));
    System.out.println(first.getPirateShip().get(2));
    System.out.println(second.getPirateShip().get(1).brawl(first.getPirateShip().get(2)));
    System.out.println(second.getPirateShip().get(1));
    System.out.println(first.getPirateShip().get(2));
    System.out.println();

    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println(first.getPirateShip().get(0));
    System.out.println(first.getPirateShip().get(0).drinkSumRum());
    System.out.println(first.getPirateShip().get(0).howsItGoingMate());
    System.out.println();


    System.out.println(first.battle(second));
    System.out.println();
    first.print();
    second.print();
  }
}
