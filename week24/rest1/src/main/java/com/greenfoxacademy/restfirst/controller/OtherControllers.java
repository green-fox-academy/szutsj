package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.*;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.web.bind.annotation.*;

@RestController
public class OtherControllers {


  @GetMapping("/doubling")
  public Object countDouble(@RequestParam (required = false) Integer input){
    if (input == null){
      return new Error("Please provide an input!");
    }
    return new Doubling(input);
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam (required = false) String name, String title){
    if (name == null){
      if (title == null){
        return new Error("Please provide a name and title!");
      } else {
        return new Error("Please provide a name!");
      }
    }

    if (title == null) {
      return new Error("Please provide a title!");
    }

    return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object greeting(@PathVariable String appendable){
    return new Append(appendable);
  }

  @PostMapping("/dountil/sum")
  public Object countSum(@RequestParam (required = false) Integer doUntil){
    if (doUntil == null){
      return new Error("Please, provide a number!");
    }
    return new Sum(new DoUntil(doUntil));
  }

  @PostMapping("/dountil/factor")
  public Object countFactor(@RequestParam (required = false) Integer doUntil){
    if (doUntil == null){
      return new Error("Please, provide a number!");
    }
    return new Factor(new DoUntil(doUntil));
  }

}