public class Main {

  public static void main(String[] args) {
    Gnirts elso = new Gnirts("Próba");

    System.out.println(elso.length());

    System.out.println(elso.charAt(0));
    System.out.println(elso.charAt(1));
    System.out.println(elso.charAt(2));
    System.out.println(elso.charAt(3));
    System.out.println(elso.charAt(4));

    System.out.println((elso.subSequence(2, 4)));

    Shifter masodik = new Shifter("EzIsPróba", 3);

    System.out.println(masodik.length());

    System.out.println(masodik.charAt(0));

    System.out.println(masodik.subSequence(2, 4));
  }

}
