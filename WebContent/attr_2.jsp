<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Attr 2 page</h2>

<br><br>
pageContextAttr: <%= pageContext.getAttribute("pageContextAttr") %>

<br><br>
requestAttr: <%= request.getAttribute("requestAttr") %>

<br><br>
sessionAttr: <%= session.getAttribute("sessionAttr") %>

<br><br>
applicationAttr: <%= application.getAttribute("applicationAttr") %>

<br><br>
<a href="attr_1.jsp">To Attr_1 page</a>
<br><br>
<a href="testAttr">To textArrt page </a>

</body>
</html>