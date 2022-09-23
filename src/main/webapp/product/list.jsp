<%--
  Created by IntelliJ IDEA.
  User: NamCoder
  Date: 23/09/2022
  Time: 10:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" begin="0" end="${products.size()-1}" >
    <h2>${products.get(i).id},${products.get(i).name},${products.get(i).price},${categories.get(i).name}</h2>
</c:forEach>
<table>
    <tr><a>Real</a></tr>
    <tr><a>Normal</a></tr>
    <tr><a>Fake</a></tr>
</table>
</body>
</html>
