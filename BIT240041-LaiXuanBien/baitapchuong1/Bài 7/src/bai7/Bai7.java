package bai7;

import java.util.TreeSet;

public class Bai7 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach: " + names);
        System.out.println("Phan tu dau: " + names.first());
        System.out.println("Phan tu cuoi: " + names.last());
    }
}
