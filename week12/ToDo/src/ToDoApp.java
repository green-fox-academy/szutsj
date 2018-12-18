
public class ToDoApp {

  public static void main(String[] args) {

    ListOfTasks list = new ListOfTasks();
    ArgumentsCheck check = new ArgumentsCheck();

    if (args.length == 0){
      System.out.println(list.usage());
    } else if (args[0].equals("-l")){
      check.argumentL(args);
    } else if (args[0].equals("-a")){
      check.argumentA(args);
    } else if (args[0].equals("-r")){
      check.argumentR(args);
    } else if (args[0].equals("-c")){
     check.argumentC(args);
    } else {
      System.out.println("Sorry, there is no such option. Please, see options below:");
      System.out.println(list.usage());
    }

  }
}
