public class Teachers {
  String name;
  String profession;
  int answeredQuestions;
  int teachedLessons;

  public Teachers(String name, String profession){
    this.name = name;
    this.profession = profession;
    answeredQuestions = 0;
    teachedLessons = 0;
  }

  public void teach(Students name){
    name.learn();
    teachedLessons++;
  }

  public void answer(){
    answeredQuestions++;
  }

  @Override
  public String toString() {
    return "Teachers{" +
        "name='" + name + '\'' +
        ", profession='" + profession + '\'' +
        ", answeredQuestions=" + answeredQuestions +
        ", teachedLessons=" + teachedLessons +
        '}';
  }
}
