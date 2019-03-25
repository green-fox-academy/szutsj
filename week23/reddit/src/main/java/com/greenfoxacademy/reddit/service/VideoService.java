package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

  @Autowired
  VideoRepository videoRepository;


}
