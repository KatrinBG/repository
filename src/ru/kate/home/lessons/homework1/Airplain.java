package ru.kate.home.lessons.homework1;


public class Airplain extends Vehicle {

    private String type;

    public Airplain(String title, int speed, Long number) {
        super(title, speed, number);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


