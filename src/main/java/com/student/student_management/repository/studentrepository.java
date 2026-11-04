package com.student.student_management.repository;

import com.student.student_management.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<student, Long> {

}