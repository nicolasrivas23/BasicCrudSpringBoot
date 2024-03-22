package com.BasicCrudSpringBoot.basiccrudspringboot.controller;

import com.BasicCrudSpringBoot.basiccrudspringboot.Service.Impl.StudentImpl;
import com.BasicCrudSpringBoot.basiccrudspringboot.entity.Student;
import com.BasicCrudSpringBoot.basiccrudspringboot.DTO.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @GetMapping("/student")
    public List<Student> findAll(){
        return studentImpl.findAll();
    }

    @GetMapping("/studentById/{id}")
    public Optional<Student> findById(@PathVariable Long id){
        return studentImpl.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Student student) throws IOException {
        studentImpl.saveOrUpdate(student);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable Long id){
        studentImpl.delete(id);
    }

    @GetMapping("/ListarByIdS/{id}")
    public ResponseEntity<StudentDTO> lista(@PathVariable Long id) throws Exception {
        StudentDTO studentDTO = null;
        try{
            studentDTO = studentImpl.lista(id);
            if (studentDTO != null){
                return ResponseEntity.ok().body(studentDTO);
            }else {
                return ResponseEntity.noContent().build();
            }
        }catch (Exception ex){
           log.error("ocurrio un error: " +ex.getMessage());
        }
      return null;
    }

}
