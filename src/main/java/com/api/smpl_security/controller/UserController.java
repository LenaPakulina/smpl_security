package com.api.smpl_security.controller;

import com.api.smpl_security.dto.UserDTO;
import com.api.smpl_security.model.User;
import com.api.smpl_security.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/userCheck")
@Validated
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Boolean> userCheck(@Valid @RequestBody UserDTO dto) {
        if (userService.checkUser(dto)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@Valid @RequestBody UserDTO dto) {
        User user = userService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
