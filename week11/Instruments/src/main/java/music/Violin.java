package main.java.music;

public class Violin extends StringedInstrument {
  public static final String  name = "Violin";
  public static final String sound = "Screech";

  public Violin(){
    super(name, 4, sound);
  }

  public Violin(int strings){
    super(name, strings, sound);
  }

}
