public class Main {

  public static void main(String[] args) {
    Counter first = new Counter();
    Counter second = new Counter(50);
    Counter third = new Counter(3);

    System.out.println(first.toString());
    System.out.println(second.toString());
    System.out.println(second.toString());

    first.add(50);
    second.add();
    third.add();

    System.out.println(first.toString());
    System.out.println(second.toString());

    System.out.println(third.get());

    third.reset();
    System.out.println(third.toString());
  }
}
