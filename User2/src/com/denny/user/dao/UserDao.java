package com.denny.user.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.denny.dbmanage.Dbmanage;
import com.denny.user.vo.Uservo;

public class UserDao {
	Uservo user = new Uservo();
	public void insertUser(Uservo user) {
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;
	
	try {
		conn = dbmanage.initDB();
		sta = conn.createStatement();
		 String sql = "INSERT INTO usertable (user_name,user_password,user_province,user_city,user_sex,user_hobby,user_describe)VALUES('"
                 + user.getUsername()
                 + "','"
                 + user.getUserPassword()
                 + "','"
                 + user.getUserProvince()
                 + "','"
                 + user.getUserCity()
                 + "','"
                 + user.getUserSex()
                 + "','"
                 + user.getUserHobby()
                 + "','"
                 + user.getUserDescribe()
                 + "')";
		 sta.executeUpdate(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		//执行完关闭数据库
		dbmanage.closeDB(sta, conn);
	}
	}
}
