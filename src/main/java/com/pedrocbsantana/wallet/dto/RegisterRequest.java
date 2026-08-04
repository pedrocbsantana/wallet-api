package com.pedrocbsantana.wallet.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RegisterRequest {


    @NotBlank
    private String username;


    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private String name;
}
