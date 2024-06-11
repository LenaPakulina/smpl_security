package com.api.smpl_security.repository;

import com.api.smpl_security.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<User, Integer> {
    List<User> findByLoginAndHashPassword(String login, String hashPassword);
}
