<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<%@include file="header.jsp"%>
<h2>Profile Page</h2>
${sessionScope.username}<br>
${sessionScope.first_name}<br>
${sessionScope.last_name}<br>

<br>
<br>
<br>

<a href="editProfile.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Edit Profile</a>


<%@include file="footer.jsp"%>
</body>
</html>