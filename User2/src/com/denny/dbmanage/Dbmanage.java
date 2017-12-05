package com.denny.dbmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbmanage {
	public Connection initDB() {
		//��ʼ�����ݿ�ķ���
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�����
			String url = "jdbc:mysql://localhost:3306/userdb?charaterEncoding=utf-8";
			//�������ݿ��ַurl �����ñ����ʽ
			conn = DriverManager.getConnection(url,"root","");
			//�õ���������
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
		//�������ݿ�����
	}
	
	public void closeDB(Statement sta, Connection conn) {
		//�ر����ݿ⣨�޽������
		try {
			sta.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB(ResultSet rs, Statement sta, Connection conn) {
		try {
			rs.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
