package com.pb.poliscuk.hw6;

public class Animal {

    public String food;       // что животное любит кушать
    public String location;   // где животное обитает  

    void makeNoise() {
        System.out.println("любит что-то делать");
    }

    void eat() {
        System.err.println("что-то любит кушать");
    }

    void sleep(String name) {
        
        
        System.out.println(name + "спит... Не будите!");
    }
}
