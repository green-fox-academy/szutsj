public class Bird implements Flyable {
  private String species;
  private int age;
  private int hungerLevel;
  private int thirstLevel;

  public Bird(String species){
    this.species = species;
    this.age = 0;
    this.hungerLevel = 0;
    this.thirstLevel = 0;
  }

  @Override
  public void land() {
    System.out.println("Hey, I'm home!");
  }

  @Override
  public void fly() {
    thirstLevel++;
    hungerLevel++;
  }

  @Override
  public void takeoff() {
    hungerLevel += 2;
    thirstLevel += 3;
  }

  public void eat(){
    hungerLevel = 0;
  }

  public void drink(){
    thirstLevel = 0;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String Species) {
    this.species = species;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHungerLevel() {
    return hungerLevel;
  }

  public void setHungerLevel(int hungerLevel) {
    this.hungerLevel = hungerLevel;
  }

  public int getThirstLevel() {
    return thirstLevel;
  }

  public void setThirstLevel(int thirstLevel) {
    this.thirstLevel = thirstLevel;
  }

  @Override
  public String toString() {
    return "Bird{" +
        "species='" + species + '\'' +
        ", age=" + age +
        ", hungerLevel=" + hungerLevel +
        ", thirstLevel=" + thirstLevel +
        '}';
  }

}
