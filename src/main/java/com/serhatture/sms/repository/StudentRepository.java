package com.serhatture.sms.repository;

import com.serhatture.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


// we dont need a @Repository annotation, because SimpleJpaRepository implement
public interface StudentRepository extends JpaRepository<Student,Long> {


}
