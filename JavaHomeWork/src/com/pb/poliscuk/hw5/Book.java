/**
 * тестовый комментария для Javadoc
 * */
package com.pb.poliscuk.hw5;

/**
 *
 * @author serg
 */
/**
 * class Book
 */
public class Book {

    public String nameBook;
    /**
     * название книги *
     */
    public String authorBook;
    /**
     * автор книги *
     */
    public int yearEditionBook;

    /**
     * год издания книги *
     */
    public void setBook(String nameBook, String authorBook, int yearEditionBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearEditionBook = yearEditionBook;
    }

    public void getInfoBook() {
        System.out.print("\"" + this.nameBook + "\"");
        System.out.print(" - " + this.authorBook);
        System.out.println(" - " + this.yearEditionBook);
    }

}
