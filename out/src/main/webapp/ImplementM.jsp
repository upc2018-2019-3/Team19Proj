<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实施管理</title>
 
 
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
 
<div style="margin:-650px 400px;width: 50%;height: 70%;">
<form class="form-horizontal" action="/out/insertImple" method="post">
 	<div class="form-group">
 		<label for="lastname" class="col-sm-3 control-label">
 			实施人员编号
 		</label>
 		<div class="col-sm-6">
 			<input type="text" autofocus required name="impleid" placeholder="实施人员编号" class="form-control a">
 		</div>
 	</div>

 	<div class="form-group">
 		<label for="lastname2" class="col-sm-3 control-label">
 			实施人员姓名
 		</label>
 		<div class="col-sm-6">
 			<input type="text" autofocus required name="implename" placeholder="实施人员姓名" class="form-control a">
 		</div>
 	</div>

 	<div class="form-group">
 		<label for="lastname2" class="col-sm-3 control-label">
 			相关项目编号
 		</label>
 		<div class="col-sm-6">
 			<input type="text" autofocus required name="projectid" placeholder="相关项目编号" class="form-control a">
 		</div>
 	</div>

<div class="form-group">
               <div class="col-md-1"></div>
                <label for="dtp_input1" class="col-md-2 control-label">起始时间</label>
                <div class="input-group date form_datetime col-md-6" data-date="1979-09-16T05:25:07Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="dtp_input1">
                    <input class="form-control" name="implestart" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
                <input type="hidden" id="dtp_input1" value="" /><br/>
                 <div class="col-md-1"></div>
                  <label for="dtp_input1" class="col-md-2 control-label">结束时间</label>
                <div class="input-group date form_datetime col-md-6" data-date="1979-09-16T05:25:07Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="dtp_input1">
                    <input class="form-control" name="impleend" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
                <input type="hidden" id="dtp_input2" value="" /><br/>
            </div>
            <div class="col-md-5"></div>
<button class="btn btn-success">提交</button>
 </form>
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
	
	$('.form_datetime').datetimepicker({
        weekStart: 0, //一周从哪一天开始
        todayBtn:  1, //
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });
</script>




</body>
</html>