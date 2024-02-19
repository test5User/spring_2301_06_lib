<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Library</title>
</head>
<body>
    <h1>Library ${library.name}</h1>
    <h2>Address: ${library.address}</h2>
    <h2>Books:</h2>
    <p>
        <a href="/addBook/${library.id}">Add new book</a>
    </p>
    <table border="1">
        <tr>
            <th>Title</th>
            <th>Pages</th>
            <th>Action</th>
        </tr>
        <c:forEach var="book" items="${library.books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.pages}</td>
                <td>
                    <a href="/delBook/${library.id}/${book.id}">Delete Book</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p>
        <a href="/">Go to Index</a>
    </p>
</body>
</html>
