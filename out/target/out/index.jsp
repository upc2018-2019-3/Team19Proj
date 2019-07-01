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
</head>
<body>

<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><div style="margin-left: 25%;"><img src="images/icon_index.png" ></div></div>
    </div>
    <ul id="aat">

    </ul>
</div>

<div style="text-align:center;margin:-650px 0; font:normal 14px/24px 'MicroSoft YaHei';">

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
            "<li><a href='ImplementM.jsp'><span>实施</span></a></li></ul>" +
            "</li>" +
            "<li class='nav-item'><a href='javascript:;'><span>费用管理</span></a><ul>" +
            "<li><a href='ChargeM.jsp'><span>费用</span></a></li></ul></li>";
        $('#aat').html(navData)
    })
</script>
</body>
</html>

