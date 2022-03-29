package ru.kate.home.lessons.homework1;

public class Main {

    public static void main(String[] args) {
        Car carLamborghini = new Car("Lamborghini", 380, 780L);
        carLamborghini.setGearType("4WD");
        Airplain airplainBoing = new Airplain("Boing", 914, 747L);
        airplainBoing.setType("Гражданский");
        Ship shipOasis = new Ship("Oasis", 42, 9383936L);
        shipOasis.setShipClass("Круизный");

        System.out.println("Транспортное средство: " + carLamborghini.getTitle() + ", " + "номер кузова: " + carLamborghini.getNumber() + ", " + "максимальная скорость: " + carLamborghini.getSpeed());
        System.out.println("Привод: " + carLamborghini.getGearType());
        System.out.println("Транспортное средство: " + airplainBoing.getTitle() + ", " + "номер кузова: " + airplainBoing.getNumber() + ", " + "максимальная скорость: " + airplainBoing.getSpeed());
        System.out.println("Тип: " + airplainBoing.getType() );
        System.out.println("Транспортное средство: " + shipOasis.getTitle() + ", " + "номер кузова: " + shipOasis.getNumber() + ", " + "максимальная скорость: " + shipOasis.getSpeed());
        System.out.println("Класс: " + shipOasis.getShipClass());
    }
}


