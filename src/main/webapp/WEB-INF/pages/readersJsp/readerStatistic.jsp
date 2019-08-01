<%--
  Created by IntelliJ IDEA.
  User: Marian
  Date: 22.07.2019
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="<c:url value="/resources/tableCss.css"/>" type="text/css">
<head>
    <title>Title</title>
</head>
<body>

<%@include file="/WEB-INF/pages/menu.jsp" %>

<c:if test="${readerStatisticDto.select =='read'}">
    <div style="text-align: center">
        <h1>Прочитані книги користувача ${readerStatisticDto.name} </h1>
    </div>
</c:if>
<c:if test="${readerStatisticDto.select =='ordered'}">
    <div style="text-align: center">
        <h1>Не повернтуі книги користувача </h1>
    </div>
</c:if>
<c:forEach items="${readerStatisticDto.readerListMap}" var="reder">
    <table class="simple-little-table" cellspacing='0' style="text-align: center; margin: auto; margin-top: 50px">
        <thead>
        <tr>
            <td>Книга #</td>
            <td>Назва книги</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="books" items="${reder.value}" varStatus="loop">
            <tr>
                <td>${loop.index+1}</td>
                <td> ${books.title}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:forEach>
</body>
</html>