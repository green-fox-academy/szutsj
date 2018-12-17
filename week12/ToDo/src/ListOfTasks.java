import java.io.Serializable;
import java.util.ArrayList;

public class ListOfTasks implements Serializable {

  private ArrayList<Task> toDoList = new ArrayList<Task>();
  private String filename = "todolist.txt";

  public void add(String description){
    if (!FileHandling.fileNotExist(filename)){
      toDoList = FileHandling.readingFile(filename, toDoList);
    }
    Task task = new Task(description);
    toDoList.add(task);
    FileHandling.writingFile(filename, toDoList);
  }

  public void remove(int index){
    toDoList = FileHandling.readingFile(filename, toDoList);
    toDoList.remove(index);
    FileHandling.writingFile(filename, toDoList);
  }

  public void list(){
    if (FileHandling.fileNotExist(filename)){
      System.out.println("Nothing to do");
    } else {
      toDoList = FileHandling.readingFile(filename, toDoList);
      if (toDoList.size() == 0){
        System.out.println("Nothing to do");
      } else {
        System.out.println(toString());
      }
    }
  }

  public void complete(int index){
    FileHandling.readingFile(filename, toDoList);
    toDoList = FileHandling.readingFile(filename, toDoList);
    if (toDoList.get(index).isCompleted()){
      toDoList.get(index).setCompleted(false);
    } else {
      toDoList.get(index).setCompleted(true);
    }
    FileHandling.writingFile(filename, toDoList);
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

  public void outOfBoundError(ArrayList<Task> list){

  }

  @Override
  public String toString() {
    String string = "";
    string += "My to-do-list: \n";
    for (Task task : toDoList){
      string += task.toString() + "\n";
    }
    return string;
  }

}
