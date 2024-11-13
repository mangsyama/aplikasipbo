import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // URL koneksi ke database
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/loginform_netbeans";
    private static final String USERNAME = "root"; // Ganti dengan username phpMyAdmin Anda
    private static final String PASSWORD = ""; // Ganti dengan password phpMyAdmin Anda

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Mendaftarkan driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi ke database
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
}