import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, World!");
        Scanner UserNameIn = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét:");
        String UserName = UserNameIn.nextLine();
        System.out.println("Hello," + UserName);

    }
}