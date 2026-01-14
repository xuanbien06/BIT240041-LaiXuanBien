package bai6;

import java.util.HashSet;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        System.out.println("Cac phan tu duy nhat: " + set);

        // HashSet khong giu thu tu chen vao ban dau
    }
}
