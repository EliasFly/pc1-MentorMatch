package com.pc1.pc1.MentorSlot;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorSlotService {
    @Autowired
    private final MentorSlotRepository repository;
    @Autowired private final ModelMapper modelMapper;
    @Autowired public MentorSlotService(MentorSlotRepository repository,ModelMapper modelMapper){
        this.repository=repository;
        this.modelMapper=modelMapper;
    }
    SlotResponseDTO create(SlotRequestDTO request){
        MentorSlot slot=modelMapper.map(request,MentorSlot.class);
        MentorSlot savedSlot=repository.save(slot);
        return modelMapper.map(savedSlot,SlotResponseDTO.class);
    }
}
