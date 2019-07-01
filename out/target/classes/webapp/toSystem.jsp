<%@ page import="java.util.List" %>
<%@ page import="model.Admin" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: carlos
  Date: 2019/6/30
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List<Admin> list = (ArrayList)request.getAttribute("list");

%>


<table class="table">
    <thead>
    <tr>
        <th>AdminId</th>
        <th>AdminName</th>
        <th>AdminAccount</th>
        <th>Password</th>
    </tr>
    </thead>
    <tbody>
    <%
        for(int i=0;i<list.size();i++){
            Admin admin = (Admin)list.get(i);%>
    <tr>
        <th><%=admin.getAdminid()%></th>
        <th><%=admin.getAdminname()%></th>
        <th><%=admin.getAdminaccount()%></th>
        <th><%=admin.getPassword()%></th>
        }


        %>
    </tbody>
</table>

</body>
</html>
