<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="com.database.*"%>
<jsp:useBean id="db" class="com.database.Db" scope="page">
</jsp:useBean>
<%
	ResultSet rs1 = db.select("select * from week1 where name = '"
			+ session.getAttribute("listName") + "'");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

	<center>
		[<a href=index.jsp>回到主选单</a>]
	</center>
	<p>
	<table border=1 align=center>
		<tr>
			<th align=center>姓名
			<th align=center>本周完成事项
			<th align=center>下周预定完成事项：<br>【<font color=red>预定完成日期</font>】工作描述
			
			<th align=center>综合说明
			<th align=center>登录日期
		</tr>
		<tr>
				<%while(rs1.next()) {
				out.println("<td align=center> "+rs1.getString(1)+" </td>");
				out.println("<td align=center> "+rs1.getString(2)+" </td>");
				out.println("<td align=center> "+rs1.getString(3)+" </td>");
				out.println("<td align=center> "+rs1.getString(4)+" </td>");
				out.println("<td align=center> "+rs1.getString(5)+" </td>");
				}rs1.close();%>
		</tr>
	</table>

</body>
</html>