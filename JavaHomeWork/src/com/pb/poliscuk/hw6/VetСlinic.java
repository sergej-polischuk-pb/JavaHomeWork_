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
public class VetСlinic {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо и косточки", "В будке возле дома");
        animals[1] = new Cat("Молоко и рыба", "В доме где живут люди");
        animals[2] = new Horse("Сено и овес", "Конюшня");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
