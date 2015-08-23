<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
<link rel = "stylesheet" type="text/css" href="bootstrap.min.css">
<style type="text/css">
	body{
		color:#000;
		font-size:14px;
		margin:20px auto;
		background-image:url("8.jpg")
	}
	。form-horizontal{
	
		float:center;
	}
	#xitong{
		text-align:center;
	
	}
	
</style>

<script type="text/javascript">
	function check(form){
		if(document.forms.loginForm.uname.value==""){
			alert("请输入用户名！");
			document.forms.loginForm.uname.focus();
			return false;
		}
		if(document.forms.loginForm.upwd.value==""){
			alert("请输入密码！");
			document.forms.loginForm.upwd.focus();
			return false;
		}
		
		
	}

</script>

</head>
<body>
<!--  
	<form action="<%=request.getContextPath()%>/checkServlet" method="post" method="post" name="loginForm">
		
		<%if(request.getAttribute("return_uri")!=null){ %>
		<input type="hidden" name="return_uri" value="<%=request.getAttribute("return_uri")%>"/>
		<%}%>
			
		
		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">用户登录</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="uname"/></td>
				
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="upwd"/></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					 <input type="submit" name="submit" onclick="return check(this);"/> 
					<input type="reset" name="reset">
				</td>
			</tr>
		
		</table>

	
	
	</form>
		-->

	<form class="form-horizontal" role="form" action="<%=request.getContextPath()%>/checkServlet" method="post" name="loginForm"  >
		<%if(request.getAttribute("return_uri")!=null){ %>
		<input type="hidden" name="return_uri" value="<%=request.getAttribute("return_uri")%>"/>
		<%}%>
		<h5>王锐展8801</h5>
		<div class="form-group">
			<label class="col-sm-2 control-label">电影管理租赁系统</label>
			
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">用户名</label>
			<div class="col-sm-2" style="float:center">
				<input type="text" class="form-control" placeholder="用户名" name="uname">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">密码</label>
			<div class="col-sm-2">
				<input type="password" class="form-control" placeholder="密码" name="upwd">
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-5 col-sm-offset-2">
				<div class="checkbox">
					<label>
						<input type="checkbox">记住密码
					</label>
				</div>
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" name="submit" class="btn btn-default" onclick="return check(this);"  >登录</button>
			</div>
		</div>
	</form>
	

</body>
</html>