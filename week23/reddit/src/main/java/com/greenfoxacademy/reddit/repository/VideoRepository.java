package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
}
