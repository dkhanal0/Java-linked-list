package linkedlist;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlHandler extends DefaultHandler {

    ProductList productList = new ProductList(); // An empty product list
    Product currentProduct = null;  // Reference to the current Product


    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
         System.out.println("Start element");

        // Check if this is an opening element for a product
        if (qName.equals("product")) {

            // If so, store each of its attribute values
            String name = attributes.getValue("name");
            String isbn = attributes.getValue("isbn");
            String price = attributes.getValue("unitPrice");
            String type = attributes.getValue("taxable");

            // Determine type of product (taxable vs. nontaxable)
            if (attributes.getValue("taxable") !=null && type.contentEquals("true")){
                currentProduct=new TaxableProduct(name, isbn, Double.parseDouble(price));
            }else {
                currentProduct=new NonTaxableProduct(name, isbn, Double.parseDouble(price));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //System.out.println("End element");

        // check if this is a closing element for a product
        if (qName.equals("product")) {

            // If so, add the current product to the product list
            productList.add(currentProduct);

        }
    }
    // Return a reference to the product list
    public ProductList getProducts() {
        return productList;
    }
}


