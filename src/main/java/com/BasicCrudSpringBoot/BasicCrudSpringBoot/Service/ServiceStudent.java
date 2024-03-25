package com.BasicCrudSpringBoot.BasicCrudSpringBoot.Service;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface ServiceStudent {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    void saveOrUpdate(Student student) throws IOException;
    void delete(Long id);
}
