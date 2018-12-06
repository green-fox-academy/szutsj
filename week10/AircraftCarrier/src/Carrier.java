//Create a class that represents an aircraft-carrier
//
//    The carrier should be able to store aircrafts
//    Each carrier should have a store of ammo represented as number
//    The inital ammo should be given by a parameter in it's constructor
//    The carrier also has a health point given in it's constructor as well
//
//    Methods:
//    add
//
//    It should take a new aircraft and add it to its store
//
//    fill
//
//    It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
//    If there is not enough ammo than it should start to fill the aircraftis with priority first
//    If there is no ammo when this method is called it should throw an exception
//
//    fight
//
//    It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
//
//    getStatus
//
//    It should give back a string about it's and all of its aircrafts status like:
//
//    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
//    Aircrafts:
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//
//    If the health points are 0 than it should give back: It's dead Jim :(

import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircraft> carrier;
  private int storedAmmos;
  private int health;

  public Carrier(int storedAmmos, int health){
    this.carrier = new ArrayList<>();
    this.storedAmmos = storedAmmos;
    this.health = health;
  }

  public void add(Aircraft aircraft){
    carrier.add(aircraft);
  }

  public void fill(){

    while (canBeRefilled()){

      for (Aircraft aircraft : carrier) {
        if (aircraft.isPriority()) {
          storedAmmos = aircraft.refill(storedAmmos);
        }
        if (!canBeRefilled()) {
          break;
        }
      }

      for (Aircraft aircraft : carrier) {
        storedAmmos = aircraft.refill(storedAmmos);
        if (!canBeRefilled()) {
          break;
        }
      }
    }
    System.out.println("Sorry, there are no ammos left.");
  }

  public boolean canBeRefilled(){
    int toBeRefilled = 0;

    for (Aircraft aircraft : carrier){
      toBeRefilled += aircraft.getMaxAmmo() - aircraft.getAmmo();
    }
    return (storedAmmos > 0 && toBeRefilled > 0);
  }

  public void fight(Carrier enemy){
    if (this.health == 0){
      System.out.println("This carrier can not fight anymore, it's dead...");
    } else if (enemy.health == 0){
      System.out.println("The enemy carrier is already dead, there can be no fight...");
    } else {

      for (Aircraft aircraft : this.carrier){
        aircraft.setAllDamage(aircraft.getAmmo() * aircraft.getBaseDamage());
        enemy.health -= aircraft.getAmmo() * aircraft.getBaseDamage();
        aircraft.setAmmo(0);
      }
    }
  }

  public String getStatus(){
    String status = "";
    int totalDamage = 0;

    if (this.health <= 0) {
      status += "It's dead Jim :( ";
    } else {
      status += "HP: " + this.health + ", Aircraft count: " + this.carrier.size() + ", Ammo storage: " + this.storedAmmos + ", Total damage: ";

      for (Aircraft aircraft : this.carrier){
        totalDamage += aircraft.getAllDamage();
      }

      status += totalDamage + "\n" + "Aircrafts: " + "\n";

      for (Aircraft aircraft : this.carrier){
        status += "Tpye: " + aircraft.getType() + ", Ammo: " + aircraft.getAmmo() + ", Base damage: " + aircraft.getBaseDamage() + ", All damage: " + aircraft.getAllDamage() + "\n";
      }
    }
    return status;
  }

}
