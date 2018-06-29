package com.example.owie.mypowertool.Model;

public class student extends User {
    private int student_id;
    public student(int student_id, String first_name,String last_name,String address){
        super(first_name,last_name,address);
        this.student_id=student_id;
  }
}