<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<div class="container">
<%@include file="header.jsp"%>
<h2>Search Results</h2>
<c:set var="procedureTypeId" value="${Type}"/>
    <form>
        <input type="button" value="Return to Search" onclick="history.back()">
    </form>
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
</div>
</body>
</html>