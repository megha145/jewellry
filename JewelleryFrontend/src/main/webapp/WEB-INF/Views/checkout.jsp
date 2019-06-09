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
        <!-- Header Area End -->

        
        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="checkout_details_area mt-50 clearfix">

                            <div class="cart-title">
                                
                              <li><a href="<c:url value="/checkout"/>">Checkout</a></li>
                              
                            </div>
                            <c:url var="add" value="/placeorder" />
                            <form:form method="post" action="${add}"  class="checkout" modelAttribute="shipping" >
                                <div class="row">
                                   
                                
                                    <div class="col-md-6 mb-3">
                                        <form:input type="hidden" path="shipId" class="form-control" id="ShipId"  />
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <form:input type="text" path="shipName" class="form-control" id="ShipName" placeholder="ShipName" />
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="text" class="form-control" path="shipState" id="ShipState" placeholder="ShipState"  />
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="email" class="form-control" path="email" id="email" placeholder="email" />
                                    </div>
                                    <div class="col-12 mb-3">
                                        <select class="w-100" id="ShipCountry" path="CountryName">
                                        <option value="usa">United States</option>
                                        <option value="uk">United Kingdom</option>
                                        <option value="ger">Germany</option>
                                        <option value="fra">France</option>
                                        <option value="ind">India</option>
                                        <option value="aus">Australia</option>
                                        <option value="bra">Brazil</option>
                                        <option value="cana">Canada</option>
                                    </select>
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="text" class="form-control mb-3" path="shipState" id="ShipAddress" placeholder="ShipAddress" />
                                    </div>
                                    <div class="col-12 mb-3">
                                        <form:input type="text" class="form-control" path="shipCity" id="ShipCity" placeholder="ShipCity"  />
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <form:input type="text" class="form-control"  path="ZipCode" id=" ShipZipCode" placeholder=" ShipZipCode" />
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <form:input type="number" class="form-control" path="shipPhoneNo" id="PhoneNo" min="0" placeholder="PhoneNo" />
                                    </div>
                
                                </div>
                                 <div class="col-12 col-lg-4">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">         
                                <li><span>Grand total:</span> <span>${orders.getGrandTotal()}</span></li>
                            </ul>

                            <div class="payment-method">
                                <!-- Cash on delivery -->
                                <div class="custom-control custom-checkbox mr-sm-2">
                                    <input type="radio" id="payment-method" name="payment-method" value="cash">
                                    <label class="custom-control-label" for="cod">Cash on Delivery</label>
                                </div>
                                <!-- Paypal -->
                                <div class="custom-control custom-checkbox mr-sm-2">
                                    <input type="radio" id="payment-method" name="payment-method" value="card">
                                    <label class="custom-control-label" for="paypal">Card <img class="ml-15" src="img/core-img/paypal.png" alt=""></label>
                                </div>
                            </div>

                            <div class="cart-btn mt-100">
                                <button class="btn amado-btn w-100">Checkout</button>
                            </div>
                        </div>
                    </div>
                                </form:form>
                            
                        </div>
                    </div>
                                    
                                    
                                </div>
                        </div>
                    </div>
                   
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->
    <%@ include file = "footer.jsp" %>


    
<%@ include file="footer.jsp" %>
