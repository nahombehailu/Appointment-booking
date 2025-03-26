package com.nahom.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class User {
    private String fullName;
    @NotNull(message = "Username is required")
    private String userName;

    @NotNull(message = "Username is required")
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Password is required")
    private String password;

    private String phone;

    @NotNull(message = "Role is required")
    private String role;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public User(String fullName, String email, String phone, String role, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User() {

    }

}