package com.greenfoxacademy.todowithauthentication.repository;

import com.greenfoxacademy.todowithauthentication.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
