package Book;

import services.MailService;

public class EBook extends book{
    private String FileType;

    public EBook(String ISBN, String title, String author, int publishYear, double price, String fileType) {
        super(ISBN, title, author, publishYear, price);
        this.FileType =  fileType ;
    }

    @Override
    public double buy(int quantity, String email, String address) {
      if (quantity<=0){
          throw  new IllegalArgumentException("Quantity must be greater than 0");
      }
        MailService.send(email);
        System.out.println("Quantum book store: Sent " + quantity + "x '" + title + "' (" + FileType + ") to " + email);
        return quantity*price;
    }
    public String getFileType() {
        return FileType;
    }
}
