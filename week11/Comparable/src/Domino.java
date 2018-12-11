import java.util.List;

public class Domino implements Comparable<Domino>, Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
  @Override
  public int compareTo(Domino other) {
    int diff = this.left - other.left;
    if (diff == 0){
      diff = this.right - other.right;
    }
    return diff;
  }

  @Override
  public void printAllFields() {
    System.out.println(this.left + "," + this.right);
  }

}
