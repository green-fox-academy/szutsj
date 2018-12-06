//Aircrafts
//
//    Create a class that represents an aircraft
//    There are 2 types of aircrafts: F16 and F35
//    Both aircraft should track how many ammo it has
//
//Methods:
//    fight
//
//    It should use all the ammos (set it to 0) and it should return the damage it deals
//    The damage is the multiplication of the base damage and the ammos
//
//    refill
//
//    It should take a number as parameter and substract as much ammo as possibe
//    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
//    It should return the remaining ammo
//    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
//
//    getType
//
//    It should return it's type as a string
//
//    getStatus
//
//    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
//
//    isPriority
//
//    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
//


public abstract class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private int allDamage;
  private String type;

  public int getAmmo() {
    return ammo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType(){
    return type;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }

  public int fight(){
    int ammo = this.ammo;
    allDamage += ammo * baseDamage;
    this.ammo = 0;
    return ammo * baseDamage;
  }

  public int refill(int numberOfAmmosToRefill){
    int missingAmmos = maxAmmo - ammo;
    int remainingAmmo = 0;
    if (numberOfAmmosToRefill >= missingAmmos){
      ammo += missingAmmos;
      remainingAmmo += numberOfAmmosToRefill - missingAmmos;
    } else {
      ammo += numberOfAmmosToRefill;
      remainingAmmo = 0;
    }
    return remainingAmmo;
  }

  public String getStatus(){
    String status = "";
    status += "Type: " + this.type + ", Ammo: " + ammo + " Base damage: " + baseDamage + " All damage: " + allDamage + "\n";
    return status;
  }

  public boolean isPriority(){
    return false;
  }

}
