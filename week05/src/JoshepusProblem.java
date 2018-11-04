import java.util.ArrayList;
import java.util.Scanner;

public class JoshepusProblem {

    public static void main(String[] args) {
        System.out.println("Please, give me the number of persons: ");
        Scanner scannerInt = new Scanner(System.in);
        int numberOfPersons = scannerInt.nextInt();
        System.out.println("Joshepus should stand on the following \"winning-seat\": " + joshepusproblem(numberOfPersons));
    }

    public static String joshepusproblem(int numberOfPersons) {
        ArrayList<String> winningSeat = new ArrayList<>();
        for (int i = 0; i < numberOfPersons; i++) {
            winningSeat.add(String.valueOf(i + 1));
        }
        int nextToBeKilled = 1;
        for (int i = 0; i < numberOfPersons -1; i++) {
            winningSeat.remove(nextToBeKilled);
            nextToBeKilled++;
            if (nextToBeKilled == winningSeat.size() + 1){
                nextToBeKilled = 1;
            } else if (nextToBeKilled == winningSeat.size()){
                nextToBeKilled = 0;
            }
        }
        return String.valueOf(winningSeat);
    }
}