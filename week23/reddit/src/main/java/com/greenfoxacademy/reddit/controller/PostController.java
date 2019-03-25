package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PictureService;
import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import com.greenfoxacademy.reddit.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @Autowired
  PictureService pictureService;

  @Autowired
  VideoService videoService;

  @Autowired
  UserService userService;

  @GetMapping({"", "/"})
  public String callMainPage(Model model){
    List<Post> posts = postService.findAllOrderedByVote();

    if (posts.size() == 0){
      model.addAttribute("none", "No posts");
    } else {
      model.addAttribute("posts", postService.findAllOrderedByVote());
    }
    return "startPage";
  }

  @GetMapping("submit")
  public String callPostPage(){
    return "post";
  }

  @PostMapping("submit")
  public String post(@ModelAttribute Post post){
    postService.save(post);
    return "redirect:/";
  }

  @GetMapping("/upvote/{id}")
  public String upvote(@PathVariable Long id){
    postService.upvote(id);
    return "redirect:/";
  }

  @GetMapping("/downvote/{id}")
  public String downvote(@PathVariable Long id){
    postService.downvote(id);
    return "redirect:/";
  }

}
