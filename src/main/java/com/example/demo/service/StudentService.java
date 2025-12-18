package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
        StudentEntity postdata(StudentEntity stu);
        List<StudentEntity>getAllData();
}