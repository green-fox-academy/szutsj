package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.model.TextToTranslate;
import com.greenfoxacademy.restfirst.model.TranslatedText;
import com.greenfoxacademy.restfirst.service.LogService;
import com.greenfoxacademy.restfirst.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {

  TranslateService translateService;
  LogService logService;

  @Autowired
  public TranslateController(TranslateService translateService, LogService logService){
    this.translateService = translateService;
    this.logService = logService;
  }

  @PostMapping("/translate")
  public ResponseEntity<Object> translate(@RequestBody (required = false) TextToTranslate textToTranslate){
    logService.save(new Log("/translate", textToTranslate.toString()));

    if (textToTranslate == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("I can't translate that!"));
    } else {
      String translated = translateService.translate(textToTranslate.getText());
      TranslatedText translatedText =  new TranslatedText(translated);
      return ResponseEntity.status(HttpStatus.OK).body(translatedText);
    }
  }

}

