package com.BasicCrudSpringBoot.BasicCrudSpringBoot.repository;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
