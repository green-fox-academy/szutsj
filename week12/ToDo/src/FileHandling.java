import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class FileHandling {

  public static ListOfTasks readingFile(String filename){
    ListOfTasks tasks = new ListOfTasks();
    try {
      FileInputStream fileInputStream
          = new FileInputStream(filename);
      ObjectInputStream objectInputStream
          = new ObjectInputStream(fileInputStream);
      tasks = (ListOfTasks) objectInputStream.readObject();
      objectInputStream.close();
      } catch (Exception e) {
      //System.out.println(e);
    } finally {
      return tasks;
    }
  }

  public static void writingFile(String filename, ListOfTasks list){
    try {
      FileOutputStream fileOutputStream
          = new FileOutputStream(filename);
      ObjectOutputStream objectOutputStream
          = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(list);
      objectOutputStream.flush();
      objectOutputStream.close();
    } catch (Exception e) {
      //System.out.println(e);
    }
  }

}
