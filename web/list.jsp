<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-07-19
  Time: 오전 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list.jsp</title>
</head>
<body>
<table border="1" width="600">
    <tr>
        <th>파일번호</th>
        <th>작성자</th>
        <th>제목</th>
        <th>내용</th>
    </tr>

<c:forEach var="vo" items="${list}">
    <tr>
        <td>${vo.filenum}</td>
        <td>${vo.writer}</td>
        <td>${vo.title}</td>
        <td>${vo.content}</td>
    </tr>
</c:forEach>
</body>
</html>
