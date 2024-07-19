<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-07-19
  Time: 오전 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>insert.jsp</title>
  </head>
  <body>
  <!--
  <파일업로드시 form에 아래 속성을 꼭 설정해야함>
   method="post"
   enctype="multipart/form-data"
   -->
  <form method="post" action="<%=request.getContextPath()%>/file/upload" enctype="multipart/form-data">
    작성자<br>
    <input type="text" name="writer"><br>
    제목<br>
    <input type="text" name="title"><br>
    내용<br>
    <textarea name="content" rows="5" cols="50" ></textarea><br>
    첨부파일
    <input type="file" name="file1"><br>
    <input type="submit" value="전송">
  </form>
  </body>
</html>
