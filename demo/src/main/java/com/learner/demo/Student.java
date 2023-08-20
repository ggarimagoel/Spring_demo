package com.learner.demo;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(){
        super();
    }
    public Student(int studentId , String studentName, String studentAddress){
        super();
        this.studentName =  studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }
    public String toString(){
        return "studentId =  " + studentId + "  studentName =  " + studentName  +  " studentAddress =  " + studentAddress;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
