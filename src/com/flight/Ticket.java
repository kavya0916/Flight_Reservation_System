package com.flight;

public class Ticket extends Passenger {
    private String pnr;
    private String destinationFrom;
   private  String departureTo;
   private Flight flight;
   private String departureDateTime;
    private String arriveDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;


    public Ticket(String pnr, String destinationFrom,String departureTo, Flight flight ,String departureDateTime,
    String arriveDateTime , Passenger passenger, String seatNo, float price, boolean cancelled){
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


    String checkStatus(){
    return checkStatus();
    }

    int getFlightDuration(){
        return getFlightDuration();
    }

    void cancel(){

    }

}
