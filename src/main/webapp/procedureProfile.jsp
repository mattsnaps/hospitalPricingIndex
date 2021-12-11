<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<body>
<br>

<h2>${procedureDesc}</h2>

<br>
<br>
<div>
    <table class="table">
        <thread>
            <tr>
                <th>Hospital Name</th>
                <th>Procedure Price</th>
            </tr>
        </thread>
        <tbody>
            <tr>
                <c:forEach var="price" items="${price}">
                    <c:if test="${price.getProcedure().id == procedureId}">
                        <td>${price.getHospital().hospitalName}</td>
                        <td>${price.price}</td>
                    </c:if>
                </c:forEach>
            </tr>
        </tbody>
    </table>

</div>

<div>
    <c:forEach var="google" items="${google.getOrganicResults()}">
        ${google.getTitle()}<br>
        <a href="${google.getLink()}">${google.getLink()}</a><br>
        ${google.getSnippet()} <br><br>
    </c:forEach>
</div>
<hr>
<div>
    <c:forEach var="google" items="${google.getRelatedQuestions()}">
        ${google.getQuestion()}<br>
        ${google.getSnippet()}<br>
        ${google.getTitle()}<br>
        <a href="${google.getLink()}">${google.getLink()}</a><br><br>
    </c:forEach>
</div>


<%@include file="footer.jsp"%>
</body>
</html>