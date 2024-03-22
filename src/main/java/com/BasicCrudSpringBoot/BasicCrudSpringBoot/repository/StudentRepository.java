package com.BasicCrudSpringBoot.basiccrudspringboot.repository;

import com.BasicCrudSpringBoot.basiccrudspringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
