package data.logic;

import data.Product;

public class Document {
    private Product product;

    public Document(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void printDocument() {
    }
}
