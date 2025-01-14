package com.mariodev.ForoHub.repository;

import com.mariodev.ForoHub.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
