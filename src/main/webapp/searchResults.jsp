<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Test Test</h2>
${Test}<br>
<c:set var="procedureTypeId" value="${Type}"/>
<br>
<br>
<br>
<table class="table">
    <c:forEach var="price" items="${price}">
        <c:if test="${price.getProcedure().getProcedureType().id == procedureTypeId}">
        <tr>
            <td>${price.getHospital().hospitalName}</td>
            <td>${price.getProcedure().getProcedureType().revDescription}</td>
            <td><a href="getProcedureProfile?procedureId=${price.getProcedure().id}&procedureDesc=${price.getProcedure().codeDescription}&procedureCode=${price.getProcedure().codeType}&code=${price.getProcedure().code}">${price.getProcedure().codeDescription}</a></td>
            <td>${price.price}</td>
        </tr>
        </c:if>
    </c:forEach>
</table>

<%@include file="footer.jsp"%>
</body>
</html>