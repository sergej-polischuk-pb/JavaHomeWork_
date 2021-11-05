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
    public String doesNotLive="Не любит собак ....";
      
    @Override void makeNoise() {
        System.out.println("Ловить птичек и мышей....");
    }
    
    @Override void eat() {
   System.out.println ("кушает мясо и молоко...");
   }
}
