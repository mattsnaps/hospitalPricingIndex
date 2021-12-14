<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<h2>Profile Page</h2>

<form action="editProfile" method="get">
    <div class="form-group">
        <label for="firstName">First Name</label>
        <input type="text" name="firstName" class="form-control" id="firstName" value="${sessionScope.first_name}">
    </div>
    <div class="form-group">
        <label for="lastName">Last Name</label>
        <input type="text" name="lastName" class="form-control" id="lastName" value="${sessionScope.last_name}">
    </div>
    <button type="submit" value="Submit" class="btn btn-primary">Save Changes</button>
</form>

<a href="profile" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Cancel</a>

<br>
<br>
<br>

<%@include file="footer.jsp"%>
</body>
</html>