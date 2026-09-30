package com.pc1.pc1.User;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table(name="user")
public class User {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name="username",unique = true)
    private String username;
    @NotBlank @Email
    @Column(name="email",unique = true)
    private String email;
    @NotBlank
    @Column(name="password",unique = true)
    private String password;
    @NotNull
    private String role;

}
