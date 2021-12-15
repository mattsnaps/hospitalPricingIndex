<html>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<div class="container">
<%@include file="header.jsp"%>
    <h2>${procedureDesc}</h2>
<br>
    <table class="table">
        <thread>
            <tr>
                <th>Hospital Name</th>
                <th>Procedure Price</th>
            </tr>
        </thread>
        <tbody>
                <c:forEach var="price" items="${price}">
                    <c:if test="${price.getProcedure().id == procedureId}">
                        <tr>
                        <td>${price.getHospital().hospitalName}</td>
                        <td>${price.price}</td>
                        </tr>
                    </c:if>
                </c:forEach>
        </tbody>
    </table>
    <form>
        <input type="button" value="Return to Results" onclick="history.back()">
    </form>

<div>
    <h3>Top Search Results for Procedure</h3>
    <c:forEach var="google" items="${google.getOrganicResults()}">
        <b>${google.getTitle()}</b><br>
        <a href="${google.getLink()}">${google.getLink()}</a><br>
        ${google.getSnippet()} <br><br>
    </c:forEach>
</div>
<hr>
<div>
    <h3>Top Questions About Procedure</h3>
    <c:forEach var="google" items="${google.getRelatedQuestions()}">
        <b>${google.getQuestion()}</b><br>
        ${google.getSnippet()}<br>
        ${google.getTitle()}<br>
        <a href="${google.getLink()}">${google.getLink()}</a><br><br>
    </c:forEach>
</div>


<%@include file="footer.jsp"%>
</div>
</body>
</html>