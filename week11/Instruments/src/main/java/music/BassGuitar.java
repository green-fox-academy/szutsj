package main.java.music;

public class BassGuitar extends StringedInstrument {
  public static final String  name = "Bass Guitar";
  public static final String sound = "Duum-duum-duum";

  public BassGuitar(){
    super(name, 4, sound);
  }

  public BassGuitar(int strings){
    super(name, strings, sound);
  }


}
