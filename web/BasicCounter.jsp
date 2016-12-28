<html>
<head>
    <title>BasicCounter JSP</title>
</head>
<body>
<%! private int count = 0;%>
<%! private int count(){
    return ++count;
}%>
This page count is  -
<%= count()%>
</body>
</html>
