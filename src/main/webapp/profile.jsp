<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<div class="container">
<%@include file="header.jsp"%>
<h2>Profile Page</h2>
User Email: ${sessionScope.username}<br>
First Name: ${sessionScope.first_name}<br>
Last Name: ${sessionScope.last_name}<br>
<br>
    <a href="editProfile.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Edit Profile</a>
    <a href="index.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Home</a>

<%@include file="footer.jsp"%>
</div>
</body>
</html>