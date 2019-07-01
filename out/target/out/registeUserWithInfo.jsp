<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public boolean registeUserWithInfo (String adminaccount, String password){
	Connection conn=null;
	PreparedStatement pstmt = null;
	try{
		//加载驱动类
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//获取数据库连接
		conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=OutSourcingMIS","sa","!qhj0630");
		//加载句柄
		String sql="insert into  Admin (adminaccount,password) values(?,?)";
		pstmt= conn.prepareStatement(sql);
        pstmt.setObject(1, adminaccount);
        pstmt.setObject(2, password);
        int count =pstmt.executeUpdate();
        return count>0;
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		 try {
             pstmt.close();
             conn.close();
             
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
	}
	return false;
}
%>
</body>
</html>