import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Serializable {
  private static final AtomicInteger count = new AtomicInteger(0);
  private String description;
  private boolean completed;
  private final int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;

  public Task(String description){
    this.description = description;
    this.completed = false;
    id = count.incrementAndGet();
    createdAt = LocalDateTime.now();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt() {
    createdAt = LocalDateTime.now();
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt() {
    completedAt = LocalDateTime.now();
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return completed ? id + " - " + "[x] " + this.description +
        " " : id + " - " + "[ ] " + this.description;
  }

}
