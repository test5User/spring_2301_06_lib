<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book Page</title>
</head>
<body>
    <sf:form method="post" action="/saveBook" modelAttribute="book">
        <sf:input path="library_id" type="hidden"/><br>
        Book Title: <sf:input path="title"/><br>
        Book Pages: <sf:input path="pages"/><br>
        <input type="submit" value="Save">
    </sf:form>
</body>
</html>
