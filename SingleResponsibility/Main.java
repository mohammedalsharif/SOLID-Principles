package SingleResponsibility;


public class Main {
    public static void main(String[] args) {

        
        
        
        Book b1 = new Book("SOLID", "Mohammed", 2020, 500);

        Invoice invoice = new Invoice(b1, 3, 50, 5);

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoiceTotal();

        InvoicePersistence invoicePersistence = new InvoicePersistence(invoice);
        invoicePersistence.saveToFile("MyFile");

    }
}
