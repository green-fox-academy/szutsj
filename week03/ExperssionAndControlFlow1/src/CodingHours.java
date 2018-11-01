
public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("An attende codes in a semester:" + 6 * 17 * 5 + " hours");
        System.out.print("The avegare of coding hours is:");
        System.out.printf("%.2f", 6. * 5. / 52. * 100);
        System.out.println("%");

    }
}

