// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {
    System.out.println(countingLines("./src/my-file.txt"));
  }

  public static int countingLines(String filename){
    int numberOfLines = -1;

    try{
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      numberOfLines = lines.size();
    } catch (IOException e){
      System.out.println("There is a problem with the file.");
    }

    return numberOfLines;
  }
}
