package com.pc1.pc1.User;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private final UserRepository repository;
    @Autowired private final ModelMapper modelMapper;
    @Autowired public UserService(UserRepository repository,ModelMapper modelMapper){
        this.repository=repository;
        this.modelMapper=modelMapper;
    }

    UserResponseDTO register(UserRequestDTO request){
        User user=modelMapper.map(request,User.class);
        User savedUser=repository.save(user);
        savedUser.setRole("ROLE_USER");
        return modelMapper.map(savedUser,UserResponseDTO.class);
    }

}
