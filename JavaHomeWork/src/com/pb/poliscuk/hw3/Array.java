package com.pb.poliscuk.hw3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Poliscuk Sergej
 */
public class Array {
    public static void main(String[] args) {
        int countPositiveValue=0;  //счетчик кол-ва положительных числе
        int summaElementovArray=0;
        int index_i; // счетчик для прохождения массива
        int[] myArray = new int[10];   // Объявим массив myArray на 10-ть элементов 
        Scanner input = new Scanner (System.in);
        System.out.println("Заполните массив целами числами типа Int");
        
// Пользователь заполняет массив 
        for (index_i=0; index_i<=myArray.length-1; index_i++)
        { System.out.print("myArray["+index_i+"]= ");
        myArray[index_i]=input.nextInt();
        
// считаем кол-во положительных элементов массива
        if (myArray[index_i]>0) countPositiveValue++;
        // сумма всех элементов массива
        summaElementovArray+=myArray[index_i];
               
        }
        System.out.println("Введенный массив: " + Arrays.toString(myArray));             //выводим массив на консоль
        System.out.println("Сумма всех элементов массива myArray = " + summaElementovArray);
        System.out.println("Количество положительных элементов в массиве - " + countPositiveValue);
         
// сортировка массива пузырьком
          int bufer;
          for (index_i=myArray.length-1; index_i>0; index_i--)
            {
                 for (int j = 0; j < index_i; j++) {
                 
                 if (myArray[j] > myArray[j + 1]) {                  // сравнение
                    bufer = myArray[j];                            // если истино, то меняем
                    myArray[j] = myArray[j + 1];                    // местами элементы
                    myArray[j + 1] = bufer;
                }
                 }
                 }
    System.out.println("Отсортированный массив: " + Arrays.toString(myArray));  //выводим результат на консоль
    }}
            
      
         
         
    