package com.example.doctorapointmentbookingapp.repository;


import com.example.doctorapointmentbookingapp.model.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Long > {
}
