import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {

    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(planetList);
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList<String> putSaturn(ArrayList<String> planetList){
        planetList.add(planetList.indexOf("Jupiter") + 1, "Saturn");
        return planetList;
    }
}
