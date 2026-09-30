package com.pc1.pc1.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
}
