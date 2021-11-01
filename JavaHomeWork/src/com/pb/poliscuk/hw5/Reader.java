/*
 */
package com.pb.poliscuk.hw5;

/**
 *
 * @author serg
 */
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
}
