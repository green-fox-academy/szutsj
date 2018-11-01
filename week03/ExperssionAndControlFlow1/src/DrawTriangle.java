import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("How many rows do you want in the triangle?");
        int numberIn = scannerInt.nextInt();
        String starsToDraw ="*";
        for (int i = 0; i < numberIn; i++){
            System.out.print(starsToDraw);
            System.out.println();
            starsToDraw += "*";
            }
    }
}
