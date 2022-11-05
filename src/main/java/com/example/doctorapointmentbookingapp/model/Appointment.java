package com.example.doctorapointmentbookingapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinTable(name = "appointment_doctor", joinColumns =@JoinColumn(name = "id") )
    private Doctor doctor;
    @OneToOne
    @JoinTable(name = "appointment_provider", joinColumns =@JoinColumn(name = "id") )
    private Provider provider;
    @OneToOne
    @JoinTable(name = "appointment_patient", joinColumns =@JoinColumn(name = "id") )
    private Patient patient;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    private int Status;
    private String remark;


}
