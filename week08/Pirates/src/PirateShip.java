//The place for the Pirates
//
//    Create a Ship class.
//    The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//    When a ship is created it doesn't have a crew or a captain.

//    The ship can be filled with pirates and a captain via fillShip() method.
//    Filling the ship with a captain and random number of pirates.

//    Ships should be represented in a nice way on command line including information about
//    captains consumed rum, state (passed out / died)
//    number of alive pirates in the crew

//    Ships should have a method to battle other ships: ship.battle(otherShip)
//    should return true if the actual ship (this) wins
//    the ship should win if its calculated score is higher
//    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//    The loser crew has a random number of losses (deaths).
//    The winner captain and crew has a party, including a random number of rum :)
//

import java.util.ArrayList;

public class PirateShip {
  private ArrayList<Pirate> pirateShip = new ArrayList<>();
  private String shipsName;

  public PirateShip(String shipsName){
    this.shipsName = shipsName;
  }

  public String getShipsName() {
    return shipsName;
  }

  public ArrayList<Pirate> getPirateShip() {
    return pirateShip;
  }

  public void fillShip(){
    int numberOfPirates = (int)(Math.random() * 15) + 1;
    for (int i = 0; i < numberOfPirates; i++) {
       if (i == 0){
         pirateShip.add(new Pirate(true, i));
       } else {
         pirateShip.add(new Pirate(false, i));
       }
    }
  }

  public void print(){
    int numberOfPiratesAlive = 0;
    int sumOfRumDrunkenByPirates = 0;
    for (int i = 1; i < pirateShip.size(); i++) {
      if (pirateShip.get(i).isAlive()) {
        numberOfPiratesAlive++;
      }
      sumOfRumDrunkenByPirates += pirateShip.get(i).getRumsDrunken();
    }
    System.out.println("Ship - " + this.shipsName);
    System.out.println("Captain's status:");
    System.out.println(" -alive: " + pirateShip.get(0).isAlive());
    System.out.println(" -passed out: " + pirateShip.get(0).isPassedOut());
    System.out.println(" -rums drunken " + pirateShip.get(0).getRumsDrunken());
    System.out.println("Crew: ");
    System.out.println( "- " + numberOfPiratesAlive + " pirate(s) is/are alive.");
    System.out.println("- " + sumOfRumDrunkenByPirates + " rum(s) has/have been drunken by them.");
    System.out.println();
  }

  public boolean battle(PirateShip enemy){
    int ourNumberOfAliveCrew = 0;
    int enemyNumberOfAilveCrew = 0;
    int ourScore;
    int enemyScore;
    boolean win;
    int rum = (int)(Math.random() * 15) + 1;

    for (int i = 0; i < this.pirateShip.size(); i++) {
      if (this.pirateShip.get(i).isAlive()){
        ourNumberOfAliveCrew++;
      }
    }

    for (int i = 0; i < enemy.pirateShip.size(); i++) {
      if (enemy.pirateShip.get(i).isAlive()){
        enemyNumberOfAilveCrew++;
      }
    }

    ourScore = ourNumberOfAliveCrew - this.pirateShip.get(0).getRumsDrunken();
    enemyScore = enemyNumberOfAilveCrew - enemy.pirateShip.get(0).getRumsDrunken();

    if (ourScore >= enemyScore){
      win = true;
      party(this, rum);
      losingMates(enemy);
    } else {
      win = false;
      party(enemy, rum);
      losingMates(this);
    }
  return win;
  }

  public static void losingMates(PirateShip pirateship){
    for (int i = 0; i < pirateship.pirateShip.size(); i++) {
      int dead = (int)(Math.random() * 2);
      if (dead == 0){
        pirateship.pirateShip.get(i).setAlive(false);
      }
    }
  }

  public static void party(PirateShip piratship, int rum){
    int j = 0;
    for (int i = 0; i < rum; i++) {
      piratship.pirateShip.get(j).setRumsDrunken(1);
      j++;
      if (j == piratship.pirateShip.size()){
        j = 0;
      }
    }
  }

  @Override
  public String toString() {
    return "PirateShip{" +
        "pirateShip=" + pirateShip +
        '}';
  }
}
