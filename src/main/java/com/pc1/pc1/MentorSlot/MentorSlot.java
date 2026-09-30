package com.pc1.pc1.MentorSlot;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table(name="mentorSlot")
public class MentorSlot {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Long mentorId;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Integer capacity=1;
    private String status;
}
