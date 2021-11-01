/*
 */
package com.pb.poliscuk.hw5;

/**
 *
 * @author serg
 */
import static com.pb.poliscuk.hw5.Library.UserLib;
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
    static void takeBook(int countBook){
        System.out.print("\n"+ UserLib[9].userFIO +" взял " + countBook +" книги");
    }
    
     /*  будет принимать переменное количество названий книг. 
        Выводит на консоль сообщение
        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     */
    static void takeBook(String... nameBook) {
        System.out.print("\n Петров В.В. взял книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            System.out.print(nameBook[i] + " ");
        }
        
     /* который будет принимать переменное количество объектов класса Book.
        Выводит на консоль сообщение :
            "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), 
                                      Словарь (Сидоров А. В 1980 г.), 
                                      Энциклопедия (Гусев К. В. 2010 г.)".
        
     */   
    
    
}
}
