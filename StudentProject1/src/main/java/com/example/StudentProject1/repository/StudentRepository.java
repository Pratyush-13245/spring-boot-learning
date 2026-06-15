package com.example.StudentProject1.repository;

import com.example.StudentProject1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
