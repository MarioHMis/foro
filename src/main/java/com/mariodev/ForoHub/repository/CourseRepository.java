package com.mariodev.ForoHub.repository;

import com.mariodev.ForoHub.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
