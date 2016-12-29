<html>
<head>
    <title>Chapter8</title>
</head>
<body>
<jsp:useBean id="person" class="com.example.chapter8.Person" scope="request"/>
Person name is <jsp:getProperty name="person" property="name"/>
</body>
</html>
