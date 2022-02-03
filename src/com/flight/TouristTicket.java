package com.flight;

import java.lang.reflect.Array;

public class TouristTicket extends Ticket {

    private String getTouristsLocation;
    private String hotelAddress;
    private String selectedTouristLocation;

    public TouristTicket(String pnr, String destinationFrom, String departureTo, Flight flight,
                         String departureDateTime, String arriveDateTime, Passenger passenger, String seatNo,
                         float price, boolean cancelled, String getTouristsLocation, String hotelAddress,
                         String selectedTouristLocation) {
        super(pnr, destinationFrom, departureTo, flight, departureDateTime, arriveDateTime, passenger, seatNo, price, cancelled);
        this.getTouristsLocation = getTouristsLocation;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;

    }

    public String getGetTouristsLocation() {
        return getTouristsLocation;
    }

    public void setGetTouristsLocation(String getTouristsLocation) {
        this.getTouristsLocation = getTouristsLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }


    String getHotelAddress() {
        return hotelAddress;
    }

    void addTouristLocation() {
        String arr[] = new String[5];
        arr[0] = "Universal zone";
        arr[1] = "Singha";
        arr[2] = "Bay of merina";
        arr[3] = "merina beach";
        arr[4] = "china street";


    }

    void removeTouristLocation() {
        String arr1[] = new String[5];

    }
}
