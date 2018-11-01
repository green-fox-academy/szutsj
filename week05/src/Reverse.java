import java.lang.String;

public class Reverse {

    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow enetnes siht .dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    public static String reverse(String reversed) {
        String hasBeenReversed = " ";
        String letter;
        for (int i = 0; i < reversed.length(); i++) {
            letter = Character.toString(reversed.charAt(reversed.length() - i -1));
            hasBeenReversed = hasBeenReversed.concat(letter);
        }
        return hasBeenReversed;
    }
}
