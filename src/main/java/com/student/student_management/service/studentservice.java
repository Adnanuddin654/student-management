package com.student.student_management.service;

import com.student.student_management.exception.StudentNotFoundException;

import com.student.student_management.model.student;
import com.student.student_management.repository.studentrepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class studentservice {

    private final studentrepository studentrepository;

    public studentservice(studentrepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    public List<student> getAllStudents() {
        return studentrepository.findAll();
    }

    public student getStudentById(Long id) {
    return studentrepository.findById(id)
            .orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));
    }

    public student createStudent(student student) {
    return studentrepository.save(student);
    }

    public student updateStudent(Long id, student updatedStudent) {
    student existingStudent = studentrepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

    existingStudent.setName(updatedStudent.getName());
    existingStudent.setEmail(updatedStudent.getEmail());
    existingStudent.setCourse(updatedStudent.getCourse());
    existingStudent.setAge(updatedStudent.getAge());

    return studentrepository.save(existingStudent);
    }

     public void deleteStudent(Long id) {
        student student = studentrepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

        studentrepository.delete(student);
    }

}