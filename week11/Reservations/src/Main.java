import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Reservation> list = new ArrayList<>();

    for (int i = 0; i < 25; i++) {
      list.add(new Reservation());
    }

    for (Reservation reservation : list){
      System.out.println(reservation);
    }
  }
}
