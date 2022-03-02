package ex01.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connUtil.DBConnection;   // DB 연결 유틸리티 

public class GiftInsert_pre {
	public static void main(String[] args) 	throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
//		1. 드라이브 로드
		conn = DBConnection.getConnection();
//		conn.setAutoCommit(false);
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or 전역데이터베이스명)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. 사용 (DML 명령) - insert 
		ps = conn.prepareStatement( "INSERT INTO GIFT VALUES( ?, ?, ?, ? )");
		System.out.println("상품번호, 상품명, 최저가, 최고가 입력하세요? ");
		int gno = sc.nextInt();
		String gname = sc.next();
//		int g_s = sc.nextInt();
		int g_e = sc.nextInt();

		ps.setInt(1, gno);
		ps.setString(2, gname);
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, g_e);
		
		int result = ps.executeUpdate();  //

		System.out.println(result +" 데이터 추가 성공함!");
		System.out.println(gname +" 상품이 추가 되었습니다. ");
//		conn.commit();
//		4. 자원반환(닫기)
		ps.close();		conn.close();
	}
}
