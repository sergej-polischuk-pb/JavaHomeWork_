package com.pb.poliscuk.hw6;

public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       
         
        Animal[] myAnimal = new Animal[3] ;
        myAnimal[0]= new Dog();
        myAnimal[1] = new Cat();
        myAnimal[2] = new Horse();
        
        
     Class veterinarian = Class.forName("Veterinarian");
        Object object = veterinarian.newInstance();
        
        for (int i=0; i<myAnimal.length; i++)
        {
           
        }
        
    }
    }

