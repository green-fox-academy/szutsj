package com.greenfoxacademy.restfirst.repository;

import com.greenfoxacademy.restfirst.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LogRepository extends CrudRepository<Log, Long>{
  ArrayList<Log> findAll();
  ArrayList<Log> findAllByDataContaining(String word);
}