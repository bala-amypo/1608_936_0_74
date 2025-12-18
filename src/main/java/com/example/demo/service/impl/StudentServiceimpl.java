package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.Studentrepository;
import com.example.demo.entity.Studententity;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
        
    @Autowired Studentrepository student;
    // save,findAll(),findById(),deleteId(),existsById()
    @Override
    public Studententity postdata(Studententity entity){
        return student.save(entity);
    }
    @Override
    public List<Studententity>getAllData(){
        return student.findAll();
    }
    @Override
    public String DeleteData(int id){
            student.deleteById(id);
            return "Delete Successfully";
    
    }
    @Override
    public StudentEntity 

}
