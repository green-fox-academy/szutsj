import java.io.Serializable;
import java.util.ArrayList;

public class ListOfTasks implements Serializable {

  private ArrayList<Task> listOfTask = new ArrayList<Task>();
  private static String filename = "todolist.txt";

  public void add(String description){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    Task task = new Task(description);
    tasks.listOfTask.add(task);
    FileHandling.writingFile(filename, tasks);
  }

  public void remove(int id){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    removeById(tasks, id);
    FileHandling.writingFile(filename, tasks);
  }

  public void update(int id, String desciption){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    updateDescription(tasks, id, desciption);
    FileHandling.writingFile(filename, tasks);
  }

  private void updateDescription(ListOfTasks tasks, int id, String description) {
    for (Task task : tasks.listOfTask) {
      if (task.getId() == id) {
        task.setDescription(description);
        task.setCompletedAt(null);
      }
    }
  }

  private void removeById(ListOfTasks tasks, int id){
    for (int i = 0; i < tasks.listOfTask.size(); i++) {
      if (tasks.listOfTask.get(i).getId() == id) {
        tasks.listOfTask.remove(i);
      }
    }
  }

  private void completeById(ListOfTasks tasks, int id){
    for (int i = 0; i < tasks.listOfTask.size(); i++) {
      if (tasks.listOfTask.get(i).getId() == id) {
        tasks.listOfTask.get(i).setCompletedAt();
      }
    }
  }

  public void list(){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    if (tasks.listOfTask.size() == 0){
      System.out.println("Nothing to do");
    } else {
      System.out.println(tasks.toString());
    }
  }

  public void complete(int id){
    ListOfTasks tasks = FileHandling.readingFile(filename);
    completeById(tasks, id);
    FileHandling.writingFile(filename, tasks);
  }

  public String usage(){
    return  " Command Line Todo application \n" +
        " ============================= \n" +
        " Command line arguments: \n " +
        "  -l   Lists all the tasks \n " +
        "  -a   Adds a new task \n " +
        "  -r   Removes a task \n " +
        "  -u   Updates a task \n " +
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

  public static String getFilename() {
    return filename;
  }

  public ArrayList<Task> getListOfTask() {
    return listOfTask;
  }

}
