<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Test Test</h2>
<table>
    <c:forEach var="name" items="${hospital}">
        <tr>
            <td>${name.hospitalName}</td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<br>

<table>
    <c:forEach var="price" items="${price}">
        <tr>
            <td>${price.price}</td>
            <td>    ******    </td>
            <td>${price.getProcedure().codeDescription}</td>
            <td>     *****     </td>
            <td>${price.getHospital().hospitalName}</td>
        </tr>
        <tr>

        </tr>
    </c:forEach>
</table>



</body>
</html>
