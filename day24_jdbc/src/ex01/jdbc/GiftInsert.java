package day24_jdbc.src.ex01.jdbc;

import java.sql.*;

public class GiftInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        //드라이브로드
        Class.forName("oracle.jdbc.OracleDriver");
        System.out.println("driver load success");
        //2. Connection & Open
                        //driver:@IP:portNumber:SID ==> jdbc:oracle:thin:@localhost:1521:orcl
        String url = "jdbc:oracle:thin:@edudb_high?TNS_ADMIN=/Users/macbookpro/YunSeongOh/Wallet_edudb";
        String uid = "user02";
        String pwd = "xxxxxxAt22cc";

        try {
            conn = DriverManager.getConnection(url, uid, pwd);
            System.out.println("connection success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. 사용(DML 명령)
        stmt = conn.createStatement();
        //String sql = "INSERT INTO GIFT VALUES(12,'USB',100,2000");
        String sql = "INSERT INTO GIFT VALUES("+12+","+"USB"+","+100+","+2000+")";
        int result = stmt.executeUpdate(sql);
        //4. 자원반환(닫기)
        rs.close(); stmt.close(); conn.close();
    }
}
