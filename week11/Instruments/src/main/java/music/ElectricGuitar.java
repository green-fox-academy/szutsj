package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public static final String  name = "Electric Guitar";
  public static final String sound = "Twang";

  public ElectricGuitar(){
    super(name, 6, sound);
  }

  public ElectricGuitar(int strings){
    super(name, strings, sound);
  }

}
