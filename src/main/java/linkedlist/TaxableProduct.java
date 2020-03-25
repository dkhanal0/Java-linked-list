package linkedlist;

public class TaxableProduct extends Product {

    // From previous assignment

    public TaxableProduct(String productName, String ISBN, double unitPrice)
    {
        super(productName, ISBN, unitPrice);
    }

    // Implement values() method..
    @Override
    public String values() {
        return  (getProductName() + ":" + getIsbn() + ":" + getUnitPrice() + ":" + "taxable");
    }

}
