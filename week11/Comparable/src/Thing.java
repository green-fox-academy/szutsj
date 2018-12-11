import java.lang.Boolean;

public class Thing implements Comparable<Thing> {
  String name;
  boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing other) {
    int diff = Boolean.compare(this.completed, other.completed);
    if (diff == 0) {
      diff = this.name.compareTo(other.name);
    }
    return diff;
  }
}