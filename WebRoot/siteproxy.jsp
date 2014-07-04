<!DOCTYPE html>
<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="org.jsoup.Jsoup" %>
<%@ page import="org.jsoup.nodes.*" %>
<%@ page import="org.jsoup.select.Elements" %>
<head>
<title>jsoup Demo</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>

<body>
<header> <h1>最新文章 </h1> </header>

<ul id="result">
<%
		String url = request.getParameter("url");
		String elem = request.getParameter("elem");
		try{
			Document doc = Jsoup.connect(url).timeout(0).get();
			Elements items = doc.select(elem);
			for (Element item : items) {
				 
				  String html = item.html();
				  out.println("<li class=\"item\">" + html + "</li>");
			}

		}catch(Exception e){
			e.printStackTrace();
		}
%>
</ul>
</body>
</html>