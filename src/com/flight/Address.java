package com.flight;

public class Address {
    String street, city, state;
    int id;
    public int getId() {
        return this.id;
    }
    public Address(String _street, String _city, String _state) {
        this.street = _street;
        this.city = _city;
        this.state = _state;
    }

    private Address address;
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
}

