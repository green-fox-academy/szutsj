package com.greenfoxacademy.todowithauthentication.model;

import javax.persistence.*;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String description;
  @ManyToOne
  private User user;

  public Todo(String description, User user) {
    this.description = description;
    this.user = user;
  }

  public Todo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
