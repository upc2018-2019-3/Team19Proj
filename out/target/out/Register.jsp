<%--
  Created by IntelliJ IDEA.
  User: carlos
  Date: 2019/7/1
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
    <link href="CSS/login_design.css" rel="stylesheet"/>
</head>

<body>
<div class="bigbox">
    <div >
        <p class="headword">外包管理系统</p>
    </div>
    <form action="/out/register" method="post">
        <div>
            <input type="text" value="" placeholder="用户名" name="adminname" id="username"/>
        </div>
        <div>
            <input type="text" value="" placeholder="账户" name="adminaccount" id="checkpassword"/>
        </div>
        <div>
            <input type="password" value="" placeholder="密码" name="psswword" id="password"/>

        </div>

        <div class="agreep">
            <input type="checkbox" name="agreep" id="agreep" />
            <label>
                同意用户协议
            </label>
        </div>
        <div>
            <button type="submit" id="submit" name="submit" >注册</button>
        </div>

    </form>
</div>

</body>
</html>
