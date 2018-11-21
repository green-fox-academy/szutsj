//Sharpie Set
//
//    Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//        countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies


public class Main {

  public static void main(String[] args) {
    Sharpie one = new Sharpie("green", 10F);
    Sharpie two = new Sharpie("blue", 10F);
    Sharpie three = new Sharpie("brown", 10F);
    Sharpie four = new Sharpie("pink", 10F);
    Sharpie five = new Sharpie("white", 10F);
    Sharpie six = new Sharpie("black", 10F);

    SharpieSet firstSet = new SharpieSet();

    firstSet.add(one);
    firstSet.add(two);
    firstSet.add(three);
    firstSet.add(four);
    firstSet.add(five);
    firstSet.add(six);

    firstSet.print();
    System.out.println();

    one.use();
    one.use();
    one.use();
    one.use();
    one.use();

    firstSet.print();


    System.out.println(firstSet.countUsable());

    firstSet.removeTrash();

    firstSet.print();

  }
}
