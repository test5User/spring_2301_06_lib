<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Library</title>
</head>
<body>
    <sf:form method="post" action="/save" modelAttribute="library">
        Library name: <sf:input path="name"/><br>
        Library addr: <sf:input path="address"/><br>
        <input type="submit" value="Save">
    </sf:form>
</body>
</html>
