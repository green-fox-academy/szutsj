package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.*;
import com.greenfoxacademy.restfirst.model.Double;
import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OtherControllers {

  @Autowired
  LogService logService;


  @GetMapping("/doubling")
  public ResponseEntity<Object> countDouble(@RequestParam(required = false) Integer input) {
    logService.save(new Log("/doubling", "Request param: input - "  +  input));
    if (input == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please provide an input!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));

  }

  @GetMapping("/greeter")
  public ResponseEntity<Object> greeting(@RequestParam(required = false) String name, String title) {
    logService.save(new Log("/greeter", "Request params: name -"  +  name + ", title -" + title));
    if (name == null) {
      if (title == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please provide a name and title!"));
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please provide a name!"));
      }
    }

    if (title == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please provide a title!"));
    }

    return ResponseEntity.status(HttpStatus.OK).body(new Greeting(name, title));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<Object> greeting(@PathVariable String appendable) {
    logService.save(new Log("/appenda/{appendable}", "Pathvariable: appendalbe -"  +  appendable));
    return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable));
  }

  @PostMapping("/dountil/{what}")
  public ResponseEntity<Object> countSum(@PathVariable String what, @RequestBody (required = false) Until until) {
    logService.save(new Log("/dountil/{what}", "Pathvariable: what -"  +  what + ", JSON: {\"until :" + until + "\"}"));
    if (until != null) {

      if (what.equals("sum")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Sum(until));
      }

      if (what.equals("factor")) {
        return ResponseEntity.status(HttpStatus.OK).body(new Sum(until));
      }
    }
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Please, provide a number!"));
  }


  @PostMapping("/arrays")
  public ResponseEntity<Object> whatToDoWithArrays(@RequestBody (required = false) ArrayToWorkWith arrayToWorkWith){
    logService.save(new Log("/arrays", "JSON: \"what\" :" +  arrayToWorkWith.getWhat() + "numbers:\" :" + arrayToWorkWith.getNumbers().toString() + "\"}"));

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