package com.pc1.pc1.MentorProfile;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table(name="mentor")
public class MentorProfile {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne()
    private Long userId;
    @NotBlank(message = "La especialidad es información obligatoria")
    private String specialty;
    @Size(max=300,message = "La biografía no puede superar los 300 caracteres")
    private String bio;
    private String status;
}
