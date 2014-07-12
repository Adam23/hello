<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>注册</title>

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
							欢迎注册！
						</h3>
					</div>
					<div class="panel-body">
						<form accept-charset="UTF-8" action="${pageContext.request.contextPath}/register" class="new_user"
							id="new_user" method="POST">
							<div class="form-group">
								<label for="user_username">
									用户名
								</label>
								<input autofocus="autofocus" class="form-control"
									id="user_username" name="username" type="text">
							</div>
							<div class="form-group">
								<label for="user_password">
									密码
								</label>
								<input class="form-control" id="user_password"
									name="pwd" type="password">
							</div>
							<div class="form-group">
								<label for="user_password_confirmation">
									密码确认
								</label>
								<input class="form-control" id="user_password_confirmation"
									name="repwd" type="password">
							</div>
							<div class="form-group">
								<label for="user_email">
									邮箱
								</label>
								<input class="form-control" id="user_email" name="email"
									type="email" value="">
							</div>
							<div class="form-group">
								<label for="user_phone">
									手机
								</label>
								<input class="form-control" id="user_phone" name="phone"
									type="text" value="">
							</div>
							<div class="form-group">
								<label for="user_birthday">
									生日
								</label>
								<input class="form-control" id="user_birthday" name="birthday"
									type="text" value="">
							</div>
							<div>
								<input class="btn btn-lg btn-block btn-success" name="commit"
									type="submit" value="提交">
							</div>
						</form>
					</div>
					<div class="panel-footer">
						已经阅读并同意
						<a href="./terms">我们的条款</a>.
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
