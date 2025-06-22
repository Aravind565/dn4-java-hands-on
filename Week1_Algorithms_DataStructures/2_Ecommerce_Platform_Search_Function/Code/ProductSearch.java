package com.ecommerce.example;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearch(Product[] products, String productName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String productName) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(productName);
            if (comparison == 0) return products[mid];
            else if (comparison < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
