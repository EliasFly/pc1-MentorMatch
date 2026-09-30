package com.pc1.pc1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/User")
public class UserController {
    @Autowired private final UserService service;
    @Autowired public UserController(UserService service){
        this.service=service;
    }
    @PostMapping
    ResponseEntity<UserResponseDTO> register(UserRequestDTO request){
        return ResponseEntity.ok().body(service.register(request));
    }
}
