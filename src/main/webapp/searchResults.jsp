<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Test Test</h2>
${Test}
<br>
<br>
<br>
<table class="table">

    <c:forEach var="procedureList" items="${procedureList}">
        <tr>
            <td>${procedureList.codeDescription}</td>
        </tr>
    </c:forEach>
</table>


<%@include file="footer.jsp"%>
</body>
</html>