package com.example.doctorapointmentbookingapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    private String doctorId;
//    private String name;
//    private int age;
//    private String gender;
//    private String email;
//    private String phoneNumber;


}
