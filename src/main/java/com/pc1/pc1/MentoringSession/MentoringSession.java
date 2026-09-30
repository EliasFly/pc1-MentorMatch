package com.pc1.pc1.MentoringSession;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table(name="mentoringSession")
public class MentoringSession {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private Long slotId;
    @OneToOne
    private Long studentId;
    @NotBlank(message = "El tema de la mentoría es obligatorio")
    private String topic;
    private ZonedDateTime reservedAt;
    private String status;
}
