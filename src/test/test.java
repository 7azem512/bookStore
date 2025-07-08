package test;

import Book.EBook;
import Book.PaperBook;
import Book.book;
import Book.showCaseBook;
import Store.BookStore;

public class test {
    public static void main(String[] args) {
        BookStore bs = getBookStore();
        try {
    double price =bs.BuyBook("isbn11111",2,"hazem@gmail.com","6 October City");
    System.out.println("Quantum book store: Paid  "+price);
}
catch(Exception e) {
    System.out.println("Exception in BuyBook"+e.getMessage());
}
try {
    double price= bs.BuyBook("isbn22222",2,"hazem@gmail.com","6 October City");
    System.out.println("Quantum book store: Paid  "+price);
}catch(Exception e) {
    System.out.println("Exception in BuyBook"+e.getMessage());
}
try {
    bs.BuyBook("isbn3333",1,"h@gmail.com","tanta");
}catch (Exception e) {
    System.out.println("Exception in BuyBook"+e.getMessage());
}
        try {
            bs.BuyBook("isbn4444",1,"h@gmail.com","tanta");
        }catch (Exception e) {
            System.out.println("Exception in BuyBook"+e.getMessage());
        }


    }

    private static BookStore getBookStore() {
        BookStore bs = new BookStore();
        book paperBook=new PaperBook("isbn11111", "oop","hazem",2015,200.0,6);
        book EBook=new EBook("isbn22222","java","omar",2020,300.0,"PDF");
        book showcaseBook =new showCaseBook("isbn3333","computer","ali",2010,0.0);
        book showcaseBook2 =new showCaseBook("isbn4444","computer","ali",2023,0.0);

        bs.addBook(paperBook);
        bs.addBook(EBook);
        bs.addBook(showcaseBook);
        bs.addBook(showcaseBook2);

        bs.removedOutDatedBook(10);
        return bs;
    }
}
