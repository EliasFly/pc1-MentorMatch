package com.pc1.pc1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/User")
public class UserController {
    @Autowired private final UserService service;
    @Autowired public UserController(UserService service){
        this.service=service;
    }
    @PostMapping
    UserResponseDTO register(UserRequestDTO request){
        return service.register(request);
    }
}
