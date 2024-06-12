package com.api.security.dto;

import com.api.security.hashing.SaltedHashing;
import com.api.security.model.User;

import java.security.NoSuchAlgorithmException;

public class UserDTOMapper {
    private final SaltedHashing saltedHashing = new SaltedHashing();

    public User getEntity(UserDTO dto) throws NoSuchAlgorithmException {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setLogin(dto.getLogin());
        entity.setHashPassword(saltedHashing.hashPassword(dto.getPassword()));
        return entity;
    }
}
