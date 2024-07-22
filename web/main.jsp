<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-07-19
  Time: 오전 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main.jsp</title>
</head>
<body>
<ul>
    <li><a href="<%=request.getContextPath()%>/insert.jsp">파일업로드</a></li>
    <li><a href="<%=request.getContextPath()%>/file/list">파일목록</a></li>
<%--    <li><a href="<%=request.getContextPath()%>/file/modify">파일수정</a></li>--%>
</ul>
</body>
</html>
