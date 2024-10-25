package com.multicampus.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.multicampus.biz.common.JDBCUtil;

public class SelectUserTest2 {
	public static void main(String[] args) {
		// JDBC 관련 변수 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			
			// 3단계 : SQL 전달자(Statement) 생성
			String sql = "select * from users where role = ? order by id desc";
			stmt = conn.prepareStatement(sql);
			
			// 4단계 : SQL 전송
			// 파라미터 설정
			stmt.setString(1, "Admin");
			rs = stmt.executeQuery();
			
			// 5단계 : 검색 결과 처리
			System.out.println("[ 회원 목록 ]");
			while(rs.next()) {
				System.out.print(rs.getString("ID") + " : ");
				System.out.print(rs.getString("PASSword") + " : ");
				System.out.print(rs.getString("NAME") + " : ");
				System.out.print(rs.getString("ROLE") + "\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
	}
}







