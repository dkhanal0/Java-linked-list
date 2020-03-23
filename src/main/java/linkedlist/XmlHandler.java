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
        //System.out.println("Start element");

        // Check if this is an opening element for a product
        // If so, store each of its attribute values
        // Determine type of product (taxable vs. nontaxable)
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //System.out.println("End element");

        // check if this is a closing element for a product
        // If so, add the current product to the product list

    }

    // Return a reference to the product list
    public ProductList getProducts() {
        return productList;
    }
}


