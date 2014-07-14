<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>登录</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<!-- Bootstrap -->
		<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		<script src="http://lib.sinaapp.com/js/jquery/1.8/jquery.min.js"></script>

	</head>

	<body>

	   <div class="navbar navbar-inverse">
             <div class="navbar-header">
                 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                 </button>
                 <a class="navbar-brand" href="#">XX系统</a>
             </div>
             <div class="navbar-collapse collapse">
                 <ul class="nav navbar-nav">
                     <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span>首页</a></li>
                     <li><a href="./cates"><span class="glyphicon glyphicon-th"></span> 分类管理</a></li>
                     <li><a href="./about"><span class="glyphicon glyphicon-question-sign"></span> 关于我们</a></li>
                 </ul>
             </div>
        </div>
	
	
		<div class="container">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							马上登陆！
						</h3>
					</div>
					<div class="panel-body">
						<form accept-charset="UTF-8" action="${pageContext.request.contextPath}/login" class="user_login"
							id="new_user" method="post">
							<div class="form-group">
								<label for="user_username">
									用户名
								</label>
								<input class="form-control"
									id="user_username" name="username" type="text" value="">
								<span></span>
							</div>
							<div class="form-group">
								<label for="user_password">
									密码
								</label>
								<input class="form-control" id="user_password"
									name="pwd" type="password">
									<span></span>
							</div>
							<div>
								<input class="btn btn-lg btn-block btn-success" name="commit"
									type="submit" value="登录">
							</div>
						</form>
					</div>
					<div class="panel-footer">
						<input type="checkbox" name="remember" value="re"/>记住用户名
					</div>
				</div>
			</div>

			<div class="col-md-6 col-md-offset-3 prose">
				<h4>
				</h4>
				<p>
					amazing happens
				</p>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>
