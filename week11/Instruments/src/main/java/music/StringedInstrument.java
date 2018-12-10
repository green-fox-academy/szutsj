
//introduces numberOfStrings and
//    sound() method what's implementation is yet unknown
//    but with the help of the sound() the play() method is fully implementable


package main.java.music;

public abstract class StringedInstrument extends Instrument {

  public StringedInstrument(String name, int strings, String sound) {
    super(name, strings, sound);
  }

  public String sound(){
    return getSound();
  }

  @Override
  public void play() {
    System.out.print(getName() + ", a " + getStrings() + "-stringed instrument that goes " + sound()+ "\n");
  }

}
