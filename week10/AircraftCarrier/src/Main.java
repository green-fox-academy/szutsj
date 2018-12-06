public class Main {

  public static void main(String[] args) {
    F16 elsoF16 = new F16();
    F16 masodikF16 = new F16();
    F35 elsoF35 = new F35();
    F35 masodikF35 = new F35();
    F16 firstF16 = new F16();
    F16 secondF16 = new F16();
    F35 firstF35 = new F35();
    F35 secondF35 = new F35();
    Carrier first = new Carrier(20, 20);
    Carrier second = new Carrier(30, 30);

    System.out.println(elsoF16.getStatus());
    System.out.println(elsoF16.refill(10));
    System.out.println(elsoF16.getStatus());
    System.out.println(masodikF16.getStatus());
    System.out.println(masodikF16.refill(10));
    System.out.println(masodikF16.getStatus());

    masodikF16.fight();
    System.out.println(masodikF16.getStatus());
    System.out.println(elsoF16.getStatus());

    first.add(elsoF16);
    first.add(masodikF16);
    first.add(elsoF35);
    first.add(masodikF35);

    second.add(firstF16);
    second.add(secondF16);
    second.add(firstF35);
    second.add(secondF35);

    System.out.println(first.getStatus());
    System.out.println(second.getStatus());

    first.fill();
    second.fill();

    System.out.println(first.getStatus());
    System.out.println(second.getStatus());

    first.fight(second);

    System.out.println(first.getStatus());
    System.out.println(second.getStatus());
    }

}
