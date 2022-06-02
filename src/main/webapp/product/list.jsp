<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02/06/2022
  Time: 2:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Danh Sách Sản Phẩm
<form action="/products">
    <input type="text" name="name">
    <button>Click</button>
</form>
<c:forEach items="${ds}" var="product">
    <h2> ${product.id},${product.name}

    </h2>
</c:forEach>
</body>
</html>
