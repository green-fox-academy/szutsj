import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Task implements Serializable {
  private static int idCounter = 0;
  private String description;
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;

  public Task(String description){
    this.description = description;
    idCounter++;
    id = idCounter;
    createdAt = LocalDateTime.now();
  }

  public String completionTime(){
    Duration duration = Duration.between(createdAt, completedAt);
    long millis = duration.toMillis();

    return String.format(", completed in  %02d days, %02d hours, %02d minutes",
        TimeUnit.MILLISECONDS.toDays(millis),
        TimeUnit.MILLISECONDS.toHours(millis) -
            TimeUnit.HOURS.toHours(TimeUnit.MILLISECONDS.toDays(millis)),
        TimeUnit.MILLISECONDS.toMinutes(millis) -
            TimeUnit.MINUTES.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)));
  }

  private boolean isCompleted(){
    if (completedAt == null){
      return false;
    } else if(completedAt.isBefore(LocalDateTime.now())){
      return true;
    }
    return false;
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

  public void setCompletedAt(LocalDateTime localDateTime) {
    completedAt = localDateTime;
  }

  @Override
  public String toString() {
    return isCompleted() ? id + " - " + "[x] " + this.description + completionTime() : id + " - " + "[ ] " + this.description;
  }

}
