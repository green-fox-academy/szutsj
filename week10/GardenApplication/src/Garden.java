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

  public void addPlantToGarden(Plant newPlant){
    plants.add(newPlant);
  }

  public void watering(int amountOfWater) {
    System.out.println("Watering with " + amountOfWater);
        for (Plant plant : plants) {
      if (plant.needsWatering()) {
        plant.watering(amountOfWater / getThrirstyPlantsAmount());
      }
    }
  }

  public int getThrirstyPlantsAmount(){
    int numberOfPlantsToWater = 0;

    for (Plant plant : plants) {
      if (plant.needsWatering()) {
        numberOfPlantsToWater++;
      }
    }
    return numberOfPlantsToWater;
  }

  public void print(){
    for (Plant plant : plants){
      System.out.print("The " + plant.getColor());
      System.out.print((plant instanceof Flower) ? " Flower" : " Tree");
      System.out.println(plant.needsWatering() ? " needs water. " : " doesn't need water. ");
    }
  }
}
