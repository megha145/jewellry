<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

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

	<title>Home</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="${icon}/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${fonts}/font-awesome-4.7.0/css/font-awesome.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="  ${fonts}/themify/themify-icons.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${ fonts}/Linearicons-Free-v1.0.0/icon-font.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${ fonts}/elegant-font/html-css/style.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/css-hamburgers/hamburgers.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/animsition/css/animsition.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/select2/select2.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${vendor}/lightbox2/css/lightbox.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${css}/util.css">
	<link rel="stylesheet" type="text/css" href="${css}/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
	<header class="header1">
		<!-- Header desktop -->
		<div class="container-menu-header">
			<div class="topbar">
				<div class="topbar-social">
					<a href="#" class="topbar-social-item fa fa-facebook"></a>
					<a href="#" class="topbar-social-item fa fa-instagram"></a>
					<a href="#" class="topbar-social-item fa fa-pinterest-p"></a>
					<a href="#" class="topbar-social-item fa fa-snapchat-ghost"></a>
					<a href="#" class="topbar-social-item fa fa-youtube-play"></a>
				</div>

				<span class="topbar-child1">
					Free shipping for standard order over $100
				</span>

				<div class="topbar-child2">
					<span class="topbar-email">
						fashe@example.com
					</span>

					<div class="topbar-language rs1-select2">
						<select class="selection-1" name="time">
							<option>USD</option>
							<option>EUR</option>
						</select>
					</div>
				</div>
			</div>

			<div class="wrap_header">
				<!-- Logo -->
				<a href="<c:url value="/"/>" class="logo">
					<img src="${icon}/logo.png" alt="IMG-LOGO">
				</a>

				<!-- Menu -->
				<div class="wrap_menu">
					<nav class="menu">
						<ul class="main_menu">
							<li>
								<a href="<c:url value="/"/>">Home</a>
								<ul class="sub_menu">
									<li><a href="<c:url value="/"/>">Homepage V1</a></li>
									<li><a href="<c:url value="/"/>">Homepage V2</a></li>
									<li><a href="<c:url value="/"/>">Homepage V3</a></li>
								</ul>
							</li>
							<c1:if test="${pageContext.request.userPrincipal.name!=null} ">
							<security:authorize access="hasRole('ROLE_ADMIN')">
							welcome ${pageContext.request.userPrincipal.name}
							</security:authorize>
							</c1:if>
							
							
							<c1:if test="${pageContext.request.userPrincipal.name==null}">
							<a href="<c:url value="/login"/>">Login</a>
							<a href="<c:url value="/signup"/>">Signup</a>
							</c1:if>
							
							<c1:if test="${pageContext.request.userPrincipal.name!=null}">
							<a href="<c:url value ="/j_spring_security_logout"/>">Logout</a>
							</c1:if>
							<li>
							
							<li>
								<a href="<c:url value="/"/>">Admin</a>
								<ul class="sub_menu">
									<li><a href="<c:url value="/category"/>">Category</a></li>
									<li><a href="<c:url value="/"/>">Supplier</a></li>
									<li><a href="<c:url value="/"/>">Product</a></li>
								</ul>
							</li>

							<li>
								<a href="<c:url value="/product"/>">Shop</a>
							</li>

							<li class="sale-noti">
								<a href="<c:url value="/product.details"/>">Sale</a>
							</li>

							<li>
								<a href="<c:url value="/cart"/>">Features</a>
							</li>

							<li>
								<a href="<c:url value="/blog"/>">Blog</a>
							</li>

							<li>
								<a href="<c:url value="/about"/>">About</a>
							</li>

							<li>
								<a href="<c:url value="/contact"/>">Contact</a>
							</li>
						</ul>
					</nav>
				</div>

				<!-- Header Icon -->
				<div class="header-icons">
					<a href="#" class="header-wrapicon1 dis-block">
						<img src="${icon}/icon-header-01.png" class="header-icon1" alt="ICON">
					</a>

					<span class="linedivide1"></span>

					<div class="header-wrapicon2">
						<img src="${icon}/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
						<span class="header-icons-noti">0</span>

						<!-- Header cart noti -->
						<div class="header-cart header-dropdown">
							<ul class="header-cart-wrapitem">
								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="${img1}/item-cart-01.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											White Shirt With Pleat Detail Back
										</a>

										<span class="header-cart-item-info">
											1 x $19.00
										</span>
									</div>
								</li>

								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="${img1}/item-cart-02.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											Converse All Star Hi Black Canvas
										</a>

										<span class="header-cart-item-info">
											1 x $39.00
										</span>
									</div>
								</li>

								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="${img1}/item-cart-03.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											Nixon Porter Leather Watch In Tan
										</a>

										<span class="header-cart-item-info">
											1 x $17.00
										</span>
									</div>
								</li>
							</ul>

							<div class="header-cart-total">
								Total: $75.00
							</div>

							<div class="header-cart-buttons">
								<div class="header-cart-wrapbtn">
									<!-- Button -->
									<a href="<c:url value="/cart"/>" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
										View Cart
									</a>
								</div>

								<div class="header-cart-wrapbtn">
									<!-- Button -->
									<a href="#" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
										Check Out
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Header Mobile -->
		<div class="wrap_header_mobile">
			<!-- Logo moblie -->
			<a href="index.html" class="logo-mobile">
				<img src="${img}/l2.png" alt="IMG-LOGO">
			</a>

			<!-- Button show menu -->
			<div class="btn-show-menu">
				<!-- Header Icon mobile -->
				<div class="header-icons-mobile">
					<a href="#" class="header-wrapicon1 dis-block">
						<img src="${icon }/icon-header-01.png" class="header-icon1" alt="ICON">
					</a>

					<span class="linedivide2"></span>

					<div class="header-wrapicon2">
						<img src="images/icons/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
						<span class="header-icons-noti">0</span>

						<!-- Header cart noti -->
						<div class="header-cart header-dropdown">
							<ul class="header-cart-wrapitem">
								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="${img1 }/item-cart-01.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											White Shirt With Pleat Detail Back
										</a>

										<span class="header-cart-item-info">
											1 x $19.00
										</span>
									</div>
								</li>

								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="images/item-cart-02.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											Converse All Star Hi Black Canvas
										</a>

										<span class="header-cart-item-info">
											1 x $39.00
										</span>
									</div>
								</li>

								<li class="header-cart-item">
									<div class="header-cart-item-img">
										<img src="${img1 }/item-cart-03.jpg" alt="IMG">
									</div>

									<div class="header-cart-item-txt">
										<a href="#" class="header-cart-item-name">
											Nixon Porter Leather Watch In Tan
										</a>

										<span class="header-cart-item-info">
											1 x $17.00
										</span>
									</div>
								</li>
							</ul>

							<div class="header-cart-total">
								Total: $75.00
							</div>

							<div class="header-cart-buttons">
								<div class="header-cart-wrapbtn">
									<!-- Button -->
									<a href="cart.html" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
										View Cart
									</a>
								</div>

								<div class="header-cart-wrapbtn">
									<!-- Button -->
									<a href="#" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
										Check Out
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
					<span class="hamburger-box">
						<span class="hamburger-inner"></span>
					</span>
				</div>
			</div>
		</div>

		<!-- Menu Mobile -->
		<div class="wrap-side-menu" >
			<nav class="side-menu">
				<ul class="main-menu">
					<li class="item-topbar-mobile p-l-20 p-t-8 p-b-8">
						<span class="topbar-child1">
							Free shipping for standard order over $100
						</span>
					</li>

					<li class="item-topbar-mobile p-l-20 p-t-8 p-b-8">
						<div class="topbar-child2-mobile">
							<span class="topbar-email">
								fashe@example.com
							</span>

							<div class="topbar-language rs1-select2">
								<select class="selection-1" name="time">
									<option>USD</option>
									<option>EUR</option>
								</select>
							</div>
						</div>
					</li>

					<li class="item-topbar-mobile p-l-10">
						<div class="topbar-social-mobile">
							<a href="#" class="topbar-social-item fa fa-facebook"></a>
							<a href="#" class="topbar-social-item fa fa-instagram"></a>
							<a href="#" class="topbar-social-item fa fa-pinterest-p"></a>
							<a href="#" class="topbar-social-item fa fa-snapchat-ghost"></a>
							<a href="#" class="topbar-social-item fa fa-youtube-play"></a>
						</div>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/"/>">Home</a>
						<ul class="sub-menu">
							<li><a href="<c:url value="/"/>">Homepage V1</a></li>
							<li><a href="<c:url value="/"/>">Homepage V2</a></li>
							<li><a href="<c:url value="/"/>">Homepage V3</a></li>
						</ul>
						<i class="arrow-main-menu fa fa-angle-right" aria-hidden="true"></i>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/product"/>">Shop</a>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/product.deatails"/>">Sale</a>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/cart"/>">Features</a>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/blog"/>">Blog</a>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/about"/>">About</a>
					</li>

					<li class="item-menu-mobile">
						<a href="<c:url value="/contact"/>">Contact</a>
					</li>
				</ul>
			</nav>
		</div>
	</header>