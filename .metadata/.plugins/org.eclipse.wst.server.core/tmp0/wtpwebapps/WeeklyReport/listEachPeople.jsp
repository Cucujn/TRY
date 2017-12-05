<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
String people = request.getParameter("people");
%>
<title>>实验室工作进度<%=people %>的全部登录资料</title>
</head>
<body>
<center><h1>实验室工作进度<%=people %>的全部登录资料</h1></center>
<center><a href="default.jsp">[回到主选单]</a></center>
<table border="1" align="center">
<tr>
<th>姓名</th>
<th>本周完成事项</th>
<th>下周预定完成事项:<br>[<font color="red">预定完成日期</font>]工作描述</th>
<th>综合说明</th>
<th>登录日期</th>
</table>
</body>
</html>