//Create an Armada class
//Contains Ship-s as a list
//    Have a armada.war(otherArmada) method where two armada can engage in war
//    it should work like merge sort
//    first ship from the first armada battles the first of the other
//    the loser gets skipped so the next ship comes in play from that armada
//    whichever armada gets to the end of its ships loses the war
//    return true if this is the winner
//

import java.util.ArrayList;

public class Armada {
  private ArrayList<PirateShip> armada = new ArrayList<>();
  private String armadasName;

  public Armada(String armadasName){
    this.armadasName = armadasName;
  }

  public ArrayList<PirateShip> getArmada() {
    return armada;
  }

  public boolean war(Armada enemy){
    boolean win = true;

    for (int i = 0; i < this.armada.size(); i++) {
      for (int j = 0; j < enemy.armada.size(); j++) {
        if (this.armada.get(i).battle(enemy.armada.get(j))) {
          enemy.armada.remove(j);
          j--;
          if (j < 0) {
            j = 0;
          }
        } else {
          this.armada.remove(i);
          i--;
          if (i < 0) {
            i = 0;
          }
        }
      }
      if (this.armada.size()== 0){
        win = false;
      } else if (enemy.armada.size() == 0){
        win = true;
      }
    }
    return win;
  }

  public void print(){
    System.out.println("Aramada - " + this.armadasName);
    for (int i = 0; i < this.armada.size(); i++) {
      System.out.println(this.armada.get(i).getShipsName());
    }
  }
}
