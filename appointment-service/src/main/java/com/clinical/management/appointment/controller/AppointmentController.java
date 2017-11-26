package com.clinical.management.appointment.controller;


import com.clinical.management.appointment.domain.Appointment;
import com.clinical.management.appointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    private AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Appointment create(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{appointmentId}")
    public Appointment get(@PathVariable String appointmentId) {
        return appointmentRepository.findOne(appointmentId);
    }

}
