package com.servlet;
import com.Database.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		private String userName;    //���ձ��ύ�������˻�
		private String passWord;     //����
		private String ID;
		public void doPost(HttpServletRequest request, HttpServletResponse response)
		   throws ServletException, IOException {
		  response.setContentType("text/html;charset=UTF-8");  //���ø�ʽ����
		  request.setCharacterEncoding("UTF-8");            //���ø�ʽ����
		  userName = request.getParameter("chineseName");     //���ձ����������û��˺�
		  passWord = request.getParameter("userPassword");  //�û�����
		  ID = request.getParameter("userId");
		  insertDate();    //���淽���������ݲ������ݿ�
		 }
		 private void insertDate() {
		  Connection con = null;  //һ�����Ӷ���
		  con = (Connection) DB.getcon(con);   //�õ�һ������
		  PreparedStatement ps = null;    //���ڲ�������
		  //sql��䣬���user���棬����name��pass��ֵ
		  String sql = "insert into mir(SSN,chineseName,password) values(ID,userName,password)";   
		  ps = (PreparedStatement) DB.getpsta(con, sql);
		  try {
			  ps.setString(1, ID);
		   ps.setString(2, userName);
		   ps.setString(3, passWord);
		   ps.executeUpdate();
		   ps.close();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		 }
	}

