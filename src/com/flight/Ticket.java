package com.flight;

abstract public class Ticket {
    private String pnr;
    private String destinationFrom;
    private String departureTo;
    private Flight flight;
    private String departureDateTime;
    private String arriveDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr) {
        this.pnr = pnr;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDestinationFrom() {
        return destinationFrom;
    }

    public void setDestinationFrom(String destinationFrom) {
        this.destinationFrom = destinationFrom;
    }

    public String getDepartureTo() {
        return departureTo;
    }

    public void setDepartureTo(String departureTo) {
        this.departureTo = departureTo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArriveDateTime() {
        return arriveDateTime;
    }

    public void setArriveDateTime(String arriveDateTime) {
        this.arriveDateTime = arriveDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Ticket(String pnr, String destinationFrom, String departureTo, Flight flight, String departureDateTime,
                  String arriveDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        super();
        this.pnr = pnr;
        this.destinationFrom = destinationFrom;
        this.departureTo = departureTo;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arriveDateTime = arriveDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }


    String checkStatus() {
        if (this.cancelled = cancelled) {
            return "Cancel";
        } else {
            return "confirmed";
        }
    }

    // int getFlightDuration(){

    // }

    //  void cancel(){


    // }


}


