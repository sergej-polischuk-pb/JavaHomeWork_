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
public class Horse extends Animal {
    private String doesNotLive="Не любит насекомых, резкие звуки..";
   
    @Override  void makeNoise() {
        System.out.println("Поваляться в земле, снегу, почесаться об стену, забор...");
    }
    
    @Override void eat() {
   System.out.println ("Кушает траву и любит овес");
   }
    
     @Override public String toString() {
       return "toString overriding..  Horse";
   }
   
   @Override public boolean equals(Object obj) {
       return true;
   }
   
   @Override public int hashCode() {
       return 999;
   }
}
