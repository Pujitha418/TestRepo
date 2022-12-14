package com.example.demo2.user.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestDto {
    private String name;
    @NonNull
    private String password;
    private int mobileNumber;
    @NonNull
    private String email;
}
