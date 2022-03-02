package day24_jdbc.src.ex01.jdbc;

import java.sql.*;

public class MainEntry {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        //드라이브로드
        Class.forName("oracle.jdbc.OracleDriver");
        System.out.println("driver load success");
        //2. Connection & Open
                        //driver:@IP:portNumber:SID ==> jdbc:oracle:thin:@localhost:1521:orcl
        String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=/Users/macbookpro/YunSeongOh/Wallet_kosaDB";
        String uid = "smile";
        String pwd = "xxxxxxAt22cc";

        try {
            conn = DriverManager.getConnection(url, uid, pwd);
            System.out.println("connection success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. 사용(DML 명령)
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select * from gift");
        while(rs.next()) {
            int gno = rs.getInt(1);
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt(4);
            System.out.println(gno+"\t" + gname+"\t"+ g_s+"\t"+ g_e );

        }
        //4. 자원반환(닫기)
        rs.close(); stmt.close(); conn.close();
    }
}
