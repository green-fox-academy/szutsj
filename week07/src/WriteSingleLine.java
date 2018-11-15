// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) {
    try{
      Path filePath = Paths.get("./src/my-file2.txt");
      Files.writeString(filePath, "Judit");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines);
    } catch (IOException e){
      System.out.println("There is a problem with the file.");
    }
  }
}
