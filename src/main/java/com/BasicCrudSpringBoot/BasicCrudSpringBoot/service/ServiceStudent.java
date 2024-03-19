package com.BasicCrudSpringBoot.BasicCrudSpringBoot.service;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ServiceStudent {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    void saveOrUpdate(Student student);
    void delete(Long id);
}
