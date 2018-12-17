import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class FileHandling {

  public static ArrayList<Task> readingFile(String filename, ArrayList<Task> list){
    try {
      FileInputStream fileInputStream
          = new FileInputStream(filename);
      ObjectInputStream objectInputStream
          = new ObjectInputStream(fileInputStream);
      list = (ArrayList<Task>) objectInputStream.readObject();
      objectInputStream.close();
      } catch (Exception e) {
      System.out.println(e);
    } finally {
      return list;
    }
  }


  public static void writingFile(String filename, ArrayList<Task> list){
    try {
      creatingFileIfNotExits(filename);
      FileOutputStream fileOutputStream
          = new FileOutputStream(filename);
      ObjectOutputStream objectOutputStream
          = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(list);
      objectOutputStream.flush();
      objectOutputStream.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void creatingFileIfNotExits(String filename){
    try{
      if (fileNotExist(filename)){
        Files.createFile(Paths.get(filename));
      }
    } catch (Exception e){
      System.out.println(e);
    }
  }

  public static boolean fileNotExist(String filename){
    return !Files.exists(Paths.get(filename));
  }

}
