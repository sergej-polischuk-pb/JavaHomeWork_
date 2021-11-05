package com.pb.poliscuk.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Animal[] myAnimal = new Animal[3];
         Class clazz = myAnimal.getClass();
        myAnimal[0] = new Dog();
        myAnimal[1] = new Cat();
        myAnimal[2] = new Horse();

        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));
        
        
      //  Class veterinarian = Class.forName("Veterinarian");
      //  Object object = veterinarian.newInstance();
        Class myClinic = Class.forName("Veterinarian");
        

      
      

        for (int i = 0; i < myAnimal.length; i++) {
         //   ((Veterinarian)object).treatAnimal(myAnimal[i]);
        }
    }
}
