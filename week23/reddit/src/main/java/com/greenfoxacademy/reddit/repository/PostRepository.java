package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();
  List<Post> findAllByOrderByVoteDesc();
  Optional<Post> findPostById(Long id);
}
