package ru.kate.home.lessons.homework1;


public class Ship extends Vehicle {

    private String shipClass;

    public Ship(String title, int speed, Long number) {
        super(title, speed, number);
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }
}

