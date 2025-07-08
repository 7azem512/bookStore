package Book;

import java.util.Calendar;

public  abstract class book {
    protected String ISBN;
    protected String title;
    protected String author;
    protected int publishYear;
    protected double price;

    public book(String ISBN, String title, String author, int publishYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  public   Boolean IsOutDate(int MaxYours){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return  (currentYear-MaxYours)>=this.publishYear;
  }
  public abstract double buy(int quantity, String email ,String address);
}
