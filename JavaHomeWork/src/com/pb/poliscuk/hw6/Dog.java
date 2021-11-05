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

public class Dog extends Animal {
    private String doesNotLive;
    
  @Override
    void makeNoise() {
        System.out.println("Грызть косточку....");
    }
    
   @Override
   void eat() {
   System.out.println ("Грызть косточку");
   }
}