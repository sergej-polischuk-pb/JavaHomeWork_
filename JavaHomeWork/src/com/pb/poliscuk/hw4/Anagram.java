/*
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.

РЕШЕНИЕ....

1) загоняем строку_А в массив_А.
2) загоняем строку_В в массив_В.
3) сортируем массивы по возрастанию
4) сверяем элементы массива. Если находим не соответствие - строки не являются анаграммами
 */
package com.pb.poliscuk.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    
    public static Boolean FindAnagram (String stringA, String stringB){ // на входе строкаА и строкаВ, на выходе True or False
        if (stringA.length()!=stringB.length())  //если длина строк разнится - это не анаграммы
          { 
              return false;
          }
        // с помощью регулярных выражений отставим в строках только цифры и буквы
        stringA=stringA.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
        stringB=stringB.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
        char[] stringA_array = stringA.toCharArray(); // преобразовываем строки в массивы символов
        char[] stringB_array = stringB.toCharArray();
        Arrays.sort(stringA_array); // сортируем оба массива 
        Arrays.sort(stringB_array);
        
        int i=0;
        for (i=0; i<stringA_array.length; i++) // проходим по всем элементам массива
           {
              if (stringA_array[i]!=stringB_array[i]) // и сравниваем элементы массивА[i]=массивB[i]
               { 
                   return false;                       // если элементы массива не совпадают - это не анаграммы
               }
           }
        return true;  // Если все элементы массива совпали - введенные строки -  анаграммы
        }
    
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первую строку....: ");
        String strA = input.nextLine();
        System.out.print("Введите вторую строку....: ");
        String strB = input.nextLine();
                
        System.out.println("Резуьтат проверки строк:");
        // подсунем для обработки наши строки
        if (FindAnagram(strA, strB))  System.out.println("Строки являются анаграммами");
          else System.out.println("Строки не являются анаграммами");
      
     
    }
    
}
