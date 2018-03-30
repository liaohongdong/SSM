<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/29
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--list111a1 ${liao}  123aaa--%>

<%--123123--%>
<%--${list[0].name}--%>
<c:forEach items="${list}" var="l">
    ${l.name} ...${l.bookId} ... ${l.number} <br>
</c:forEach>

</body>
</html>
