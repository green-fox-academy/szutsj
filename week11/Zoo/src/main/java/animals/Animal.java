package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private String sound;
  private int hungerLevel;


  public Animal(String name){
    this.name = name;
    this.hungerLevel = 0;
  }

  public abstract String breed();

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      age = 0;
    }
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public int getHungerLevel() {
    return hungerLevel;
  }

  public void setHungerLevel(int hungerLevel) {
    this.hungerLevel = hungerLevel;
  }

}
