package com.pc1.pc1.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequestDTO {
    @NotBlank(message="El nombre de usuario es obligatorio")
    private String username;
    @NotBlank(message = "La dirección de correo es obligatoria")
    @Email(message = "Por favor ingrese una dirección de correo válida")
    private String email;
    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min=8)
    private String password;
}
