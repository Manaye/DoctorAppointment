package com.example.doctorapointmentbookingapp.service;


import com.example.doctorapointmentbookingapp.model.Appointment;

import java.util.Optional;

public interface AppointementService {
    Iterable<Appointment> listAllAppointment();
    Optional<Appointment> getAppointmentById(Long id);
    Appointment saveAppointment(Appointment appointment);
    void deleteAppointment(Long id);
}
