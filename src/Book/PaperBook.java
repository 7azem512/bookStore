package Book;

import services.ShippingService;

public class PaperBook extends book{
    private int quntity;


    public PaperBook(String ISBN, String title, String author, int publishYear, double price,  int quntity) {
        super(ISBN, title, author, publishYear, price);
        this.quntity=quntity;
    }

    @Override
    public double buy(int quantity, String email, String address) {
      if(quantity>this.quntity){
          throw  new IllegalArgumentException("Not enough stock for book");
      }
      quantity=quantity-this.quntity;
        ShippingService.send(address);
        System.out.println("Quantum book store: Shipped " + quantity + "x '" + title + "' to " + address);

        return quantity * price;

    }
    public int getQuntity() {
        return quntity;
    }
}
