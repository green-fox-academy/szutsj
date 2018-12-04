//The Garden
//
//    is able to hold unlimited amount of flowers or trees
//    when watering it should only water those what needs water with equally divided amount amongst them
//    eg. watering with 40 and 4 of them need water then each gets watered with 10
//


import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants;

  public Garden(){
    plants = new ArrayList<>();
  }

  public void addPlantToGarden(String plant, String color){
    if (plant.toLowerCase().equals("tree")){
      plants.add(new Tree(color));
    } else if (plant.toLowerCase().equals("flower")) {
      plants.add(new Flower(color));
    } else {
      System.out.println("This is a garden, you only can add flowers or trees");
    }
  }

  public void watering(int amountOfWater) {
    System.out.println("Watering with " + amountOfWater);
    int numberOfPlantsToWater = 0;

    for (Plant plant : plants) {
      if (plant.needsWatering()) {
        numberOfPlantsToWater++;
      }
    }

    for (Plant plant : plants) {
      if (plant.needsWatering()) {
        plant.watering(amountOfWater / numberOfPlantsToWater);
      }
    }
  }

  public void print(){
    for (Plant plant : plants){
      System.out.print("The " + plant.getColor());
      System.out.print((plant instanceof Flower) ? " Flower" : " Tree");
      System.out.println(plant.needsWatering() ? " needs water. " : " doesn't need water. ");
    }
  }
}
