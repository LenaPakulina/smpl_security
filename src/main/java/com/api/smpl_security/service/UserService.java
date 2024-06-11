package com.api.smpl_security.service;

import com.api.smpl_security.dto.UserDTO;
import com.api.smpl_security.dto.UserDTOMapper;
import com.api.smpl_security.model.User;
import com.api.smpl_security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean checkUser(UserDTO dto) {
        boolean result = false;
        try {
            UserDTOMapper mapper = new UserDTOMapper();
            User user = mapper.getEntity(dto);
            result = userRepository.findByLoginAndHashPassword(
                    user.getLogin(),
                    user.getHashPassword()
            ).size() == 1;
        } catch (Exception e) {
            log.error("Не удалось проверить пользователя: " + e.getMessage());
        }
        return result;
    }
}
