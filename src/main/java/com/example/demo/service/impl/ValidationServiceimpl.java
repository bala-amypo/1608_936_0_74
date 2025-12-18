package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;

@Service
public class ValidationServiceimpl implements ValidationService{

@Autowired ValidationRepository value;

@Override
    public ValidationEntity postdata(ValidationEntity val){
        
        return value.save(val);

    }

}
