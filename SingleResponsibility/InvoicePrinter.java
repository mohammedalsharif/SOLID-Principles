package SingleResponsibility;

public class InvoicePrinter {
   private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoiceTotal(){
        System.out.println(invoice.getQuantity()+"x"+invoice.getBook().getName()+""+invoice.getBook().getPrice()+"$");
        System.out.println("Discount: "+invoice.getDiscount());
        System.out.println("Tax Rate: "+invoice.getTaxRate());
        System.out.println("Total: "+invoice.getTotal());
    }
}
