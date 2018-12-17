
public class ToDoApp {

  public static void main(String[] args) {

    ListOfTasks list = new ListOfTasks();

    if (args.length == 0){
      System.out.println(list.usage());
    } else if (args[0].equals("-l")){
      list.list();
    } else if (args[0].equals("-a")){
      list.add(args[1]);
    } else if (args[0].equals("-r")){
      list.remove(Integer.parseInt(args[1]));
    } else if (args[0].equals("-c")){
      list.complete(Integer.parseInt(args[1]));
    } else {
      System.out.println("Sorry, there is no such option. Please, see options below:");
      System.out.println(list.usage());
    }

  }
}
