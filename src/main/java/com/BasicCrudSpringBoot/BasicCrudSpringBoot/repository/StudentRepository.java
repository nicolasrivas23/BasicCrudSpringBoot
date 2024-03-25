package com.BasicCrudSpringBoot.BasicCrudSpringBoot.repository;

import com.BasicCrudSpringBoot.BasicCrudSpringBoot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
