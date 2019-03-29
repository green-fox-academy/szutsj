package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Picture;
import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.model.Video;
import com.greenfoxacademy.reddit.service.PictureService;
import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import com.greenfoxacademy.reddit.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

  @GetMapping("/{userId}")
  public String callMainPage(Model model, @PathVariable Long userId) {
    if (userService.findUserById(userId).isPresent()) {
      List<Post> posts = postService.findAllOrderedByVote();
      User user = userService.findUserById(userId).get();

      if (posts.size() == 0) {
        model.addAttribute("none", "No posts");
      } else {
        model.addAttribute("posts", user.getPosts());
      }
      model.addAttribute("userLoggedIn", user);
      return "startPageWithUser";
    } else {
      return "redirect:/";
    }
  }

  @GetMapping("/submit")
  public String callPostPage(){
    return "redirect:/user";
  }

  @GetMapping("/submit/{userId}")
  public String callPostPagewithId(Model model, @PathVariable Long userId) {
    if (userService.findUserById(userId).isPresent()){
      User user = userService.findUserById(userId).get();
      model.addAttribute("userLoggedIn", user);
      return "newPost";
    } else {
      return "redirect:/";
    }
  }

  @PostMapping("/submit/{userId}")
  public String post(@ModelAttribute Post post, @PathVariable Long userId){
    post.setUser(userService.findUserById(userId).get());
    postService.save(post);
    return "redirect:/edit/" + userId + "/" + post.getId();
  }

  @GetMapping("/edit/{userId}/{postId}")
  public String callEditPostPage(Model model, @PathVariable(name = "userId") Long userId, @PathVariable(name="postId") Long postId) {
    if (userService.findUserById(userId).isPresent()) {
      User user = userService.findUserById(userId).get();

      if (postService.findById(postId).isPresent()) {
        model.addAttribute("post", postService.findById(postId).get());
        model.addAttribute("loggedInUser", user);
        return "editPost";
      }
    }
    return "redirect:/";
  }

  @PostMapping("/edit/{userId}/{postId}/end")
  public String submitEditPost(@ModelAttribute Post post, @PathVariable(name = "userId") Long userId, @PathVariable(name = "postId") Long postId){
    if (userService.findUserById(userId).isPresent()) {
      if (postService.findById(postId).isPresent()) {
        Post postInDB = postService.findById(postId).get();
        if (!post.getTitle().equals(postInDB.getTitle())) {
          postInDB.setTitle(post.getTitle());
          postService.save(postInDB);
        }
      }
      return "redirect:/user/" + userId + "/posts";
    }
    return "redirect:/";
  }

  @PostMapping("/upvote/{postId}")
  public String upvote(@PathVariable Long postId){
    postService.upvote(postId);
    return "redirect:/";
  }

  @PostMapping("/downvote/{postId}")
  public String downvote(@PathVariable Long postId){
    postService.downvote(postId);
    return "redirect:/";
  }

  @PostMapping("/upload/picture/{userId}/post/{postId}")
  public String uploadPicture(@RequestParam String title, String src, @PathVariable(name = "userId") Long userId, @PathVariable(name = "postId") Long postId){
    if (userService.findUserById(userId).isPresent()){
      List<Picture> pictures = new ArrayList<>();
      Picture picture = new Picture(title, "/postImage/" + src);

      if(postService.findById(postId).isPresent()){
        Post post = postService.findById(postId).get();
        picture.setPost(post);
        if (post.getPictures().size() != 0){
          pictures = post.getPictures();
        }
        pictures.add(picture);
        post.setPictures(pictures);
        postService.save(post);

      }
      return "redirect:/edit/" + userId + "/" + postId;
    } else {
      return "redirect:/";
    }
  }

  @PostMapping("/upload/video/{userId}/post/{postId}")
  public String uploadVideo(@RequestParam String title, String src, @PathVariable(name = "userId") Long userId, @PathVariable(name = "postId") Long postId) {
    if (userService.findUserById(userId).isPresent()) {
      List<Video> videos = new ArrayList<>();
      Video video = new Video(title, "/postImage/" + src);

      if (postService.findById(postId).isPresent()) {
        Post post = postService.findById(postId).get();
        video.setPost(post);
        if (post.getVideos().size() != 0) {
          videos = post.getVideos();
        }
        videos.add(video);
        post.setVideos(videos);
        postService.save(post);

      }
      return "redirect:/edit/" + userId + "/" + postId;
    } else {
      return "redirect:/";
    }
  }

  @GetMapping("/delete/{userId}/{postId}")
  public String callDeletePostPage(Model model, @PathVariable(name = "userId") Long userId, @PathVariable(name="postId") Long postId) {
    if (userService.findUserById(userId).isPresent()) {
      User user = userService.findUserById(userId).get();

      if (postService.findById(postId).isPresent()) {
        model.addAttribute("post", postService.findById(postId).get());
        model.addAttribute("loggedInUser", user);
        return "deletePost";
      }
    }
    return "redirect:/";
  }

  @PostMapping("/delete/{userId}/{postId}/end")
  public String submitDeletePost(@ModelAttribute Post post, @PathVariable(name = "userId") Long userId, @PathVariable(name = "postId") Long postId){
    if (userService.findUserById(userId).isPresent()) {
      if (postService.findById(postId).isPresent()) {
        postService.delete(postService.findById(postId).get());
      }
      return "redirect:/user/" + userId + "/posts";
    }
    return "redirect:/";
  }

}
