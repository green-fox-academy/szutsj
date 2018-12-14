public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat(){
    hunger--;
    if (hunger < 0){
      hunger = 0;
    }
  }

  public void drink(){
    thirst--;
    if (thirst < 0){
      thirst = 0;
    }
  }

  public void play(){
    hunger++;
    thirst++;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "hunger=" + hunger +
        ", thirst=" + thirst +
        '}';
  }

}