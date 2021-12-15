<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp">Hospital Pricing Index</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-center" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link" href="index.jsp">Home </a>
                <a class="nav-item nav-link" href="search">Search</a>

            </div>
        </div>
        <div class="justify-content-right">
            <div class="navbar-nav">

       <c:choose>
            <c:when test="${sessionScope.username != null}">
                <a class="nav-item nav-link" href="profile">Welcome <c:out value="${sessionScope.username}" /></a>
            </c:when>
            <c:otherwise>
                <a class="nav-item nav-link" href ="logIn">Log in</a>
            </c:otherwise>
        </c:choose>
            </div>
        </div>
    </nav>
</header>