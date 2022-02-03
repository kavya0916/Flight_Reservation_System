package com.flight;

public class Flight  {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int noOfBookedSeats;

    private static int bookingIncrement;

    Flight(String flightNumber, String airline, int capacity, int noOfBookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.noOfBookedSeats = ++bookingIncrement;
    }

    static {
        //fetch data from database and initialize it
        bookingIncrement = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfBookedSeats() {
        return noOfBookedSeats;
    }

    public void setNoOfBookedSeats(int noOfBookedSeats) {
        this.noOfBookedSeats = noOfBookedSeats;
    }

    String getFlightDetails() {
        return flightNumber + ", " + airline + ", " + capacity + ", " + noOfBookedSeats;
    }

    boolean checkAvailability() {
     return    this.noOfBookedSeats < this.capacity;

    }
    void incrementBookingCounter(){
            this.noOfBookedSeats = ++bookingIncrement;
        }
}
