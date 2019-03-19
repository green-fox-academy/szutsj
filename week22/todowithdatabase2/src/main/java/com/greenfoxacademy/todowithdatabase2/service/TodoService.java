package com.greenfoxacademy.todowithdatabase2.service;

import com.greenfoxacademy.todowithdatabase2.model.Todo;
import com.greenfoxacademy.todowithdatabase2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

  @Autowired
  TodoRepository todoRepository;

  public void save(Todo todo){
    todoRepository.save(todo);
  }

  public void deleteById(Long id){
    todoRepository.deleteById(id);
  }

  public ArrayList<Todo> findAll(){
    ArrayList<Todo> todos = todoRepository.findAll();
    return todos;
  }

  public ArrayList<Todo> findByDone(boolean done){
    ArrayList<Todo> todos = todoRepository.findByDone(done);
    return todos;
  }

  public ArrayList<Todo> findByUrgent(boolean urgent){
    ArrayList<Todo> todos = todoRepository.findByUrgent(urgent);
    return todos;
  }

  public Todo findTodoById(Long id){
    Todo todo = todoRepository.findTodoById(id);
    return todo;
  }

  public ArrayList<Todo> findTitleByContaining(String title){
    ArrayList<Todo> todos = todoRepository.findByTitleContaining(title);
    return todos;
  }

}
