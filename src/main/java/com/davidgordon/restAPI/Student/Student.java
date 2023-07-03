package com.davidgordon.restAPI.Student;

import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private float gpa;


    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dob, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gpa = gpa;
    }

    public Student(int id, String firstName, String lastName, LocalDate dob, float gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", gpa=" + gpa +
                '}';
    }
}


