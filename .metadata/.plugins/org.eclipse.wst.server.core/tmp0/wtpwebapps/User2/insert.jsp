<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%> 
<%  
   request.setCharacterEncoding("UTF-8");  
   response.setCharacterEncoding("UTF-8");  
   response.setContentType("text/html; charset=utf-8");  
%>  
<html> 
<head> 
<title>add message into table </TITLE> 
</head> 
<body> 
<% 
String id=request.getParameter("id"); //从表单获得 
String name=request.getParameter("name"); //从表单获得 
String sex=request.getParameter("sex"); //从表单获得 
String age=request.getParameter("age"); //从表单获得 

java.util.Date date=new java.util.Date(); 
String datetime=new Timestamp(date.getTime()).toString(); 
try 
{ 
/** 连接数据库参数 **/ 
String driverName = "com.mysql.jdbc.Driver"; //驱动名称 
String DBUser = "root"; //mysql用户名 
String DBPasswd = "123456"; //mysql密码 
String DBName = "test"; //数据库名 

String connUrl = "jdbc:mysql://localhost/" + DBName + "?user=" + DBUser + "&password=" + DBPasswd; 
Class.forName(driverName).newInstance(); 
Connection conn = DriverManager.getConnection(connUrl); 
Statement stmt = conn.createStatement(); 
stmt.executeQuery("SET NAMES UTF8"); 
String insert_sql = "insert into user1 values('" + id + "','" + name + "','" + sex + "','" + age + "')"; 
String query_sql = "select * user1"; 

try { 
stmt.execute(insert_sql); 
}catch(Exception e) { 
e.printStackTrace(); 
} 
try { 
ResultSet rs = stmt.executeQuery(query_sql); 
while(rs.next()) { 
%> 
ID：<%=rs.getString("id")%> <br> 
姓名：<%=rs.getString("name")%> <br> 
性别：<%=rs.getString("sex")%> <br> 
年龄：<%=rs.getString("age")%> <br> <br> 
<% 
} 
}catch(Exception e) { 
e.printStackTrace(); 
} 
//rs.close(); 
stmt.close(); 
conn.close(); 
}catch (Exception e) { 
e.printStackTrace(); 
} 
%> 
</body> 
</html> >