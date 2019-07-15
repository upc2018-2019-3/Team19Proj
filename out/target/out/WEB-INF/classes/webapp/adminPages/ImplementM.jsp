<%@ page import="java.util.List" %>
<%@ page import="model.Project" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Implement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>项目管理</title>

    <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="CSS/nav.css">
    <script type="text/javascript" src="JS/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="JS/nav.js"></script>
    <script type="text/javascript" src="JS/bootstrap.js"></script>
</head>
<body>

<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><div style="margin-left: 25%;"><img src="images/icon_index.png" ></div></div>
    </div>
    <ul id="aat">

    </ul>
</div>

<% List<Implement> list = (ArrayList)request.getAttribute("list");%>


<div style="margin:-650px 400px;width: 50%;height: 70%;">
    <table class="table">
        <thead>
        <tr>
            <th>实施ID</th>
            <th>实施名称</th>
            <th>项目ID</th>
            <th>开始时间</th>
            <th>结束时间</th>
        </tr>
        </thead>
        <tbody>
        <%for(int i=0;i<list.size();i++){%>

            <% Implement implement = (Implement) list.get(i);%>
        <tr>
                <td><%=implement.getImpleid()%></td>
                <td><%=implement.getImplename()%></td>
                <td><%=implement.getProjectid()%></td>
                <td><%=implement.getImplestart()%></td>
                <td><%=implement.getImpleend()%></td>
            </tr>
        <%}%>
        </tbody>
    </table>
    <div class="col-md-3"></div>
    <button class="btn-lg btn-success btn_Sys1" data-toggle="modal" data-target="#myModal1">添加</button>
</div>

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加项目</h4>
            </div>
            <div class="modal-body">
                <form action="/out/insertimple" method="post">
                    <div class="form-group">
                        <label for="实施ID" class="control-label">实施ID</label>
                        <input type="text" class="form-control" name="projectid" id="实施ID">
                    </div>
                    <div class="form-group">
                        <label for="实施名称" class="control-label">实施名称</label>
                        <input type="text" class="form-control" name="projectname" id="实施名称">
                    </div>
                    <div class="form-group">
                        <label for="项目ID" class="control-label">项目ID</label>
                        <input type="text" class="form-control" name="overview" id="项目ID">
                    </div>
                    <div class="form-group">
                        <label for="开始时间" class="control-label">开始时间</label>
                        <input type="text" class="form-control" name="doc" id="开始时间" />
                    </div>
                    <div class="form-group">
                        <label for="结束时间" class="control-label">结束时间</label>
                        <input type="text" class="form-control" name="doc" id="结束时间" />
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary">提交</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel2">删除项目</h4>
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