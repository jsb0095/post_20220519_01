<%--
  Created by IntelliJ IDEA.
  User: anfzh
  Date: 2022-05-19
  Time: 오후 6:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save-form" method="post">
    <input type="text" name="postId" placeholder="아이디"><br>
    <input type="password" name="postPassword" placeholder="비밀번호"><br>
    <input type="text" name="postName" placeholder="이름"><br>
    <input type="text" name="postAge" placeholder="나이"><br>
    <input type="text" name="postMobile" placeholder="전화번호"><br>
    <input type="submit" value="회원가입">
</form>
</body>
</html>
