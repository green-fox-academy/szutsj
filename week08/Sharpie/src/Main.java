public class Main {

  public static void main(String[] args) {
    Sharpie first = new Sharpie("blue", 10F);
    Sharpie second = new Sharpie("green", 6.5F);

    System.out.println(first.toString());
    System.out.println(second.toString());

    first.use();
    first.use();
    first.use();
    first.use();
    first.use();
    first.use();
    second.use();

    System.out.println(first.toString());
    System.out.println(second.toString());
  }
}
