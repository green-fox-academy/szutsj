public class Student {

  private String name;
  private int age;
  private String gender;
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "SchoolOfLife";
    skippedDays = 0;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + " a " + age + " old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " from the course already.");
  }

  public void getGoal(){
    System.out.println("My goal is to be a junior software developer.");
  }

  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }

}
