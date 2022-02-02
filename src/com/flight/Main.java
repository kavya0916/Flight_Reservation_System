package com.flight;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight fli = new Flight("1234", "62566", 200 , 50 );
        Passenger pas = new Passenger("rajajinagar", "Bangalore", "Karnataka",
                "Kavya", "9762767785", "kavya@gmail.com");
        System.out.println(pas.getAddressDetails());
        System.out.println(pas.getContactDetails());
        Ticket tic = new Ticket("pnr12", "Bangalore", "Mumbai",
                fli , "12:00" , "02:30", pas, "12a", 20000f, true);


    }
}
