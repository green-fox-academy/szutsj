public class Main {

  public static void main(String[] args) {
    Bird kanari = new Bird("Kanári");

    System.out.println(kanari);
    kanari.takeoff();
    kanari.fly();
    kanari.land();
    System.out.println(kanari);
    kanari.eat();
    kanari.drink();
    System.out.println(kanari);

    Helicopter elso = new Helicopter();

    System.out.println(elso);
    elso.takeoff();
    System.out.println(elso);
    elso.fly();
    System.out.println(elso);
    elso.land();
    System.out.println(elso);

  }

}

