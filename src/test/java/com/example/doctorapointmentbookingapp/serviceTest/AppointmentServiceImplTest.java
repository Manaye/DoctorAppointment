package com.example.doctorapointmentbookingapp.serviceTest;

import com.example.doctorapointmentbookingapp.model.Appointment;
import com.example.doctorapointmentbookingapp.repository.AppointmentRepo;
import com.example.doctorapointmentbookingapp.service.AppointmentServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
public class AppointmentServiceImplTest {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Before(value = "")
    public void setUp () throws Exception {

    }

    @Test
    public void testPersistence() {
        Appointment appointment= new Appointment();
        appointment.setId(1l);

        appointmentRepo.save(appointment);

        Appointment newAppointment = appointmentRepo.findById(appointment.getId()).orElse(null);

        Assert.assertNotNull(appointment.getId());
        Assert.assertEquals((Long) 1l,appointment.getId() );

        Assert.assertNotNull(newAppointment.getId());
        Assert.assertEquals((Long) 1l,newAppointment.getId() );
    }
}
