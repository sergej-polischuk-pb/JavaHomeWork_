/*
 */
package com.pb.poliscuk.hw5;

/**
 *
 * @author serg
 */
import static com.pb.poliscuk.hw5.Library.userLib;
import java.util.Date;

public class Reader {

    String userFIO; // ФИО пользователя библиотеки
    String numberTicket; //номер читательского билета
    String faculty; //название факультета
    int yearBirthday; //год рождения
    String phoneNumber; // номер телефона пользователя

    public void UserLib(String userFIO, String numberTicket, String faculty, int yearBirthday, String phoneNumber) {
        this.userFIO = userFIO;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.yearBirthday = yearBirthday;
        this.phoneNumber = phoneNumber;
    }

    public void getInfoUserLib() {
        System.out.print(this.userFIO);
        System.out.print(" - " + this.numberTicket);
        System.out.print(" - \"" + this.faculty + "\"");
        System.out.print(" - " + this.yearBirthday + "р.н.");
        System.out.println(" - " + this.phoneNumber);
    }

    /* который будет принимать количество взятых книг. 
       Выводит на консоль сообщение 
       "Петров В. В. взял 3 книги".
     */
    public void takeBook(int countBook) {
        System.out.print("\n" + this.userFIO + " взял " + countBook + " книги");
    }

    /*  будет принимать переменное количество названий книг. 
        Выводит на консоль сообщение
        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     */
    public void takeBook(String... nameBook) {
        System.out.print("\n" + this.userFIO + "взял книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            System.out.print("\""+nameBook[i] + "\", ");
        }

    }

    /* который будет принимать переменное количество объектов класса Book.
        Выводит на консоль сообщение :
            "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), 
                                      Словарь (Сидоров А. В 1980 г.), 
                                      Энциклопедия (Гусев К. В. 2010 г.)".
     */
    public void takeBook(Book[] books, int... index) {
        System.out.print("\n" + this.userFIO + " взял книги:");
        for (int i = 0; i < index.length; i++) {
            System.out.print("\""+books[index[i]].nameBook + "\" (" + books[index[i]].authorBook + books[index[i]].yearEditionBook + "); ");
        }
    }
    
    // выводит на консоль сообщения: 
    // "Петров В. В. вернул 3 книги"
    public void returnBook(int countBook) {
        System.out.print("\n" + this.userFIO + " вернул " + countBook + " книги");
    }
    
    public void returnBook(String... nameBook) {
        System.out.print("\n" + this.userFIO + " вернул книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            System.out.print("\"" + nameBook[i] + "\", ");
        }
    }
    
    public void returnBook(Book[] books, int... index) {
        System.out.print("\n" + this.userFIO + " вернул книги:");
        for (int i = 0; i < index.length; i++) {
            System.out.print("\""+books[index[i]].nameBook + "\" (" + books[index[i]].authorBook + books[index[i]].yearEditionBook + "); ");
        }
    }
}
