package com.BasicCrudSpringBoot.basiccrudspringboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String firsName;

    private String lastName;

    private String cel;

    private String direccion;

    private String edad;
}

