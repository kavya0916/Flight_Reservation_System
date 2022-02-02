package com.flight;

public class TouristTicket extends Ticket{
    private String getTouristLocation[];
    private String hotelAddress;
    private String selectedTouristLocation;

    public TouristTicket(String pnr, String destinationFrom, String departureTo, Flight flight, String departureDateTime, String arriveDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        super(pnr, destinationFrom, departureTo, flight, departureDateTime, arriveDateTime, passenger, seatNo, price, cancelled);
    }

    String getHotelAddress(){
    return getHotelAddress();
    }
    void addTouristLocation(String location){

    }
    void removeTouristLocation(String location){

    }

}
