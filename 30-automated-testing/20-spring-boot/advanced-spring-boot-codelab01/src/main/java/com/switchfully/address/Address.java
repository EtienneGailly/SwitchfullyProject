package com.switchfully.address;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "STREET_NAME")
    private String streetName;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "CITY")
    private String city;

    protected Address() {
    }

    public Address(String streetName, String number, String zipCode, String city) {
        if (!isANumber(number)) throw new IllegalArgumentException("house number " + number + " is not a number!");
        if (!isANumber(zipCode)) throw new IllegalArgumentException("zip code " + zipCode + " is not a number!");
        this.streetName = streetName;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    private static boolean isANumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public UUID getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
}
