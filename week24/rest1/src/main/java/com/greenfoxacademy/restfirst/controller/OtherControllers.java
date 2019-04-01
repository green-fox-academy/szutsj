package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.*;
import com.greenfoxacademy.restfirst.model.Double;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OtherControllers {


  @GetMapping("/doubling")
  public Object countDouble(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    }
    return new Doubling(input);
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(required = false) String name, String title) {
    if (name == null) {
      if (title == null) {
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
  public Object greeting(@PathVariable String appendable) {
    return new Append(appendable);
  }

  @PostMapping("/dountil/sum")
  public Object countSum(@RequestBody DoUntil doUntil) {
    if (doUntil != null) {
      return new Sum(doUntil);
    }
    return new Error("Please, provide a number!");
  }

  @PostMapping("/dountil/factor")
  public Object countFactor(@RequestBody DoUntil doUntil) {
    if (doUntil != null) {
      return new Factor(doUntil);
    }
    return new Error("Please, provide a number!");
  }

  @PostMapping("/arrays")
  public Object whatToDoWithArrays(@RequestBody ArrayToWorkWith arrayToWorkWith){
    if (arrayToWorkWith.getNumbers() != null){
      if (arrayToWorkWith.getWhat().equals("sum")) {
        return new Sum1(arrayToWorkWith.getNumbers());
      } else if (arrayToWorkWith.getWhat().equals("multiply")) {
        return new Multiply(arrayToWorkWith.getNumbers());
      } else if (arrayToWorkWith.getWhat().equals("double")) {
        return new Double(arrayToWorkWith.getNumbers());
      }
    }

    return new Error("Please, provide what to do with the numbers!");
  }

}