package com.greenfoxacademy.restfirst.repository;

import com.greenfoxacademy.restfirst.model.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {
  Page<Log> findAll(Pageable pageable);
  Page<Log> findAllByDataContaining(String word, Pageable pageable);
}