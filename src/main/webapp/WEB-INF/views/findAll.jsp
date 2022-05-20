<%--
  Created by IntelliJ IDEA.
  User: anfzh
  Date: 2022-05-19
  Time: 오후 7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<h2>고객DB</h2>
<table class="table">
    <tr>
        <th>회원번호</th>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>나이</th>
        <th>전화번호</th>
        <th>조회</th>
        <th>삭제</th>
    </tr>
<c:forEach var="post" items="${postDTOList}">
    <tr>
    <td>${post.id}</td>
    <td>${post.postId}</td>
    <td>${post.postPassword}</td>
    <td>${post.postName}</td>
    <td>${post.postAge}</td>
    <td>${post.postMobile}</td>
    <td><a href="/detail?id=${post.id}">조회</a></td>
    <td><a href="/detailDrop?id=${post.id}">삭제</a></td>
    <%--클릭한 회원의 정보를 DB에서 가져와서 detail.jsp에 출력--%>

    </tr>
</c:forEach>

</body>
</html>
