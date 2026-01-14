package bai4;

import java.util.ArrayList;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango"); // thêm vị trí index 1
        fruits.set(2, "Grapes"); // thay Banana

        System.out.println("Danh sach: " + fruits);

        System.out.println("Co Apple khong? " +
                fruits.contains("Apple"));
    }
}
