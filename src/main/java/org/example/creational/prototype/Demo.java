package org.example.creational.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProductStorage storage = new ProductStorage();
        storage.load();
        System.out.println(storage);

        ProductStorage storageCloned = (ProductStorage) storage.clone();
        storageCloned.getProducts().add("new product");
        System.out.println(storageCloned);
        System.out.println(storage);
    }
}
