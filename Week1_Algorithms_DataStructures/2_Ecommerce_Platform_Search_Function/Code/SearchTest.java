package com.ecommerce.example;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        String target = "Phone";

        System.out.println("Linear Search Result:");
        Product result1 = ProductSearch.linearSearch(products, target);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\nBinary Search Result:");
        Product result2 = ProductSearch.binarySearch(products, target);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

