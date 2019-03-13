package com.greenfoxacademy.todoinspringwithdatabase.repository;

import com.greenfoxacademy.todoinspringwithdatabase.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
