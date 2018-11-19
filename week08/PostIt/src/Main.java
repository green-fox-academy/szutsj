public class Main {

  public static void main(String[] args) {
    PostIt postIt1 = new PostIt();
    postIt1.backgroundColor = "orange";
    postIt1.textColor = "blue";
    postIt1.text = "Idea 1";

    PostIt postIt2 = new PostIt();
    postIt2.backgroundColor = "pink";
    postIt2.textColor = "black";
    postIt2.text = "Awesome";

    PostIt postIt3 = new PostIt();
    postIt3.backgroundColor = "yellow";
    postIt3.textColor = "green";
    postIt3.text = "Suberb!";

    postIt1.print();
    postIt2.print();
    postIt3.print();
  }
}
