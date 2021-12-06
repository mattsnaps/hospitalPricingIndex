<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-center" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link active" href="#">Home </a>
                <a class="nav-item nav-link" href="#">Pricing</a>

            </div>
        </div>
        <div class="justify-content-right">
            <div class="navbar-nav">
        <c:choose>
            <c:when test="${empty userName}">
                <a class="nav-item nav-link" href ="logIn">Log in</a>
            </c:when>
            <c:otherwise>
                <a class="nav-item nav-link" href="profile">Welcome ${userName}</a>
            </c:otherwise>
        </c:choose>
            </div>
        </div>
    </nav>
</header>