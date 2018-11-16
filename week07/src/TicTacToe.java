import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("./src/win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("./src/win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("./src/draw.txt"));
    // Should print "Draw"

    System.out.println(ticTacResult("./src/verticalx.txt"));
    System.out.println(ticTacResult("./src/atlobalalsojobbfelsox.txt"));

  }

  public static String ticTacResult(String filename) {
    List<String> lines = new ArrayList<>();
    int[][][] rowsToCheck = {{{0, 0}, {0, 1}, {0, 2}}, {{1, 0}, {1, 1}, {1, 2}}, {{2, 0}, {2, 1}, {2, 2}}, {{0, 0}, {1, 0}, {2, 0}}, {{0, 1}, {1, 1}, {2, 1}}, {{0, 2}, {1, 2}, {2, 2}}, {{0, 0}, {1, 1}, {2, 2}}, {{2, 0}, {1, 1}, {0, 2}}};

    try {
      Path filePath = Paths.get(filename);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("There was a problem with the file");
    }

    for (int i = 0; i < rowsToCheck.length; i++) {
      if (threeInARow(rowsToCheck[i], lines)) {
        return String.valueOf(lines.get(rowsToCheck[i][0][0]).charAt(rowsToCheck[i][0][1]));
      }
    }
    return "draw";
  }

  public static boolean threeInARow(int[][] row, List<String> lines) {
    if (lines.get(row[0][0]).charAt(row[0][1]) == lines.get(row[1][0]).charAt(row[1][1]) && lines.get(row[1][0]).charAt(row[1][1]) == lines.get(row[2][0]).charAt(row[2][1])) {
      return true;
    }
    return false;
  }
}

