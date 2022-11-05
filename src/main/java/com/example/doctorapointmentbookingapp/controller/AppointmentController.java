package com.example.doctorapointmentbookingapp.controller;

import com.example.doctorapointmentbookingapp.model.Appointment;
import com.example.doctorapointmentbookingapp.service.AppointmentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/appointment/")
public class AppointmentController {
    private final AppointmentServiceImpl appointmentServiceImpl;

    public AppointmentController(AppointmentServiceImpl appointmentServiceImpl) {
        this.appointmentServiceImpl = appointmentServiceImpl;
    }

    @GetMapping (value = "find/{id}")
    public Optional<Appointment> getConformedAppointment(Long id){

        return appointmentServiceImpl.getAppointmentById(id);
    }
    @PostMapping(value = "create")
    public Appointment createAppointment(@RequestBody Appointment appointment) {

        return appointmentServiceImpl.saveAppointment(appointment);
    }
    @DeleteMapping (value = "delete/{id}")
    public void deleteAppointment(Long id) {

    }
    @PutMapping(value = "update")
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentServiceImpl.saveAppointment(appointment);
    }
}
