package SingleResponsibility;

public class Invoice {

    private Book book;
    private int quantity;
    private double discount;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discount, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;

    }

    public double calculateTotal() {
        double price = ((book.getPrice() - book.getPrice() * discount) * this.quantity);
        return price * (1 + taxRate);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
