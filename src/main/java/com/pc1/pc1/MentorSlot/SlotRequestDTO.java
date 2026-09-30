package com.pc1.pc1.MentorSlot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class SlotRequestDTO {
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Integer capacity=1;
}
