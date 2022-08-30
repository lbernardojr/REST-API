package com.dxc.percipio.model;


import java.util.List;

public class Students {
    private int studentId;
    private String firstName;
    private String lastName;
    private List<Subject> enrolledSubjects;

    public Students(int studentId, String firstName, String lastName, List<Subject> enrolledSubjects) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrolledSubjects = enrolledSubjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    @Override
    public String toString() {
        return "Students {" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", enrolledSubjects=" + enrolledSubjects +
                '}';
    }
}
