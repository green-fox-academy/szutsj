//Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//    drinkSomeRum() - intoxicates the Pirate some
//    howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//    0 to 4 times, "Pour me anudder!"
//    else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//
//    If you manage to get this far, then you can try to do the following.
//
//    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//
//    And... if you get that far...
//
//    Add a parrot.

public class Pirate {
  private int numberOfPirateOnShip;
  private boolean captain;
  private int rumsDrunken;
  private int drinkSomeRumCalled;
  private boolean passedOut;
  private boolean alive;

  public Pirate(boolean captain, int numberOfPirateOnShip){
    this.captain = captain;
    this.numberOfPirateOnShip = numberOfPirateOnShip;
    rumsDrunken = 0;
    drinkSomeRumCalled = 0;
    passedOut = false;
    alive = true;
  }

  public boolean isCaptain() {
    return captain;
  }

  public void setCaptain(boolean captain) {
    this.captain = captain;
  }

  public int getDrinkSomeRumCalled() {
    return drinkSomeRumCalled;
  }

  public void setDrinkSomeRumCalled(int drinkSomeRumCalled) {
    this.drinkSomeRumCalled = drinkSomeRumCalled;
  }

  public int getRumsDrunken() {
    return rumsDrunken;
  }

  public void setRumsDrunken(int rumsDrunken) {
    this.rumsDrunken = rumsDrunken;
  }

  public boolean isPassedOut() {
    return passedOut;
  }

  public void setPassedOut(boolean passedOut) {
    this.passedOut = passedOut;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public String drinkSumRum(){
    drinkSomeRumCalled++;
    if (!this.isAlive()){
      return "He is dead!";
    } else {
      rumsDrunken += (int)Math.random() * 5 + 1;
      return "";
    }
  }

  public String howsItGoingMate() {
    if (!this.isAlive()){
      return "He is dead!";
    } else if (this.isPassedOut()){
      return "He is already passed out!";
    }else if (drinkSomeRumCalled >= 0 && drinkSomeRumCalled <= 4) {
      return "Pour me anudder!";
    } else {
      setPassedOut(true);
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }
  }

  public void die(){
    setAlive(false);
  }

  public String brawl(Pirate enemy){
    if (!enemy.isAlive() || enemy.isPassedOut() || !this.isAlive() || this.isPassedOut()){
      return "One of the pirates are already dead or passed out, there can be no brawl.";
    } else {
      int resultOfBrawl = (int)(Math.random() * 3);
      if (resultOfBrawl == 0){
        enemy.die();
        return "Our pirate has won.";
      } else if (resultOfBrawl == 1){
        this.die();
        return "Our pirate has lost.";
      } else {
        enemy.setPassedOut(true);
        this.setPassedOut(true);
        return "Both have passed out.";
      }
    }
  }

  @Override
  public String toString() {
    return "Pirate{" +
        "captain=" + captain +
        ", rumsDrunken=" + rumsDrunken +
        ", drinkSomeRumCalled=" + drinkSomeRumCalled +
        ", passedOut=" + passedOut +
        ", alive=" + alive +
        '}';
  }
}
