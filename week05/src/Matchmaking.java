import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList<String> pairs = new ArrayList<>();
        int minSizeOfArrayList = getMin(girls.size(), boys.size());
        for (int i = 0; i < minSizeOfArrayList ; i++) {
            if (i < girls.size()) {
                pairs.add(girls.get(i));
            }
            if (i < boys.size()){
                pairs.add(boys.get(i));
            }
        }
        return pairs;
    }

    public static int getMin(int girls, int boys){
        int min;
        if (girls > boys){
            min = girls;
        } else {
            min = boys;
        }
        return min;
    }
}
