<%@ page language="java" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>  
<%  
   request.setCharacterEncoding("UTF-8");  
   response.setCharacterEncoding("UTF-8");  
   response.setContentType("text/html; charset=utf-8");  
%>  
<html> 
<head> 
</head> 
<body> 
<form action="insert.jsp" method="post"> 
ID :<input type = "text" name="id" value="0"/> 
姓名 :<input type = "text" name="name" value="aaa"/> 
性别 :<input type = "text" name="sex" value="female"/> 
年龄 :<input type = "text" name="age" value="20"/> 
<br> 
<input type = "submit" value="提交"/> 
</form> 
</body> 
</html> 