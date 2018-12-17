import java.io.Serializable;

public class Task implements Serializable {

  private String description;
  private boolean completed;

  public Task(String description){
    this.description = description;
    this.completed = false;
  }

  public String getDescription() {
    return description;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    String string = "";
    if (isCompleted()){
      string += "[X]" + this.description;
    } else {
      string += "[ ]" + this.description;
    }
    return string;
  }
}
