package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;

@Service
public class TimeStampImpl implements TimeStampService{

@Autowired TimeStampRepository stamp;

@Override
    public TimeStamp postdata(TimeStamp val){
        
        return stamp.save(val);

    }

}