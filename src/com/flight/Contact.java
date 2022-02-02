package com.flight;

public class Contact {
    String name, phone, email;
    int id;
    public int getId() {
        return this.id;
    }
    public Contact(String _name, String _phone, String _email) {
        this.name = _name;
        this.phone = _phone;
        this.email = _email;
    }
    private Contact contact;
    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }




}
