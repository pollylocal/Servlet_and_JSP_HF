<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
    <%
        List<String> results = (List<String>) request.getAttribute("styles");
        for (String result : results)
        {
            out.println("<br> try: " + result);
        }
    %>
</p>
</body>
</html>
