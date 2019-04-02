package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.*;
import com.greenfoxacademy.restfirst.model.Double;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

  @PostMapping("/dountil/{what}")
  public ResponseEntity<?> countSum(@PathVariable String what, @RequestBody DoUntil doUntil) {
    if (doUntil != null) {

      if (what.equals("sum")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Sum(doUntil));
      }

      if (what.equals("factor")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Sum(doUntil));
      }
    }
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please, provide a number!"));
  }


  @PostMapping("/arrays")
  public ResponseEntity<Object> whatToDoWithArrays(@RequestBody (required = false) ArrayToWorkWith arrayToWorkWith){

    if (arrayToWorkWith.getNumbers() != null){
      if (arrayToWorkWith.getWhat().equals("sum")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Sum1(arrayToWorkWith.getNumbers()));
      } else if (arrayToWorkWith.getWhat().equals("multiply")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Multiply(arrayToWorkWith.getNumbers()));
      } else if (arrayToWorkWith.getWhat().equals("double")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Double(arrayToWorkWith.getNumbers()));
      }
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please, provide what to do with the numbers!"));
  }

}