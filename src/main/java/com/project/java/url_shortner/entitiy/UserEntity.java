package com.project.java.url_shortner.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class UserEntity {

    @Id
    @Column(name = "userId", nullable = false, unique = true)
    private String userId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "LastLogin")
    private String lastLogin;

    @Column(name = "FName", nullable = false)
    private String firstName;

    @Column(name = "SName", nullable = false)
    private String surname;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "DashBoardEnabled", columnDefinition = "BOOLEAN DEFAULT false")
    private boolean dashBoardEnabled;
}