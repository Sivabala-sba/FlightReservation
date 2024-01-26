package com.FlightReservation.repositories;

import com.FlightReservation.domains.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
