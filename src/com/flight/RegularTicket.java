package com.flight;

public class RegularTicket extends Ticket {

    private String specialServices;

    public RegularTicket(String pnr, String destinationFrom, String departureTo, Flight flight,
                         String departureDateTime, String arriveDateTime, Passenger passenger,
                         String seatNo, float price, boolean cancelled, String specialServices) {
        super(pnr, destinationFrom, departureTo, flight, departureDateTime, arriveDateTime, passenger,
                seatNo, price, cancelled);
        this.specialServices = specialServices;

    }

    public RegularTicket(String pnr) {
        super(pnr);
    }


    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    String checkSpecialServices() {
        return this.specialServices;
    }

    public void updateSpecialServices(String specialServices) {
        this.setSpecialServices(specialServices);
    }


}
