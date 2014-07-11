<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>11</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script src="http://lib.sinaapp.com/js/jquery/1.8/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				var url, element, interval, runid;
				$('#start').click(function(){
					url = $('#url').val();
					element = $('#element').val();
					interval = $('#interval').val();				
					
					//Run for first time
					$('#msg').html('请耐心等待, 页面抓取中 ...').fadeIn(400);
					//$('#content').html('');
					$('#content').load('siteproxy.jsp #result', {url:url, elem:element}, function(){
						$('#msg').html('抓取已完成').delay(1500).fadeOut(400);
					})					
					
					runid = setInterval(			
					function getInfo(){
						$('#msg').html('请耐心等待, 页面抓取中 ...').fadeIn(400);
						//$('#content').html('');
						$('#content').load('siteproxy.jsp #result', {url:url, elem:element}, function(){
							$('#msg').html('抓取已完成').delay(1500).fadeOut(400);
						})
					}, interval*1000);
				});
				
				$('#stop').click(function(){
					$('#msg').html('抓取已暂停').fadeIn(400).delay(1500);
					clearInterval(runid);
				});
				
			});
		</script>
		<style>
			body{
				font-size:14px;
				line-height: 25px;
				background: #fff;
			}
			
			ul{
				list-style: none outside none;
			}
			.dl-div{float: left;}
			.dl-div input{
				padding: 10px;
				margin: 10px;
				width: 300px;
				font-size:14px;
				border: 1px solid #CCC;
			}

			#element{
				width: 100px;
			}
			
			#interval{
				width: 30px;
			}
			
			#start,#stop{
				padding: 8px;
				margin: 10px;
				width: 100px;
				font-size:14px;
				background: #303030;
				color: #CCC;
			}
			
			#msg{
				padding: 5px;
				margin: 10px;
				display: none;
			}
			
			.item{
				background: #E3E3E3;
				padding: 10px;
				margin: 10px;
				font-size: 14px;
				font-family: Arial;
			}
			
			a{
				text-decoration: none;
			}
			
			header{
				margin:20px;
				padding: 0;
			}
			
			h1,h2,h3{
				font-size:14px;
				font-family: Arial;
			}
		</style>
  </head>
  
  <body>
  <hr>
  		<a href="./Login">记住用户名</a>
    <hr>
    <div style="background: url(imgs/qin.gif);width: 100px;height: 80px;">
    </div>
    <form action="downLoad" method="get">
    	<input type="submit" value="下载"/>
    </form>
    <hr>
    
    <form action="hi" method="post">
    	<input type="text" name="user" /><br>
    	<input type="password" name="pwd"/><br>
    	<input type="submit" value="登陆"/>
    </form>
    <hr>
		<div class="dl-div"><input type="text" id="url" value="http://hanyike.com/wp/"/></div>
		<div class="dl-div"><input type="text" id="element" value="article"/></div>
		<div class="dl-div"><input type="text" id="interval" value="30"/></div>
		<div class="dl-div"><input type="button" id="start" value="开始抓取"/></div>
		<div class="dl-div"><input type="button" id="stop" value="暂停抓取"/></div>
		<div style="float:left" id="msg"></div>
		<div style="clear:both"></div>
		<div id="content"></div>
	<script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>