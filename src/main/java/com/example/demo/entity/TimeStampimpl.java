package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimeStamp;

@Repository
public interface TimeStampRepository extends JpaRepository<TimeStamp,Long>{


}






package com.example.demo.service;

import com.example.demo.entity.TimeStamp;

public  TimeStampService{

TimeStamp postdata(TimeStamp val);

}
