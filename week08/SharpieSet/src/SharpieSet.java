import java.util.ArrayList;

public class SharpieSet {

  public ArrayList<Sharpie> sharpieSet = new ArrayList<>();

  public void add(Sharpie name){
    sharpieSet.add(name);
  }

  public int countUsable(){
    int numberOfUsable = 0;
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (sharpieSet.get(i).inkAmout > 0){
        numberOfUsable++;
      }
    }
    return numberOfUsable;
  }

  public void removeTrash(){
    if (sharpieSet.size() == 0){
      return;
    } else {
      for (int i = 0; i < sharpieSet.size(); i++) {
        if (sharpieSet.get(i).inkAmout <= 0){
          sharpieSet.remove(i);
          i--;
        }
      }
    }
  }

  public void print(){
    for (int i = 0; i < sharpieSet.size() ; i++) {
      System.out.println(sharpieSet.get(i).toString());
    }
  }
}
