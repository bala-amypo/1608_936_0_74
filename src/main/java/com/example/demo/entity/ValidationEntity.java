package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constrants.Size;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 0; message = "must be 2 to 10 chartacter")
    private String username;
    @Email(message = "Email is not valid")
    private String email;    
    @Max(6)
    @NotNull(message = "Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message = "Age must be a positive number")
    private int age;
public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getID(){
        return id;
    }
    public void setID(Integer id){
        this.id=id;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public Date getCreated(){
        return created;
    }
    public void setAge(int Age created){
        this.created=created;
    }

}
