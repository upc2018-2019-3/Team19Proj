<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="CSS/login_design.css" rel="stylesheet"/>
</head>
<body>
<div class="bigbox">
	<div >
    <p class="headword">外包管理系统</p>
    </div>
    <form action="login" method="post">
    <div>
    	<input type="text" value="" placeholder="用户名" name="username" id="username"/>
    </div>
    <div class="password">
    	<input type="password" value="" placeholder="密码" name="password" id="password"/>
    </div>
    <div class="cpwd">
    	<input type="checkbox" name="checkpwd" id="checkpwd" />
    	<label>
    		记住密码
    	</label>
    	<div class="forgetpwd">
    		<a href="" style="color: #009688;">忘记密码？</a>
    	</div>
    	
    </div>
    
    <div>
    <input type="submit" id="submit" name="submit" >登入</input>
    </div>
    <div class="regist">
    	<a href="" style="color: #009688;">注册账号</a>
    </div>
    </form>
</div>

</body>
</html>