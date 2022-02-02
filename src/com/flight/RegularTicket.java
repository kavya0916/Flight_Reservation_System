package com.flight;

public class RegularTicket extends Ticket{
    String specialServices;

    public RegularTicket(String pnr, String destinationFrom, String departureTo, Flight flight, String departureDateTime, String arriveDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        super(pnr, destinationFrom, departureTo, flight, departureDateTime, arriveDateTime, passenger, seatNo, price, cancelled);
    }

    String checkSpecialServices(){
    return null;
    }
    void updateSpecialSErvices(String specialServices){

    }


}
