package com.switchfully.rest;

import java.util.Objects;

public class Professor {
    private String firstname;
    private String lastname;

    public Professor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Professor() {
        this.firstname = "";
        this.lastname = "";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstname, professor.firstname) && Objects.equals(lastname, professor.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
