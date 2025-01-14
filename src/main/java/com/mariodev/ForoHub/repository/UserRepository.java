package com.mariodev.ForoHub.repository;

import com.mariodev.ForoHub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
