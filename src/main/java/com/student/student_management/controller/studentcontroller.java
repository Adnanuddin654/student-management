package com.student.student_management.controller;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import com.student.student_management.model.student;

import com.student.student_management.service.studentservice;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentcontroller {

    private final studentservice studentservice;

    public studentcontroller(studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping("/students")
    public List<student> getAllStudents() {
        return studentservice.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public student getStudentById(@PathVariable Long id) {
    return studentservice.getStudentById(id);
    }

    @PostMapping("/students")
    public student createStudent(@Valid@RequestBody   student student) {
    return studentservice.createStudent(student);
    }

    @PutMapping("/students/{id}")
        public student updateStudent(@PathVariable Long id, @Valid @RequestBody student updatedStudent) {
    return studentservice.updateStudent(id, updatedStudent);
}

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
    studentservice.deleteStudent(id);
    }

}