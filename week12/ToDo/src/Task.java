import java.io.Serializable;

public class Task implements Serializable {

  public String getDescription() {
    return description;
  }

  private String description;
  private boolean completed;

  public Task(String description){
    this.description = description;
    this.completed = false;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return isCompleted() ? "[X] " + this.description : "[ ] " + this.description;
  }
}
