<%@ page import="java.util.List" %>
<%@ page import="model.Admin" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8">
    <title>系统管理</title>

    <link rel="stylesheet" type="text/css" href="CSS/nav.css">
    <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
    <link href="CSS/bootstrap-datetimepicker.min.css" rel="stylesheet">


    <script type="text/javascript" src="JS/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="JS/nav.js"></script>
    <script type="text/javascript" src="JS/bootstrap.js"></script>
    <script src="JS/bootstrap-datetimepicker.min.js"></script>
</head>
<body>

<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><div style="margin-left: 25%;"><img src="images/icon_index.png" ></div></div>
    </div>
    <ul id="aat">

    </ul>
</div>

<% List<User> list = (ArrayList)request.getAttribute("list");%>

<div style="margin:-650px 400px;width: 50%;height: 70%;">
    <table class="table">
        <thead>
        <tr>
            <th>UserId</th>
            <th>UserName</th>
            <th>UserAccount</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <tr>
        <%
            for(int i=0;i<list.size();i++){
               User user = (User)list.get(i);%>
            <td><%=user.getId()%></td>
            <td><%=user.getUsername()%></td>
            <td><%=user.getUseraccount()%></td>
            <td><%=user.getPassword()%></td>
           <td><a class="btn btn-danger" href="/out/deleteAdmin?userid=<%=user.getId()%>">删除</a></td>
        </tr>
            <% } %>

        </tbody>
    </table>
    <div class="col-md-2"></div>
    <button class="btn-lg btn-success btn_Sys1" data-toggle="modal" data-target="#myModal1">添加</button>
</div>


<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel1">添加管理人员</h4>
            </div>
            <div class="modal-body">
                <form action="/out/insertAdmin" method="post">
                    <div class="form-group">
                        <label for="管理人员编号" class="control-label">管理人员编号</label>
                        <input type="text" class="form-control"  id="管理人员编号" name="adminid">
                    </div>
                    <div class="form-group">
                        <label for="管理人员姓名" class="control-label">管理人员姓名</label>
                        <input type="text" class="form-control" id="管理人员姓名" name="adminname">
                    </div>
                    <div class="form-group">
                        <label for="管理人员账号" class="control-label">管理人员账号</label>
                        <input type="text" class="form-control" id="管理人员账号" name="adminaccount">
                    </div>
                    <div class="form-group">
                        <label for="管理人员密码" class="control-label">密码</label>
                        <input type="text" class="form-control" id="管理人员密码" name="password">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="submit" class="btn btn-primary">提交</button>
                    </div>
                </form>
            </div>

        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">删除管理人员</h4>
            </div>
            <div class="modal-body">
            </div>
            <div class="modal-footer">
                <form action="" method="">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <input class="btn btn-danger" type="button" name="删除" value="删除">
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<script>
    $(function(){
        var navList = [
            {
                "p" : "系统管理",
                "c" : ["人员"]
            },
            {
                "p" : "项目管理",
                "c" : ["项目"]
            },
            {
                "p" : "实施管理",
                "c" : ["实施"]
            },
            {
                "p" : "费用管理",
                "c" : ["费用"]
            }
        ]
        var navData = '';
        /*for(let i=0;i<navList.length;i++){
            navData+= "<li class='nav-item'><a href='javascript:;'><span>"+navList[i].p+"</span></a><ul>"
            for(let w=0;w<navList[i].c.length;w++){
                navData+="<li><a href=e><span>"+navList[i].c[w]+"</span></a></li>"
            }
            navData+="</ul></li>"
        }*/
        navData = "<li class='nav-item'>" +
            "<a href='javascript:;'><span>系统管理</span></a>" +
            "<ul><li><a href='/out/selectAdmin'><span>人员</span></a></li></ul>" +
            "</li>" +
            "<li class='nav-item'><a href='javascript:;'><span>项目管理</span></a><ul>" +
            "<li><a href='/out/selectProject'><span>项目</span></a></li></ul>" +
            "</li>" +
            "<li class='nav-item'><a href='javascript:;'><span>实施管理</span></a><ul>" +
            "<li><a href='/out/selectimple'><span>实施</span></a></li></ul>" +
            "</li>" +
            "<li class='nav-item'><a href='javascript:;'><span>费用管理</span></a><ul>" +
            "<li><a href='/out/selectfee'><span>费用</span></a></li></ul></li>";
        $('#aat').html(navData)
    })
</script>
</body>
</html>


