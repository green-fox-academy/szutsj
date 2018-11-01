import java.util.*;

public class StudentCounter {

    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies

        hasMoreThanFourCandies(map);
        sumOfAgePossesingLessThanFiveCandies(map);
    }

    public static void hasMoreThanFourCandies(ArrayList<Map<String, Object>> map) {
        System.out.printf("The students who have more than four candies: ");
        Object nulla = 0;
        Object one = 1;
        Object two = 2;
        Object three = 3;
        Object four = 4;
        for (int i = 0; i < map.size(); i++) {
            if (!nulla.equals(map.get(i).get("candies")) && !one.equals(map.get(i).get("candies")) && !two.equals(map.get(i).get("candies")) && !three.equals(map.get(i).get("candies")) && !four.equals(map.get(i).get("candies"))) {
                System.out.print(map.get(i).get("name") + ", ");
            }
        }
        System.out.println();
    }


    public static void sumOfAgePossesingLessThanFiveCandies(ArrayList<Map<String, Object>> map) {
        System.out.print("The age of the students who have less than five candies is : ");
        int numberOfCandies;
        double sumOfAgeDouble = 0;
        int sumOfAgeInt = 0;
        for (int i = 0; i < map.size(); i++) {
            numberOfCandies = (int) map.get(i).get("candies");
            if (numberOfCandies < 5) {
                if (map.get(i).get("age").getClass().equals(java.lang.Double.class)) {
                    sumOfAgeDouble += (double) map.get(i).get("age");
                } else {
                    sumOfAgeInt += (int) map.get(i).get("age");
                }
            }
        }
        sumOfAgeDouble += sumOfAgeInt;
        System.out.println(sumOfAgeDouble);
    }
}
