public class Domino implements Comparable<Domino>{
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
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

}
