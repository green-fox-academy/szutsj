package com.greenfoxacademy.restfirst.service;

import com.greenfoxacademy.restfirst.model.TranslatedText;
import org.springframework.stereotype.Service;

@Service
public class TranslateService {


  public String translate(String text) {
    String translated = "";

    for (int i = 0; i < text.length(); i++) {
      translated += text.substring(i, i + 1);
      if (isVowel(text.substring(i, i + 1).toLowerCase())){
        translated += "v" + text.substring(i, i + 1).toLowerCase();
      }
    }
    return translated;
  }

  private boolean isVowel(String letter){
    String vowels = "aáeéiíoóöőuúüű";
     return vowels.contains(letter);
  }
}
