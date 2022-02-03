package com.flight;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Flight fli = new Flight("12345", "12EQ", 200, 201);
        System.out.println(fli.getFlightDetails());
        Passenger pas = new Passenger("Rajajinagar", "Bangalore", "Karnataka",
                "Kavya", "9767733663", "kavya21@gmail.com");
        System.out.println(pas.getAddressDetails());
        System.out.println(pas.getContactDetails());
        RegularTicket reg = new RegularTicket("12RQ", "Bangalore", "Singapore",
                fli, "05/02/2021 13:00:00", "05/02/2021 17:00:00", pas, "12A",
                18000, true, "No");
        TouristTicket tou = new TouristTicket("12TQ","Bangalore", "Singapore", fli,
                "05/02/2021 13:00:00", "05/02/2021 17:00:00", pas, "12B",
                18000, true, "4","RAMA,2nd street","NO");
        printTicketDetails(reg);
        printTicketDetails(tou);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

}
