/*
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
 */
package com.pb.poliscuk.hw4;
import java.util.Scanner;

public class CapitalLetter {
// Этот метод работает с переменной типа StringBuilder, разберу строку посимвольно...    
   public static  String  Letter_UpperCase_String(StringBuilder string_example)
   {
         int i;  //счетчик для цикла
               
        // Движемся в цикле по сторке в поисках символа "Пробел"
         for(i=0; i<=string_example.length()-1; i++)
           {
              // Если я обнаруживаю в строке символ "пробел"
              // следующему символу необходимо сделать UpperCase
             
              if ((string_example.charAt(i)) == ' ')
                 string_example.setCharAt(i+1,Character.toUpperCase(string_example.charAt(i+1)));
            }
        return string_example.toString();
   }
 // перегрузим метод под тип STRING
public static  String  Letter_UpperCase_String(String string_example)
   {
         String upper_case_line = "";
         Scanner lineScan = new Scanner(string_example);
         //разобьем полученную строку на слова
         while(lineScan.hasNext()) {
         String word = lineScan.next(); 
         // в каждом слове первый символ преобразовываем в верхний регистр
         upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
               
       return upper_case_line;
   }

//****************** 
    
    public static void main (String[] args) {
        StringBuilder string_ = new StringBuilder ("Ехали медведи на велосипеде.\n" +
                                                          "А за ними кот задом наперёд.\n" +
                                                          "А за ним комарики на воздушном шарике.\n" +
                                                          "А за ними раки на хромой собаке.\n" +
                                                          "Волки на кобыле. Львы в автомобиле.\n" +
                                                          "Зайчики в трамвайчике. Жаба на метле… \n" +
                                                          "Едут и смеются, пряники жуют..");
       
        
        String string2="Добрый доктор Айболит! Он под деревом сидит. Приходи к нему лечиться и корова, и волчица, и жучок, и червячок, и медведица!";
        
        
            // Печатаем первоначальную строку
              System.out.println("************ До  преобразования ***************************");
            System.out.println(string_);
            System.out.println("************ После  преобразования тип - StringBuilder *******************");
            // Вызываем нашу функцию.. 
            System.out.println(Letter_UpperCase_String(string_));
            System.out.println("************ До  преобразования ***************************");
            System.out.println(string2);
            System.out.println("\n ************ После  преобразования тип - String *******************");
            System.out.println(Letter_UpperCase_String(string2));
            System.out.println("\n--===  А теперь введите свое предложение, которое я обработаю..  ===--");
            Scanner scanner = new Scanner(System.in);
            String user_string = scanner.nextLine();
            System.out.println(Letter_UpperCase_String(user_string));

        
}
}
