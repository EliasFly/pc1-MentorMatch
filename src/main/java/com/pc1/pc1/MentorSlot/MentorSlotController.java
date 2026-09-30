package com.pc1.pc1.MentorSlot;

import com.pc1.pc1.User.UserRepository;
import com.pc1.pc1.User.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/MentorSlot")
public class MentorSlotController {
    @Autowired private final MentorSlotService service;
    @Autowired public MentorSlotController(MentorSlotService service){
        this.service=service;
    }
    @PostMapping
    SlotResponseDTO create(SlotRequestDTO request){
        return service.create(request);
    }
}
