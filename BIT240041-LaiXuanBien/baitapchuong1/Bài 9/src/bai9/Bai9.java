package bai9;

import java.util.TreeMap;

public class Bai9 {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Danh sach san pham: " + products);

        System.out.println("Tu K den M:");
        System.out.println(products.subMap("K", "M"));
    }
}
