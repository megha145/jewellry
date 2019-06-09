<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri ="http://www.springframework.org/security/tags"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
<c:url value ="/resources/images1/images1"  var="img"/>
<c:url value ="/resources/css/css"  var="css"/>
<c:url value ="/resources/js/js"  var="js"/>
<c:url value ="/resources/vendor"  var="vendor"/>
<c:url value ="/resources/fonts"  var="fonts"/>
<c:url value ="/resources/includes"  var="includes"/>
<c:url value ="/resources/images"  var="img1"/>
<c:url value ="/resources/images/icons"  var="icon"/>

<body style="counter-reset:section;text-align:center;background:#E7DFDE;">
<div class="contain" style="height:800px;">

 <c:url var="add" value="/addCard"/>
<form:form action="${add}" method="post" modelAttribute="card">

<form:input type="hidden" path="cardId" />

<label>NAME ON CARD</label>
<form:input type="text" placeholder="NAME ON CARD" path="nameOnCard"/>
</br>

<label>CARD NUMBER</label>
<form:input type="text" placeholder="CARD NUMBER" path="cardNumber"/>
</br>

<label>EXPIRY DATE</label>
<form:input type="text" placeholder="MM/YY" path="expiryDate"/>

</br>

<label>CVV</label>
<form:input type="text" placeholder="CVV" path="cvv"/>
</br>

<input type="submit" value="Submit"/>

</form:form>

</div>
</body>
<%@ include file="footer.jsp" %>