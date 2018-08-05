package com.kayakwise.eurekaclient;

public class Person {

    private String idCard;
    private String name;
    //    private Gender gender;
    private double height;

//    private

//    public enum Gender {
//        MAN,
//        WOMAN;
//    }


    public Person() {

    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
