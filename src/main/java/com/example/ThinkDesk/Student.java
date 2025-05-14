package com.example.ThinkDesk;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column(name="Student_name")
    private String name;
    @Column(name="Student_Branch")
    private String branch;
    @Column(name="Student_cgpa")
    private double cgpa;

    public Student() {
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    @Override
    public String toString(){
        return "Student[rollNo="+rollNo+",name="+name+",branch="+branch+",cgpa="+cgpa+"]";
    }
}
