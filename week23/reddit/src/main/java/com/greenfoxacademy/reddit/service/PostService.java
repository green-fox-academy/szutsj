package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public List<Post> findAll(){
    return postRepository.findAll();
  }

  public List<Post> findAllOrderedByVote(){
    return postRepository.findAllByOrderByVoteDesc();
  }


  public void save(Post post){
    postRepository.save(post);
  }

  public void delete(Post post){
    postRepository.delete(post);
  }

  public Optional<Post> findById(Long id){
    return  postRepository.findById(id);
  }

  public void upvote(Long id){
    if (findById(id).isPresent()){
      Post post = findById(id).get();
      post.setVote(post.getVote() + 1);
      save(post);
    }
  }

  public void downvote(Long id){
    if (findById(id).isPresent()){
      Post post = findById(id).get();
      post.setVote(post.getVote() - 1);
      save(post);
    }
  }

}
