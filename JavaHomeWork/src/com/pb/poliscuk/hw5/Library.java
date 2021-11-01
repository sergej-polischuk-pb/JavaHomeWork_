/*
 */
package com.pb.poliscuk.hw5;

public class Library {

    static Book[] bookLib = new Book[8];
    static Reader[] UserLib = new Reader[11];

    public static void main(String[] args) {
        // заполним библиотеку книгами
        for (int i = 0; i < bookLib.length; i++) {
            bookLib[i] = new Book();
        }
        bookLib[0].setBook("Java для чайников", "Чак Сфер", 2006);
        bookLib[1].setBook("Книга Чистий код. Створення і рефакторинг за допомогою Agile", "Роберт Сесил Мартин", 2019);
        bookLib[2].setBook("Основы Java", "Николай Прохоренок", 2019);
        bookLib[3].setBook("Як пасти котів", "Дж. Ханк Рейнвотер", 2020);
        bookLib[4].setBook("Стів Джобс", "Уолтер Айзексон", 2011);
        bookLib[5].setBook("Приключения", "Артур Конан Дойль", 1978);
        bookLib[6].setBook("Большая энциклопедия", "Гусев К.В.", 2019);
        bookLib[7].setBook("Словарь", "Сидоров А.В.", 1980);

        // пользователи библиотеки
        for (int i = 0; i < UserLib.length; i++) {
            UserLib[i] = new Reader();
        }
        UserLib[0].UserLib("Пупкiн Д.В.", "АК-0047", "Факультет радіоелектроніки, комп'ютерних систем та інфокомунікацій", 1980, "+370632598745");
        UserLib[1].UserLib("Жогов Д.В.", "АК-0041", "Факультет радіоелектроніки, комп'ютерних систем та інфокомунікацій", 1980, "+370632598745");
        UserLib[2].UserLib("Котов Д.В.", "АК-0042", "Факультет літакобудування", 1980, "+370632598745");
        UserLib[3].UserLib("Наумов А.Г.", "АК-0056", "Факультет авіаційних двигунів", 1980, "+370632598745");
        UserLib[4].UserLib("Осiпова У.В.", "АК-0057", "Факультет авіаційних двигунів", 1980, "+370632598745");
        UserLib[5].UserLib("Сергiiва В.Г.", "АК-0050", "Факультет літакобудування", 1980, "+370632598745");
        UserLib[6].UserLib("Старчикова Д.В.", "АК-0051", "Факультет авіаційних двигунів", 1980, "+370632598745");
        UserLib[7].UserLib("Тамаровський С.В.", "АК-0048", "Факультет літакобудування", 1980, "+370632598745");
        UserLib[8].UserLib("Терехова Д.А.", "АК-0040", "Факультет радіоелектроніки, комп'ютерних систем та інфокомунікацій", 1980, "+370632598745");
        UserLib[9].UserLib("Петров В. В.", "АК-0039", "Факультет радіоелектроніки, комп'ютерних систем та інфокомунікацій", 1980, "+370632598745");
        UserLib[10].UserLib("П'яточкин К.В.", "АК-0061", "Факультет літакобудування", 1980, "+370632598745");

        // выводим список всех книг в библиотеке  
        System.out.println("---------  Имеющиеся в библиотеке книги ---------");
        for (int i = 0; i < bookLib.length; i++) {
            bookLib[i].getInfoBook();
        }

        //выводим списк всех пользователей библиотеки
        System.out.println("---------- Пользователи библиотеки --------------");
        for (int i = 0; i < UserLib.length; i++) {
            UserLib[i].getInfoUserLib();
        }

        //  который будет принимать количество взятых книг. 
        // Выводит на консоль сообщение 
        // "Петров В. В. взял 3 книги".
        Reader.takeBook(UserLib[9].userFIO, 3);
        
        // метод takeBook, который будет принимать переменное количество названий книг. 
        // Выводит на консоль сообщение
        // "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        Reader.takeBook(bookLib[5].nameBook, bookLib[6].nameBook, bookLib[7].nameBook);
        
        
    }
}
