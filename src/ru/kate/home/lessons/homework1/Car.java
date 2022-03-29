package ru.kate.home.lessons.homework1;

public class Car extends Vehicle {

    private String gearType;

    public Car(String title, int speed, Long number) {
        super(title, speed, number);
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}
