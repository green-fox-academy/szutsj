import java.io.Serializable;
import java.util.ArrayList;

public class ListOfTasks implements Serializable {

  private ArrayList<Task> listOfTask = new ArrayList<Task>();
  private String filename = "todolist.txt";

  public ArrayList<Task> getListOfTask() {
    return listOfTask;
  }

  public void add(String description){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    Task task = new Task(description);
    tasks.listOfTask.add(task);
    FileHandling.writingFile(filename, tasks);
  }

  public void remove(int index){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    tasks.listOfTask.remove(index);
    FileHandling.writingFile(filename, tasks);
  }

  public void list(){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    if (tasks.listOfTask.size() == 0){
      System.out.println("Nothing to do");
    } else {
      System.out.println(tasks.toString());
    }
  }

  public void complete(int index){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    tasks.listOfTask.get(index).setCompletedAt();
    FileHandling.writingFile(filename, tasks);
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

    for (Task task: listOfTask) {
       string += task.toString() + "\n";
    }
    return string;
  }

}
