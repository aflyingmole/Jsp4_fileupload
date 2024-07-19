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
    <!-- 파일목록(파일번호, 작성자,전송된파일명, 저장된파일명, 파일크기 출력해 보기 list.jsp -->
    <li><a href="<%=request.getContextPath()%>/file/list">파일목록</a></li>
</ul>
</body>
</html>
