
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class CopyFile {

  public static void main(String[] args) {
    System.out.println("The copy was succesful: " + copyingFile("./src/my-file.txt", "./src/my-file6.txt"));
  }

  public static boolean copyingFile(String filename1, String filename2){
    try{
      Path firstPath = Paths.get(filename1);
      Path secondPath = Paths.get(filename2);
      Files.copy(firstPath, secondPath);
    } catch (IOException e){
      System.out.println("There is a problem with one of the files");
      return false;
    }
    return true;
  }
}
