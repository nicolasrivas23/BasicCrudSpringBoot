package com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firs_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address",nullable = false,unique = true)
    private String email;

    private String cel;

    private String direccion;

    private String edad;


}
