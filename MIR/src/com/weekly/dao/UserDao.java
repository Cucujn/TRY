package com.weekly.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.weekly.dbmanage.Dbmanage;
import com.weekly.user.vo.UserRegister;

public class UserDao {
	
	//�û�ע�᷽��
	public void insertUser(UserRegister user) {
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;
		// TODO Auto-generated method stub
		try {
			conn = dbmanage.initDB();
			sta = conn.createStatement();
			String sql = "INSERT INTO mir(SSN,chineseName,userPassword)VALUES('"
		                    + user.getUserId()
		                    + "','"
		                    + user.getChineseName()
		                    + "','"
		                    +user.getUserPassword()
		                    + "')";
			sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//ִ����ر����ݿ�
			dbmanage.closeDB(sta, conn);
		}
	}
	
}
