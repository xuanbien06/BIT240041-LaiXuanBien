package baptapchuong2;

class DatabaseConnection {
    
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("--- Kết nối Database đã được khởi tạo! ---");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Đang thực thi: " + query);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM Users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("db1 == db2: " + (db1 == db2));
    }
}