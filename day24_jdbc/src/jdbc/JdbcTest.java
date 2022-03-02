package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testConnection() {
        try (Connection con =
                     DriverManager.getConnection(
                             "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:\\app\\Oracle\\Wallet_kosaDB",
                             "kingsmile",
                             "xxxxxxAt22cc"
                     )) {
           System.out.println("connection success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

