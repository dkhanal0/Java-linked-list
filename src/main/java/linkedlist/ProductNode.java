package linkedlist;

public class ProductNode {
    Product product; // Product reference stored in this node
    ProductNode next; // Reference to the next node

    // Constructor
    public ProductNode(Product product) {
        this.product = product;
        this.next = null;
    }

    // Recursive add method -- add a new product node to the end of the list
    public void add(Product p) {
        // Check if this is the last node
        if (next == null) {
            // Last node -- instantiate a new node
            next = new ProductNode(p);
        } else {
            // Recursive call on the next node
            next.add(p);
        }
    }
    // Recursive size method -- count the number of nodes, starting with this one
    public int size() {
        // Check if there is a next node
        if (next == null) {
            // If not, return 1
            return 1;
        } else {
            // Otherwise, recursively count from this node
            return 1 + next.size();
        }
    }
    // Recursive sum method -- sum the unit prices of all products in the list
    public double sum() {
        // Check if there is a next node
        if (next == null) {
            // If not, return the price of the current product
            return product.getUnitPrice();
        } else {
            // Otherwise, compute the sum starting with this node
            return product.getUnitPrice() + next.sum();
        }
        }
    @Override
    public String toString() {
        // Check if there is a next node
        if (next == null) {
            // If not, return the values string
            return "" + product.values();
        } else {
            // Otherwise, return the values of this node, a "new line" character, and the string returned by the next node
            return product.values()+ "\n" + next.toString();
        }
    }
}
