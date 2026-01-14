package bai1;

// Generic class Test
public class Test<T> {

    // biến private kiểu T
    private T value;

    // phương thức set
    public void set(T t) {
        this.value = t;
    }

    // phương thức get
    public T get() {
        return value;
    }

    // hàm main để kiểm thử
    public static void main(String[] args) {
        // Test với Integer
        Test<Integer> intTest = new Test<>();
        intTest.set(100);
        System.out.println("Integer value: " + intTest.get());

        // Test với String
        Test<String> strTest = new Test<>();
        strTest.set("Hello Java");
        System.out.println("String value: " + strTest.get());
    }
}
