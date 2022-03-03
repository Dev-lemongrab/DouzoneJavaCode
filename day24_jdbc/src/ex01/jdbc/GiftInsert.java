package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connUtil.DBConnection;   // DB 연결 유틸리티 

public class GiftInsert {
	public static void main(String[] args) 
				throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; 
		Scanner sc = new Scanner(System.in);
		
//		1. 드라이브 로드
		conn = DBConnection.getConnection();
//		conn.setAutoCommit(false);
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or 전역데이터베이스명)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. 사용 (DML 명령) - insert 
		stmt = conn.createStatement();
		// insert into gift values(11,'컵', 10, 200);
//		String sql = "INSERT INTO GIFT VALUES(12,'USB', 100, 2000)";
//		String sql = "INSERT INTO GIFT VALUES("+args[0] +",' " + args[1]+" ', " + args[2] +", " + args[3] +")"; 
		System.out.println("상품번호, 상품명, 최저가, 최고가 입력하세요. ");
		int gno = sc.nextInt();
		String sql = "INSERT INTO GIFT VALUES("+gno +",' " + sc.next()+" ', " + sc.nextInt() +", " + sc.nextInt()+")"; 
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result +" 데이터 추가 성공함!");
//		conn.commit();
//		4. 자원반환(닫기)
		stmt.close();		conn.close();
	}
}
