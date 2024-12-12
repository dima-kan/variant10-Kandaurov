package ua.edu.chmnu.ce.c2.jid;

import java.util.ArrayList;
import java.util.List;

// Base class for a generic Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

// Derived class for an Electronic product
class Electronic extends Product {
    private int warrantyPeriod;

    public Electronic(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", warrantyPeriod=" + warrantyPeriod + " months";
    }
}

// Derived class for a Grocery product
class Grocery extends Product {
    private String expirationDate;

    public Grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", expirationDate='" + expirationDate + "'";
    }
}

// Main class to demonstrate functionality
public class DesignClasses {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronic("Laptop", 1200.00, 24));
        products.add(new Electronic("Smartphone", 800.00, 12));
        products.add(new Grocery("Milk", 1.50, "2024-12-31"));
        products.add(new Grocery("Bread", 2.00, "2024-12-15"));

        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}