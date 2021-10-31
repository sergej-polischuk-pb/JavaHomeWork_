/*
 */
package com.pb.poliscuk.hw5;

public class Library {

   static  Book[] bookLib = new Book[5];

    public static void main(String[] args) {
        
        for (int i=0; i<5; i++) bookLib[i] = new Book();
          bookLib[0].setBook("Java для чайников", "Чак Сфер", 2006);
          bookLib[1].setBook("Книга Чистий код. Створення і рефакторинг за допомогою Agile", "Роберт Сесил Мартин", 2019);
          bookLib[2].setBook("Основы Java", "Николай Прохоренок", 2019);
          bookLib[3].setBook("Як пасти котів", "Дж. Ханк Рейнвотер", 2020);
          bookLib[4].setBook("Стів Джобс", "Уолтер Айзексон", 2011);
          
          
           
          for (int i=0; i<5; i++) bookLib[i].getBook();
    }
}
