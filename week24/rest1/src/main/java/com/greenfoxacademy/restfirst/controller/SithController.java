package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.model.SithText;
import com.greenfoxacademy.restfirst.model.Text;
import com.greenfoxacademy.restfirst.service.LogService;
import com.greenfoxacademy.restfirst.service.SithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

  @Autowired
  LogService logService;

  @Autowired
  SithService sithService;

  @PostMapping("/sith")
  public ResponseEntity<Object> sithText(@RequestBody (required = false) Text text){
    logService.save(new Log("/sith", "JSON: {\"text\" : \"" + text.getText()+ "\"}"));
    if (text == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
    }

    SithText sithText = new SithText(sithService.formatter(text.getText()));
    return ResponseEntity.status(HttpStatus.OK).body(sithText);
  }

}
