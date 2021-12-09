<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Search Test</h2>

<br>
<br>
<br>
<table class="table">
    <c:forEach var="price" items="${price}">
        <tr>
            <td>${price.getHospital().hospitalName}</td>
            <td>${price.getProcedure().getProcedureType().revDescription}</td>
            <td>${price.getProcedure().codeDescription}</td>
            <td>${price.getProcedure().codeType}</td>
            <td>${price.getProcedure().code}</td>
            <td>${price.price}</td>
        </tr>
    </c:forEach>
</table>


<%@include file="footer.jsp"%>
</body>
</html>