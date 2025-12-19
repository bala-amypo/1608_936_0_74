package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private LocalDateTime createAt;
     private LocalDateTime updateAt;
}


