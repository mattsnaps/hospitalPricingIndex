<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Search Results</h2>
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
            <td>${procedure.getProcedureType().revDescription}</td>
            <td>${procedure.code}</td>
            <td><a href="getProcedureProfile?procedureId=${procedure.id}&procedureDesc=${procedure.codeDescription}">${procedure.codeDescription}</a></td>
        </tr>
        </c:if>
    </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>
</body>
</html>