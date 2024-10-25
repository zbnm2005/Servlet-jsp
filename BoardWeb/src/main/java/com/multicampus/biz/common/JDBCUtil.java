package com.multicampus.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			// 1단계 : 드라이버 객체를 관리자에 등록
			DriverManager.registerDriver(new org.h2.Driver());
			
			// 2단계 : 커넥션 연결
			String url = "jdbc:h2:tcp://localhost/~/test";
			String username = "sa";
			String password = "";
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		// 5단계 : 연결 해제
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt = null;
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		// 5단계 : 연결 해제
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs = null;
		}
		
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt = null;
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
}





