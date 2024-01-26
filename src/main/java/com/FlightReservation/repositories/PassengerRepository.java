package com.FlightReservation.repositories;

import com.FlightReservation.domains.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
