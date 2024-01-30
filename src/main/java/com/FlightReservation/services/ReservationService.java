package com.FlightReservation.services;

import com.FlightReservation.domains.Reservation;
import com.FlightReservation.dto.ReservationRequest;

public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
