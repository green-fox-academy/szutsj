package com.greenfoxacademy.restfirst.model;

import java.util.ArrayList;
import java.util.Arrays;

public class SithText {

  private String sith_text;

  public SithText() {
  }

  public SithText(String text) {
    this.sith_text = formatter(text);
  }

  public String getSith_text() {
    return sith_text;
  }

  public void setSith_text(String sith_text) {
    this.sith_text = sith_text;
  }

  private String formatter(String text) {
    String sithtext = "";
    ArrayList<String> textAsAL = new ArrayList<>(Arrays.asList(text.split(" ")));
    int numberToSentenceEnd = numberOfWordsTillNextPoint(textAsAL, 0);

    for (int i = 0; i < textAsAL.size();) {

      for (int j = i; j < numberToSentenceEnd; j++) {
        if (numberToSentenceEnd % 2 == 0) {
          sithtext += textAsAL.get(j);
          sithtext += " ";
          if (j == numberToSentenceEnd - 1) {
            sithtext = addRandomword(sithtext);
            i += numberToSentenceEnd;
            numberToSentenceEnd = numberOfWordsTillNextPoint(textAsAL, i);
          }
        } else if (j == numberToSentenceEnd -1) {
          sithtext += textAsAL.get(j) + " ";
          sithtext = addRandomword(sithtext);
          i += numberToSentenceEnd;
          numberToSentenceEnd = numberOfWordsTillNextPoint(textAsAL, i);
        } else if (j < numberToSentenceEnd - 1) {
          if (j == i) {
            textAsAL.set(j, textAsAL.get(j).substring(0, 1).toLowerCase() + textAsAL.get(j).substring(1));
            textAsAL.set(j + 1, textAsAL.get(j + 1).substring(0, 1).toUpperCase() + textAsAL.get(j + 1).substring(1));
          }
          sithtext += textAsAL.get(j + 1) + " " + textAsAL.get(j) + " ";

          j++;
        }

      }
    }
    return sithtext;
  }

  private String randomword() {
    String[] words = {"Aahhh.", "EErrrr.", "Uhhh.", "Something weird..."};
    return words[(int) (Math.random() * 4)];
  }

  private String addRandomword(String sithtext) {
    for (int g = 0; g < (int) (Math.random() * 2) + 1; g++) {
      sithtext += randomword();
      sithtext += " ";
    }
    return sithtext;
  }

  private int numberOfWordsTillNextPoint(ArrayList<String> stringAsAL, int index) {
    for (int i = index; i < stringAsAL.size(); i++) {
      if (stringAsAL.get(i).endsWith(".")){
        return i + 1;
      }
    }
    return 0;
  }

}
