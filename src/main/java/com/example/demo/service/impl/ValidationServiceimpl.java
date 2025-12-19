package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.exception.ValidationException;

@Service
public class ValidationServiceImpl implements ValidationService{

@Autowired ValidationRepository value;

@Override
    public ValidationEntity postdata(ValidationEntity val){
        
        return value.save(val);

    }
    @Override
public ValidationEntity getdata(Long id){
   return value.findById(id).orElseThrow(()->new ValidationException("Invalid id"+id));
}

}