//Create a PostIt class that has
//    a backgroundColor
//    a text on it
//    a textColor
//    Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"


public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  public void print(){
    System.out.println("On " + backgroundColor + " backgroundcolor, " + " with " + textColor + " textcolor: " + text);
  }


}