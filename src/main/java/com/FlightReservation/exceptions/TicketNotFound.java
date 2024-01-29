package com.FlightReservation.exceptions;

public class TicketNotFound extends RuntimeException{
    public TicketNotFound(String message){
        super(message);
    }
}
