public class Students {
  String name;
  int learntLessons;
  int askedQuestions;

  public Students(String name){
    this.name = name;
    askedQuestions = 0;
    learntLessons = 0;
  }

  public void learn(){
    learntLessons++;

  }

  public void question(Teachers name){
    name.answer();
    askedQuestions++;
  }

  @Override
  public String toString() {
    return "Students{" +
        "name='" + name + '\'' +
        ", learntLessons=" + learntLessons +
        ", askedQuestions=" + askedQuestions +
        '}';
  }
}
