<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.Database.*" %>
 <% conDB conn = new conDB(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MySQL连接测试</title>
</head>
<body>
<%
	if(conn.connectDB() ==1) {
		out.println("数据库连接成功！");
	}
	else {
		out.println("失败！");
	}
%>
</body>
</html>