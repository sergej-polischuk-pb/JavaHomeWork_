/*
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.

РЕШЕНИЕ....

1) загоняем строку в массив.
2) повторяем для второго предложения.
3) сортируем массивы по возрастанию
4) сверяем элементы массива. Если находим не соответствие - строки не являются анаграммами
 */
package com.pb.poliscuk.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    
    public static Boolean FindAnagram (String stringA, String stringB){
        if (stringA.length()!=stringB.length()) 
          { 
              //System.out.println("Слова не являются анаграммами..");
              return false;
          }
        char[] stringA_array = stringA.toCharArray();
        char[] stringB_array = stringB.toCharArray();
        Arrays.sort(stringA_array);
        Arrays.sort(stringB_array);
        
        int i=0;
        for (i=0; i<stringA_array.length; i++)
           {
              if (stringA_array[i]!=stringB_array[i]) 
               { 
                   return false;
               }
           }
        return true;
        }
    
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первую строку....: ");
        String strA = input.nextLine();
        System.out.print("Введите вторую строку....: ");
        String strB = input.nextLine();
        
        System.out.println("Резуьтат проверки строк:");
        if (FindAnagram(strA, strB))  System.out.println("Строки являются анаграммами");
          else System.out.println("Строки не являются анаграммами");
      
     
    }
    
}
