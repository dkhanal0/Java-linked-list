package linkedlist;

public class NonTaxableProduct extends Product {


    // From previous assignment

    public NonTaxableProduct(String productName, String ISBN, double unitPrice) {
        super(productName, ISBN, unitPrice);

    }

    // Implement values() method
    @Override
    public String values() {
        return (getProductName()+ ":" + getIsbn() + ":" + getUnitPrice() + ":" +"nontaxable");

    }

}
