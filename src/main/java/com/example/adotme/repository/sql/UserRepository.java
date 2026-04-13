package com.example.adotme.repository.sql;

import com.example.adotme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
