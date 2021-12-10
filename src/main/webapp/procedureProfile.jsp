<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Test Test</h2>
${Test}<br>
<br>
<br>
<br>
<c:forEach var="google" items="${Google}">
    ${google.getSnippet()} <br>

</c:forEach>


<%@include file="footer.jsp"%>
</body>
</html>