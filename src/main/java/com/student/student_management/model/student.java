package com.student.student_management.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	private Long id;

@NotBlank(message = "Name is required")
private String name;

@NotBlank(message = "Email is required")
@Email(message = "Enter a valid email address")
private String email;

@NotBlank(message = "Course is required")
private String course;

@Min(value = 1, message = "Age must be at least 1")
private int age;

    public student() {
}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
    return age;
	}

	public void setAge(int age) {
    this.age = age;
	}

}