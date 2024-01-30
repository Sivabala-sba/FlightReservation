package com.FlightReservation.controllers;

import com.FlightReservation.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReservationController {
    @Autowired
    private FlightRepository flightRepository;
}
