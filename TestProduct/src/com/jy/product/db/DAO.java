package com.jy.product.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	static int numberCount = 0;
	
	/* DB와 연결할 객체 */
	public static Connection getCon() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String userPassword = "orcl";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, userPassword);
		numberCount++;
		System.out.println("Server login ^ ^ " + numberCount + "번째");
		return con;
	}
	
	
	
	/* DB객체들을 닫을 close 메소드 (내가만든 close와 실제 내장함수close는 이름만 같을뿐 기능다름) */
	public static void close(PreparedStatement ps, Connection con) {
		
		close(null ,ps, con);
	}
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}



	
	
}
