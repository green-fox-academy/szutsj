//
//Create a WarApp class with a main method
//    Create 2 armadas, fill them with ships
//    Have a war!


public class WarApp {

  public static void main(String[] args) {
    Armada firstArmada = new Armada("firstArmada");
    Armada secondAramada = new Armada("secondArmada");
    PirateShip firstShip = new PirateShip("firstShip");
    PirateShip secondShip = new PirateShip("secondShip");
    PirateShip thirdShip = new PirateShip("thirdShip");
    PirateShip fourthShip = new PirateShip("fourthShip");
    PirateShip fifthShip = new PirateShip("fifthShip");
    PirateShip sixthShip = new PirateShip("firstShip");
    PirateShip seventhShip = new PirateShip("seventhShip");

    fifthShip.fillShip();
    secondShip.fillShip();
    thirdShip.fillShip();
    firstShip.fillShip();
    fourthShip.fillShip();
    sixthShip.fillShip();
    seventhShip.fillShip();

    firstArmada.getArmada().add(firstShip);
    firstArmada.getArmada().add(secondShip);
    secondAramada.getArmada().add(thirdShip);
    secondAramada.getArmada().add(fourthShip);
    secondAramada.getArmada().add(fifthShip);
    secondAramada.getArmada().add(sixthShip);
    secondAramada.getArmada().add(seventhShip);

    firstArmada.print();
    secondAramada.print();
    System.out.println();
    System.out.println(firstArmada.war(secondAramada));
    firstArmada.print();
    secondAramada.print();


  }


}
