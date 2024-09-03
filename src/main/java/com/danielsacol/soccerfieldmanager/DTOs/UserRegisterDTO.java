package com.danielsacol.soccerfieldmanager.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
@Data
public class UserRegisterDTO implements Serializable{
    
    private String id;
    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Ingresa una direccion de correo valida")
    private String email;
    @NotBlank(message = "El correo es obligatorio")
    private String password;
    @NotBlank(message = "El correo es obligatorio")
    private String username;
    private String name;
    private String surname;



}
