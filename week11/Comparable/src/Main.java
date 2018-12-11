import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();

    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 3));
    dominoes.add(new Domino(7, 1));
    dominoes.add(new Domino(7, 1));
    dominoes.add(new Domino(7, 2));

    Collections.sort(dominoes);

    System.out.println(dominoes);

    List<Thing> fleet = new ArrayList<>();

    fleet.add(new Thing("Get Milk"));
    fleet.add(new Thing("Remove obstacles"));
    fleet.add(new Thing("Stand up"));
    fleet.add(new Thing("Eat lunch"));

    fleet.get(1).complete();
    fleet.get(3).complete();

    System.out.println(fleet);

    Collections.sort(fleet);
    System.out.println(fleet);

// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]

  }
}
