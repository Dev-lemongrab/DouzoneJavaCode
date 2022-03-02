package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) 
				throws  ClassNotFoundException, SQLException {
//		1. 드라이브 로드
		Class.forName("oracle.jdbc.OracleDriver"); //
		System.out.println("driver load success!!");
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or 전역데이터베이스명)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:\\\\app\\\\Oracle\\\\Wallet_kosaDB";
		String uid = "kingsmile";
		String pwd = "xxxxxxAt22cc";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
//		3. 사용 (DML 명령)
		
//		4. 자원반환(닫기)
	}
}
