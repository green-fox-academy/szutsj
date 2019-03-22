package com.greenfoxacademy.todowithdatabase2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.sql.Timestamp;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @Column(name = "DATE")
  private LocalDate creationDate;

  @Column(name = "DUE_DATE")
  private LocalDate dueDate;

  @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
  @JoinColumn(name = "assignee_id")
  private Assignee assignee;

  public Todo(){
    urgent = false;
    done = false;
    creationDate = LocalDate.now();
  }

  public Todo(String title){
    this();
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

}
