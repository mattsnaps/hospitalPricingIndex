<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<div class="container">
<h2>Search Test</h2>
<br>
<br>
<br>
<form class="form-inline" action="searchDatabase">
    <div class="form-group">
        <label for="procedureTypeSelect">Select Procedure Type</label>
        <select class="form-control" id="procedureTypeSelect" name="procedureTypeSelect">
            <option value="0">All Procedures</option>
            <c:forEach var="procedureType" items="${procedureType}">
                <option value="${procedureType.id}">${procedureType.revDescription}</option>
            </c:forEach>
        </select>
    </div>
    <input type="submit">
</form>


</div>
<%@include file="footer.jsp"%>
</body>
</html>