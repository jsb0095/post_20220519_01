<%--
  Created by IntelliJ IDEA.
  User: anfzh
  Date: 2022-05-19
  Time: 오후 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS only -->

    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
<h1>로그인 성공</h1>
<button class="btn btn-primary" onclick="location.href='/update-form'">수정</button>
<button class="btn btn-danger" onclick="updateForm()">수정</button>
</body>
<script>
    function  updateForm(){

    }
    const updateForm =()=>{
        location.href = "/update-form";
    }
</script>
</html>
