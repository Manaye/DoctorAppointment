package com.example.doctorapointmentbookingapp.service;

import com.example.doctorapointmentbookingapp.model.Appointment;
import com.example.doctorapointmentbookingapp.repository.AppointmentRepo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointementService {
    private final AppointmentRepo appointmentRepo;

    public AppointmentServiceImpl(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    @Override
    public Iterable<Appointment> listAllAppointment() {
        return appointmentRepo.findAll();
    }

    @Override
    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepo.findById(id);
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id) {

    }
}
