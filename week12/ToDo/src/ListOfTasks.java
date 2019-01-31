import java.io.Serializable;
import java.util.ArrayList;

public class ListOfTasks implements Serializable {

  private ArrayList<Task> listOfTasksArrayListField = new ArrayList<Task>();
  private String filename = "todolist.txt";

  public ArrayList<Task> getListOfTasksArrayListField() {
    return listOfTasksArrayListField;
  }

  public void add(String description){
    ListOfTasks instanceOfListOfTasks = FileHandling.readingFile(filename);
    Task task = new Task(description);
    instanceOfListOfTasks.listOfTasksArrayListField.add(task);
    FileHandling.writingFile(filename, instanceOfListOfTasks);
  }

  public void remove(int index){
    ListOfTasks instanceOfListOfTasks = FileHandling.readingFile(filename);
    instanceOfListOfTasks.listOfTasksArrayListField.remove(index);
    FileHandling.writingFile(filename, instanceOfListOfTasks);
  }

  public void list(){
    ListOfTasks instanceOfListOfTasks = FileHandling.readingFile(filename);
    if (instanceOfListOfTasks.listOfTasksArrayListField.size() == 0){
      System.out.println("Nothing to do");
    } else {
      System.out.println(instanceOfListOfTasks.toString());
    }
  }

  public void complete(int index){
    ListOfTasks instanceOfListOfTasks = FileHandling.readingFile(filename);
    if (instanceOfListOfTasks.listOfTasksArrayListField.get(index).isCompleted()){
      instanceOfListOfTasks.listOfTasksArrayListField.get(index).setCompleted(false);
    } else {
      instanceOfListOfTasks.listOfTasksArrayListField.get(index).setCompleted(true);
    }
    FileHandling.writingFile(filename, instanceOfListOfTasks);
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
    string += "My to-do-instanceOfListOfTasks: \n";
    for (int i = 0; i < listOfTasksArrayListField.size() ; i++) {
      string += i + "-" + listOfTasksArrayListField.get(i).toString() + "\n";
    }
    return string;
  }

}
