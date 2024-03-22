package com.BasicCrudSpringBoot.basiccrudspringboot.Service.Impl;

import com.BasicCrudSpringBoot.basiccrudspringboot.entity.Student;
import com.BasicCrudSpringBoot.basiccrudspringboot.repository.StudentRepository;
import com.BasicCrudSpringBoot.basiccrudspringboot.Service.ServiceStudent;
import com.BasicCrudSpringBoot.basiccrudspringboot.DTO.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Slf4j
@Service
public class StudentImpl implements ServiceStudent {
    //@Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void saveOrUpdate(Student student) throws IOException {
        Student student1 = Student.builder()
                .email(student.getEmail())
                .firsName(student.getFirsName())
                .lastName(student.getLastName())
                .cel(student.getCel())
                .direccion(student.getDireccion())
                .edad(student.getEdad())
                .build();
        String patter = ".*@.*";
        Pattern regex = Pattern.compile(patter);
        Matcher matcher = regex.matcher(student1.getEmail());
        if (matcher.matches() && student.getFirsName() == null) {
            student1.setFirsName("vacio");
            log.info("se guardo correctamente" + student1);
            studentRepository.save(student1);
        } else {
            throw new IOException("EL email no es valido");
        }
    }
    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
    public StudentDTO lista(Long id) throws Exception {
        Optional<Student> student = null;
        StudentDTO studentDTO = new StudentDTO();
        student = studentRepository.findById(id);
        if(student.isPresent()){
            studentDTO.setCel(student.get().getCel());
            studentDTO.setDireccion(student.get().getDireccion());
            studentDTO.setEdad(student.get().getEdad());
            studentDTO.setFirsName(student.get().getFirsName());
            studentDTO.setLastName(student.get().getLastName());

        }else {
            throw  new Exception("La lista viene vacia");
        }
       return  studentDTO;
    }

}
