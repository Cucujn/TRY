<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.database.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String userId = request.getParameter("userId");
	%>
	<%
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/chhenjn?useUnicode=true&characterEncoding=UTF-8";
	String userDB = "root";
	String passwordDB = "123456";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, userDB, passwordDB);
	PreparedStatement sql = conn.prepareStatement("insert into users(userId,username,password) values(?,?,?)");
	sql.setString(1, userId);
	sql.setString(2,username);
	sql.setString(3,password);
	int rtn = sql.executeUpdate();
	sql.close();
	conn.close();
		
	%>
	<%
	out.println("注册成功！");
	%>
	<a href="default.jsp">[返回主界面]</a>
</body>
</html>