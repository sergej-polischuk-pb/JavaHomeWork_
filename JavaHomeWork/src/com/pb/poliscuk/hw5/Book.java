/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.poliscuk.hw5;

/**
 *
 * @author serg
 */
public  class Book {

   public String nameBook; // название книги
   public String authorBook; //автор книги
   public int yearEditionBook;  // год издания книги
    
    public void setBook (String nameBook, String authorBook, int yearEditionBook)
    {
       this.nameBook=nameBook;
       this.authorBook=authorBook;
       this.yearEditionBook=yearEditionBook;
    }
    
    public void getBook()
    {
        System.out.print(this.nameBook);
        System.out.print(this.authorBook);
        System.out.println(this.yearEditionBook);
    }
    
    

}
