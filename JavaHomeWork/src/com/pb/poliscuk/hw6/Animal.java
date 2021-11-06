package com.pb.poliscuk.hw6;

public abstract class Animal {

    public String food;       // что животное любит кушать
    public String location;   // где животное обитает 

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void eat();

    public abstract String makeNoise();

    public void sleep() {
        System.out.println("Животное спит.");
    }
}
