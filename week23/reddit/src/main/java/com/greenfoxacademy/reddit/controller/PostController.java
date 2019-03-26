package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Picture;
import com.greenfoxacademy.reddit.model.Post;
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

  @GetMapping("/submit")
  public String callPostPage(){
    return "newPost";
  }

  @PostMapping("/submit")
  public String post(@ModelAttribute Post post){
    postService.save(post);
    return "redirect:/edit/" + post.getId();
  }

  @GetMapping("/edit/{id}")
  public String callEditPostPage(Model model, @PathVariable Long id){

    if (postService.findPostById(id).isPresent()){
      model.addAttribute("post", postService.findPostById(id).get());
    }
    return "editPost";
  }

//  @PostMapping("/edit")
//  public String editPost(@ModelAttribute Post post){
//    postService.save(post);
//    return "redirect:/edit/" + post.getId();
//  }

  @PostMapping("/edit/end/{id}")
  public String submitEditPost(@ModelAttribute Post post, @PathVariable Long id){
    if (postService.findPostById(id).isPresent()){
      Post postInDB = postService.findPostById(id).get();
      if (!post.getTitle().equals(postInDB.getTitle())){
        postInDB.setTitle(post.getTitle());
        postService.save(postInDB);
      }
    }
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

  @PostMapping("/upload/picture/post/{id}")
  public String uploadPicture(@RequestParam String title, String src, @PathVariable Long id){
    List<Picture> pictures = new ArrayList<>();
    Picture picture = new Picture(title, src);

    if(postService.findPostById(id).isPresent()){
      Post post = postService.findPostById(id).get();
      picture.setPost(post);
      if (post.getPictures().size() != 0){
        pictures = post.getPictures();
      }
      pictures.add(picture);
      post.setPictures(pictures);
      postService.save(post);

    }
    return "redirect:/edit/" + id;
  }

  @PostMapping("/upload/video/post/{id}")
  public String uploadVideo(@RequestParam String title, String src, @PathVariable Long id){
    List<Video>  videos= new ArrayList<>();
    Video video = new Video(title, src);

    if(postService.findPostById(id).isPresent()){
      Post post = postService.findPostById(id).get();
      video.setPost(post);
      if (post.getVideos().size() != 0){
         videos = post.getVideos();
      }
      videos.add(video);
      post.setVideos(videos);
      postService.save(post);

    }
    return "redirect:/edit/" + id;
  }

}
