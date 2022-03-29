package ru.kate.home.lessons.homework1;

public class Vehicle {

        private String title;
        private int speed;
        private Long number;

        public Vehicle(String title, int speed, Long number) {
            this.title = title;
            this.speed = speed;
            this.number = number;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public Long getNumber() {
            return number;
        }

        public void setNumber(long number) {
            this.number = number;
        }

}

