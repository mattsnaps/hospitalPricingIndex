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
    <tr>
        <th>Category Name</th>
        <th>Hospital Code</th>
        <th>Procedure Name</th>
    </tr>
    <tbody>
    <c:forEach var="procedure" items="${procedure}">
        <c:if test="${procedure.getProcedureType().id == procedureTypeId}">
        <tr>
<<<<<<< HEAD
            <td>${procedure.getProcedureType().revDescription}</td>
            <td>${procedure.code}</td>
            <td><a href="getProcedureProfile?procedureId=${procedure.id}&procedureDesc=${procedure.codeDescription}">${procedure.codeDescription}</a></td>
=======
            <td>${price.getHospital().hospitalName}</td>
            <td>${price.getProcedure().getProcedureType().revDescription}</td>
            <td><a href="getProcedureProfile?procedureId=${price.getProcedure().id}&procedureDesc=${price.getProcedure().codeDescription}">${price.getProcedure().codeDescription}</a></td>
            <td>${price.price}</td>
>>>>>>> 61613b6ea9040a96355b3457a7c5927b7ba92c3e
        </tr>
        </c:if>
    </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>
</body>
</html>