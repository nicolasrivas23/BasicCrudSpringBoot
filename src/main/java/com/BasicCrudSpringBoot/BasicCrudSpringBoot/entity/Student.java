package com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firs_name",nullable = false)
    private String firsName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_address",nullable = false,unique = true)
    @Email
    private String email;
}
