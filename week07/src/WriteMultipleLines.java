// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

  public static void main(String[] args) {
    writingGivenNumberOfLines("./src/my-file7.txt", "I have just made what you asked from me.", 5);
  }

  public static void writingGivenNumberOfLines(String filePath, String text, int numberOfLines){
    List<String> lines;
    ArrayList<String> textToWrite = new ArrayList<>();

    try{
      Path thePath = Paths.get(filePath);
      for (int i = 0; i < numberOfLines; i++) {
        textToWrite.add(text);
      }
      if (!Files.exists(thePath)){
        Files.write(thePath, textToWrite);
      } else {
        Files.write(thePath, textToWrite, StandardOpenOption.APPEND);
      }
      lines = Files.readAllLines(thePath);
      System.out.println(lines);
      System.out.println(lines.size() );
    } catch (IOException e){
      System.out.println("Unable to write the file.");
    }
  }
}
