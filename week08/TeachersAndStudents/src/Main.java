
//Create Student and Teacher classes
//    Student
//    learn()
//    question(teacher) -> calls the teachers answer method
//    Teacher
//    teach(student) -> calls the students learn method
//    answer()


public class Main {

  public static void main(String[] args) {

    Teachers Mag = new Teachers("Mag", "Mathematics");
    Teachers Tom = new Teachers("Tom", "English");
    Teachers Ian = new Teachers("Ian", "Literature");
    Students Ben = new Students("Ben");
    Students Angie = new Students("Angie");
    Students Tod = new Students("Tod");

    System.out.println(Mag);
    System.out.println(Tom);
    System.out.println(Ian);
    System.out.println(Ben);
    System.out.println(Angie);
    System.out.println(Tod);
    System.out.println();

    Angie.question(Tom);
    Mag.teach(Tod);
    Angie.question(Ian);
    Tod.question(Mag);
    Ian.teach(Ben);

    System.out.println(Mag);
    System.out.println(Tom);
    System.out.println(Ian);
    System.out.println(Ben);
    System.out.println(Angie);
    System.out.println(Tod);
  }


}

