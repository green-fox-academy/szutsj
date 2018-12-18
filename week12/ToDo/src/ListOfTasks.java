import java.io.Serializable;
import java.util.ArrayList;

public class ListOfTasks implements Serializable {

  private ArrayList<Task> toDoList = new ArrayList<Task>();
  private String filename = "todolist.txt";

  public void add(String description){
    ListOfTasks list = FileHandling.readingFile(filename);
    Task task = new Task(description);
    list.toDoList.add(task);
    FileHandling.writingFile(filename, list);
  }

  public void remove(int index){
    ListOfTasks list = FileHandling.readingFile(filename);
    list.toDoList.remove(index);
    FileHandling.writingFile(filename, list);
  }

  public void list(){
    ListOfTasks list = FileHandling.readingFile(filename);
    if (list.toDoList.size() == 0){
      System.out.println("Nothing to do");
    } else {
      System.out.println(list.toString());
    }
  }

  public void complete(int index){
    ListOfTasks list = FileHandling.readingFile(filename);
    if (list.toDoList.get(index).isCompleted()){
      list.toDoList.get(index).setCompleted(false);
    } else {
      list.toDoList.get(index).setCompleted(true);
    }
    FileHandling.writingFile(filename, list);
  }

  public String usage(){
    return  " Command Line Todo application \n" +
        " ============================= \n" +
        " Command line arguments: \n " +
        "  -l   Lists all the tasks \n " +
        "  -a   Adds a new task \n " +
        "  -r   Removes a task \n " +
        "  -c   Completes a task \n ";
  }

  @Override
  public String toString() {
    String string = "";
    string += "My to-do-list: \n";
    for (int i = 0; i < toDoList.size() ; i++) {
      string += i + "-" + toDoList.get(i).toString() + "\n";
    }
    return string;
  }

}
