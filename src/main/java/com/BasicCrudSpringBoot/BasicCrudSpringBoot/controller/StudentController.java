package com.BasicCrudSpringBoot.BasicCrudSpringBoot.controller;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;
import com.BasicCrudSpringBoot.BasicCrudSpringBoot.service.Impl.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @GetMapping
    public List<Student> findAll(){
        return studentImpl.findAll();
    }
    @GetMapping(path = "{id}")
    public Optional<Student> findById(@PathVariable Long id){
        return studentImpl.findById(id);
    }
    @PostMapping
    public void save(@RequestBody Student student){
        studentImpl.saveOrUpdate(student);
    }
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable Long id){
        studentImpl.delete(id);
    }
}
