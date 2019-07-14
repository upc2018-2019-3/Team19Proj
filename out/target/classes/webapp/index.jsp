<%--
  Created by IntelliJ IDEA.
  User: carlos
  Date: 2019/6/30
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>外包管理信息系统</title>
    <link rel="stylesheet" type="text/css" href="CSS/nav.css">
    <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
    <link href="CSS/bootstrap-datetimepicker.min.css" rel="stylesheet">


    <script type="text/javascript" src="JS/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="JS/nav.js"></script>
    <script type="text/javascript" src="JS/bootstrap.js"></script>
    <script src="JS/bootstrap-datetimepicker.min.js"></script>
    <link href="CSS/login_design.css" rel="stylesheet"/>
</head>
<body>



<div class="bigbox">
    <div >
        <p class="headword">外包管理系统</p>
    </div>
    <form action="/out/login" method="post">
        <div>
            <input type="text" value="" placeholder="用户账号" name="adminaccount" id="username"/>
        </div>
        <div class="password">
            <input type="password" value="" placeholder="密码" name="password" id="password"/>
        </div>
        <div class="cpwd">
            <input type="checkbox" name="checkpwd" id="checkpwd" />
            <label>
                记住密码
            </label>
        </div>

        <div>
            <input type="submit" id="submit" name="submit" >登入</input>
        </div>
        <div class="regist">
            <a href="Register.jsp" style="color: #009688;">注册账号</a>
        </div>
    </form>
</div>


</div>

</body>
</html>

