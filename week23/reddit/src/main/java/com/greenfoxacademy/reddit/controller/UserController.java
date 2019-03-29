package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @Autowired
  PostService postService;

  @GetMapping("/user")
  public String askForLogin() {
    return "logInPage1";
  }

  @PostMapping("/user")
  public String login(Model model, @ModelAttribute User user) {
    String name = user.getName();
    String password = user.getPassword();

    if (userService.exist(name)) {
      if (userService.checkPassword(name, password)) {
        User userloggedIn = userService.findByName(name).get();
        return "redirect:/user/" + userloggedIn.getId() + "/posts";
      } else {
        return "redirect:/user/login";
      }
    } else {
      return "redirect:/user/register";
    }
  }

  @GetMapping("/user/login")
  public String login(Model model) {
    model.addAttribute("message", "Sorry, name or password is wrong.");
    return "logInPage1";
  }

  @GetMapping("/user/register")
  public String register(Model model) {
    model.addAttribute("message", "Sorry, no user with such name, please, register.");
    return "registerPage";
  }

  @GetMapping("/user/register2")
  public String register2(Model model) {
    model.addAttribute("message", "Sorry, this username already exists.");
    return "registerPage";
  }

  @GetMapping("/user/signUp")
  public String signUp() {
    return "registerPage";
  }

  @PostMapping("/user/register")
  public String register(Model model, @ModelAttribute User user) {
    String name = user.getName();
    String password = user.getPassword();

    if (userService.exist(name)) {
      return "redirect:/user/register2";
      } else {
      User userInDB = userService.register(name, password);
      return "redirect:/user/" + userInDB.getId() + "/posts";
    }
  }

  @GetMapping("/user/{userId}/posts")
  public String usersPosts(Model model, @PathVariable Long userId) {
    if (userService.findUserById(userId).isPresent()) {
      User user = userService.findUserById(userId).get();

      if (user.getPosts().size() == 0) {
        model.addAttribute("none", "No posts.");
      } else {
        model.addAttribute("posts", user.getPosts());
      }
      model.addAttribute("loggedInUser", user);
      return "userPage";
    }
    return "redirect:/";
  }


  @GetMapping("/user/logout")
  public String askForLogout() {
    return "redirect:/";
  }

}