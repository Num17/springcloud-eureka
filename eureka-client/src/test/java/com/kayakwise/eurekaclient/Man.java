package com.kayakwise.eurekaclient;

public class Man extends Person {

    private String email;

    public Man() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Man{" +
                "email='" + email + '\'' +
                '}';
    }
}
