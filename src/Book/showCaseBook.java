package Book;

public class showCaseBook extends book{

    public showCaseBook(String ISBN, String title, String author, int publishYear, double price) {
        super(ISBN, title, author, publishYear, price);
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw  new UnsupportedOperationException("Showcase books are not for sale.");
    }
}
