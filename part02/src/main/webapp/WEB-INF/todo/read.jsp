<%--
  Created by IntelliJ IDEA.
  User: sskim
  Date: 2022/09/12
  Time: 3:04 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <input type="text" name="tno" value="${dto.tno}" readonly>
</div>
<div>
    <input type="text" name="title" value="${dto.title}" readonly>
</div>
<div>
    <input type="date" name="dueDate" value="${dto.dueDate}" readonly>
</div>
<div>
    <input type="checkbox" name="finished" value="${dto.finished ? "checked" : ""}" readonly>
</div>
<div>
    <a href="/todo/modify?tno=${dto.tno}">Modify</a>
    <a href="/todo/list">List</a>
</div>
</body>
</html>
