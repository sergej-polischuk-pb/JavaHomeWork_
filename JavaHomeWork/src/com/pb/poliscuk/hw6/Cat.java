/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.poliscuk.hw6;

/**
 *
 * @author serg
 */
public class Cat extends Animal {

    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мя-я-я-я-я-я-у!!!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "food='" + getFood() + '\''
                + ", location='" + getLocation() + '\''
                + '}';
    }
}
