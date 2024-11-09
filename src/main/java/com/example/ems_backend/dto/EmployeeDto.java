package com.example.ems_backend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")

    private String lastname;
    @Column(name = "email_id", nullable = false, unique = true)

    private String email;
}
