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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Horse extends Animal implements Serializable {

    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Иго-го-го-го!!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Horse)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Horse horse = (Horse) o;
        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{"
                + "food: '" + getFood() + '\''
                + ", location: '" + getLocation() + '\''
                + '}';
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(getFood());
            os.writeObject(getLocation());
        } catch (IOException e) {
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            this.setFood((String) is.readObject());
            this.setLocation((String) is.readObject());
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
