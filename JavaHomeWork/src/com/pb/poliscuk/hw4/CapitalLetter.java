/*
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
 */
package com.pb.poliscuk.hw4;

public class CapitalLetter {
    
   public static  String  Letter_UpperCase_String(StringBuilder string_example)
   {
         int i;  //счетчик для цикла
               
        // Движемся в цикле по сторке в поисках символа "Пробел"
         for(i=0; i<=string_example.length()-1; i++)
           {
              // Если я обнаруживаю в строке символ "пробел"
              // следующему символу необходимо сделать UpperCase
             
              if ((string_example.charAt(i)) == ' ')
              {
                string_example.setCharAt(i+1,Character.toUpperCase(string_example.charAt(i+1)));
              }
            }
        //System.out.println(string_example);
        //return string_example.toString();
        return string_example.toString();
   
   }
   

   
    
    public static void main (String[] args) {
        StringBuilder string_ = new StringBuilder ("Ехали медведи на велосипеде.\n" +
                                                          "А за ними кот задом наперёд.\n" +
                                                          "А за ним комарики на воздушном шарике.\n" +
                                                          "А за ними раки на хромой собаке.\n" +
                                                          "Волки на кобыле. Львы в автомобиле.\n" +
                                                          "Зайчики в трамвайчике. Жаба на метле… \n" +
                                                          "Едут и смеются, пряники жуют..");
        
            // Печатаем первоначальную строку
              System.out.println("************ До  преобразования ***************************");
            System.out.println(string_);
            System.out.println("************ После  преобразования **************************");
            // Вызываем нашу функцию.. 
            System.out.println(Letter_UpperCase_String(string_));
    

        
}
}
