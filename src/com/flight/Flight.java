package com.flight;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
     private int noOfBookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int noOfBookedSeats){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.noOfBookedSeats = noOfBookedSeats;
    }


    String getFlightDetails(){
        return "";
     }

     boolean checkAvailabilitySeats(){
        return true;
     }

    void incrementBookingCounter(){

    }

}
