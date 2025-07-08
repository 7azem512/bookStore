package Store;


import Book.book;


import javax.naming.StringRefAddr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStore {
    private List<book> inventory;

    public BookStore() {
       inventory = new ArrayList<book>();
    }
    public void addBook(book book) {
        inventory.add(book);
        System.out.println("Book added");
    }
    public List<book> removedOutDatedBook(int MaxYear){
        List<book> removed=new ArrayList<book>();
        Iterator<book> iterator = inventory.iterator();

        while (iterator.hasNext()) {
            book book = iterator.next();
            if(book.IsOutDate(MaxYear)){
                removed.add(book);
                iterator.remove();
                System.out.println("Book removed"+book.getTitle());
            }
        }
        return removed;
    }
    public double BuyBook(String isbn, int quantity, String email, String address) {
for (book book : inventory) {
    if (book.getISBN().equals(isbn)) {
        return book.buy(quantity,email,address);
    }
}
        throw new IllegalArgumentException(" Book with ISBN '" + isbn + "' not found.");
    }
}
