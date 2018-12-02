public class Sponsor {

  private String name;
  private int age;
  private String gender;
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }


  public void introduce(){
    System.out.println("Hi, I'm " + name + " a " + age + " old " + gender + " who perpresents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal(){
    System.out.println("My goal is to hire brilliant junior software developers.");
  }

  public void hire(){
    hiredStudents++;
  }

}
