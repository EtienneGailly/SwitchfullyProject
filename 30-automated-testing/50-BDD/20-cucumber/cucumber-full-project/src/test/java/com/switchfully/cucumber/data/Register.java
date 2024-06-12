package com.switchfully.cucumber.data;

import com.github.javafaker.Faker;


public class Register {

    private String inss;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String city;

    private Register(String inss, String firstName, String lastName, String username, String password, String streetName, String streetNumber, String postalCode, String city) {
        this.inss = inss;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public static Register randomRegister() {
        Faker faker = new Faker();
        return new Register(
                faker.numerify("########"),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.internet().password(),
                faker.address().streetName(),
                faker.address().buildingNumber(),
                faker.address().zipCode(),
                faker.address().city()
        );
    }

    public String getInss() {
        return inss;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
