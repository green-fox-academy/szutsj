package com.greenfoxacademy.todowithdatabase2.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "assignee")
  private List<Todo> todos;


  public Assignee(){
  }

  public Assignee(String name, String email){
    this();
    this.email = email;
    this.name = name;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
