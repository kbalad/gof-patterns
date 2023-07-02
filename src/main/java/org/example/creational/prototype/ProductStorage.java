package org.example.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage implements Cloneable {

    private final List<String> products;

    public ProductStorage() {
        this.products = new ArrayList<>();
    }

    public ProductStorage(List<String> products) {
        this.products = products;
    }

    public void load() {
        products.add("mac");
        products.add("pc");
        products.add("banana");
    }

    public List<String> getProducts() {
        return products;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ProductStorage(new ArrayList<>(products));
    }

    @Override
    public String toString() {
        return "ProductStorage{" +
                "products=" + products +
                '}';
    }
}
