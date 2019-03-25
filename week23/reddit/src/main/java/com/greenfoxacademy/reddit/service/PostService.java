package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  PostRepository postRepository;

  @Autowired
  public PostService(){
  }
}
