
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

    Pirate pirate1 = second.getPirateShip().get(1);
    Pirate pirate2 = first.getPirateShip().get(2);

    System.out.println(pirate1);
    System.out.println(pirate2);
    System.out.println(pirate1.brawl(pirate2));
    System.out.println(pirate1);
    System.out.println(pirate2);
    System.out.println();

    System.out.println(first.battle(second));
    System.out.println();
    first.print();
    second.print();
  }
}
