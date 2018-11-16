// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();

    try {
      Path filePath = Paths.get("./src/log.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("There was a problem with the file.");
    }
    getIpPAdresses(lines);
    System.out.println(getRatio(lines));
  }

  public static String[] getIpPAdresses(List<String> lines) {
    String[] logInfoSeparted = new String[lines.size()];
    ArrayList<String> iPAddresses = new ArrayList<>();
    ArrayList<String> uniqueIPAddresses = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      String[] line = lines.get(i).split(" ");
      logInfoSeparted[i] = line[8];
      iPAddresses.add(logInfoSeparted[i]);
    }

    for (int i = 0; i < iPAddresses.size(); i++) {
      if (!uniqueIPAddresses.contains(iPAddresses.get(i))){
        uniqueIPAddresses.add(iPAddresses.get(i));
      }

    }

    String[] uniqueList = new String[uniqueIPAddresses.size()];

    for (int i = 0; i < uniqueIPAddresses.size(); i++) {
      uniqueList[i] = uniqueIPAddresses.get(i);
    }
    return uniqueList;
  }

  public static double getRatio(List<String> lines){
    double ratio = 0;
    double gets = 0;
    double posts = 0;
    String[] getPost = new String[lines.size()];

    for (int i = 0; i < lines.size(); i++) {
      String[] line = lines.get(i).split(" ");
      getPost[i] = line[11];
    }

    for (int i = 0; i < getPost.length; i++) {
      if (getPost[i].charAt(0) == 'G'){
        gets++;
      } else if (getPost[i].charAt(0) == 'P') {
        posts++;
      }
    }
    if (posts != 0){
      return gets / posts;
    } else return 0;
  }
}
