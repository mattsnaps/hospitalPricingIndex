<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Profile Page</h2>
${sessionScope.username}<br>
<c:set var="procedureTypeId" value="${Type}"/>
<br>
<br>
<br>


<%@include file="footer.jsp"%>
</body>
</html>