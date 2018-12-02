public class Mentor {

  private String name;
  private int age;
  private String gender;
  private String level;

  public Mentor(String name, int age, String gender, String level){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + " a " + age + " old " + gender + " " + level + " mentor.");
  }

  public void getGoal(){
    System.out.println("My goal is to educate brilliant junior software developers.");
  }

}
