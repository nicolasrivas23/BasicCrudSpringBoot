package com.BasicCrudSpringBoot.BasicCrudSpringBoot.service.Impl;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;
import com.BasicCrudSpringBoot.BasicCrudSpringBoot.repository.StudentRepository;
import com.BasicCrudSpringBoot.BasicCrudSpringBoot.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentImpl implements ServiceStudent {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
