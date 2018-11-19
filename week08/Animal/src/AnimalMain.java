public class AnimalMain {

  public static void main(String[] args) {
    Animal cat = new Animal();
    Animal dog = new Animal();
    Animal bird = new Animal();

    System.out.println(cat.toString());
    System.out.println(dog.toString());
    System.out.println(bird.toString());

    cat.drink();
    dog.eat();
    bird.play();

    System.out.println(cat.toString());
    System.out.println(dog.toString());
    System.out.println(bird.toString());
  }
}
