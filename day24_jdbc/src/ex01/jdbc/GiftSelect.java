package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connUtil.DBConnection;   // DB 연결 유틸리티 

public class GiftSelect {
	public static void main(String[] args) 
				throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		1. 드라이브 로드
		conn = DBConnection.getConnection();
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or 전역데이터베이스명)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. 사용 (DML 명령) - select 
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM GIFT");  // ctrl+shift+X
		
		System.out.println("상품번호\t\t상품명\t\t최저가\t최고가");
		
		while (rs.next()) {
			int gno = rs.getInt(1);     
			String gname = rs.getString("gname");  // get자료형("필드명"); 권장함
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t\t"+gname+"\t\t  "+g_s+"\t"+g_e);
		}
		
//		4. 자원반환(닫기)
		rs.close();		stmt.close();		conn.close();
	}
}
