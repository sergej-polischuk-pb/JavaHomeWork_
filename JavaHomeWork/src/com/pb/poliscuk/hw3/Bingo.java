/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.poliscuk.hw3;
import java.util.Scanner;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author serg
 */
public class Bingo {
    public static void main(String[] args) {
        char repeat;
        char user_ready;
        
        int int_random=0; //программа загадывает номер
        int user_number;  // число вводимое пользователем
        int counter=0; //счетчик угадываний числа пользователем
        
        System.out.println("Сыграем в игру? Программа загадает число от 0 до 100, а вы попытаетесь его отгадать...");
        System.out.print("Готовы?  (Y/N) - ");
        Scanner input = new Scanner(System.in);     //считываем введенный символ
        user_ready=input.next().charAt(0);
        user_ready=Character.toLowerCase(user_ready); // преобразовываем введенный символ в строчный
        // если пользователь ответил - "No" - попрощаемся с ним и закроем программу
        if (user_ready=='N') { System.out.println("Всего хорошего... Приходите еще."); System.exit(0);}
       
//***********   Игрок готов играть *************************
do {
        int_random = ThreadLocalRandom.current().nextInt(1, 101); //программа загадывает номер в диапазоне 0..100
        System.out.println("Я загадала число  - " + int_random);
             do { 
                // 
                  System.out.print("Ваше число? - "); 
                  user_number=input.nextInt();   counter++;//считываем число и увеличиваем счетчик попыток угадать число
                      if (user_number > int_random )   
                          System.out.print("Ваше число больше числа загаданного программой... ");
                     else
                         if (user_number < int_random )  
                          System.out.print("Ваше число меньше числа загаданного программой... ");
                      else {System.out.println("Поздравляю! Вы угадали число c "+counter + " раза!"); counter=0;}
                      // если через 7 попыток пользователь не угадал число - спросим, будем продолжать угадывать или нет
                      if (counter!=0 && (counter % 7)==0) 
                      {
                          System.out.println("Вы слишком долго не можете угадать число...  Будем продолжать?  Y/N ");
                          repeat=input.next().charAt(0);
                          repeat=Character.toUpperCase(repeat);
                          // Если продолжать не будем - прощаемся и закрываем программу
                          if (repeat=='N') {
                                                System.out.println("Ну что-ж.. Приходите, сыграем еще ....");
                                                System.exit(0);
                                            }
                      }
                }
              while (int_random!=user_number);
        
        System.out.print("Сыграем еще? Y/N - ");
        repeat=input.next().charAt(0);
        repeat=Character.toUpperCase(repeat);
        counter=0;
        } 
        while (repeat!='N');
        System.out.println("Ну что-ж.. Приходите, сыграем еще разок....");
    }
}
        
