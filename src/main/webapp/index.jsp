<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<html>
<body>
<div class="container">
<%@include file="header.jsp"%>
    <h1>Hospital Pricing Index</h1>
    <p>This site is a price aggregator for medical procedures. It allows users to look up and compare the cost of
    medical care for three hospitals in Wisconsin. The hospitals include the Monroe Clinic, St. Agnes Hospital, and the Ripon
    Clinic. The prices are the discounted cash prices that are offered to uninsured individuals.

    The prices come from health provider's website. The information can be found
    <a href="https://www.ssmhealth.com/resources/patients-visitors/pay-my-bill/price-estimate/price-transparency-disclaimer/price-transparency">here.</a>
    Procedures listed don't represent all the procedures available at the hospitals. Instead around 400 to 500 procedure are available per hospital.
    The prices represent estimates and may differ from the actual charged amount.</p><br>

    <a href="search" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Search Now</a>

<%@include file="footer.jsp"%>
</div>
</body>
</html>