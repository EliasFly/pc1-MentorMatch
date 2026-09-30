package com.pc1.pc1.MentorSlot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class SlotResponseDTO {
    private Long id;
    private String mentorUsername;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Integer availableSeats;
    private String status;
}
