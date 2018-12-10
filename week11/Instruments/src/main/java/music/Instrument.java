
//it reserves (e.g. protected) the name of the instrument
//    it should provide a play() method.


package main.java.music;

public abstract class Instrument {
  private String name;
  private int strings;
  private String sound;

  public Instrument(String name, int strings, String sound){
    this.name = name;
    this.strings = strings;
    this.sound = sound;
  }

  public abstract void play();

  public String getName() {
    return name;
  }

  public int getStrings() {
    return strings;
  }

  public String getSound() {
    return sound;
  }

}
