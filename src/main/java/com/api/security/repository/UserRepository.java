package com.api.security.repository;

import com.api.security.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<User, Integer> {
    List<User> findByLoginAndHashPassword(String login, String hashPassword);
}
