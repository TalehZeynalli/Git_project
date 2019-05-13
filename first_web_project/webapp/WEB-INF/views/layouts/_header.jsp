<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="lang"
	value="${not empty param['lang'] ? param['lang']:  not empty lang ? lang: 'az'}"
	scope="session" />

<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="com/az/i18n/messages_${lang}" var='lng' />

<nav style="margin-top: 20px" class="navbar navbar-inverse">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand"
				href="${pageContext.request.contextPath }/products">Product</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">

			</ul>
			<c:set var="catID" value="${param['cat']}" scope="page" />
			<form action="${pageContext.request.contextPath }/products"
				class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" name="search" class="form-control"
						placeholder="Search">
				</div>
				<c:if test="${not empty pageScope.catID }">
					<input hidden="true" type="text" name="catID"
						value="${pageScope.catID}" />
				</c:if>
				<button type="submit" class="btn btn-default">
					<fmt:message key="search" bundle="${lng}" />
				</button>


			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${pageContext.request.contextPath}/basket"> <fmt:message
							bundle="${lng}" key="basket"></fmt:message>
						(${fn:length(sessionScope.basketList)})
				</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"><fmt:message key="language"
							bundle="${lng}">
						</fmt:message> <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/products?lang=az">AZ</a></li>
						<li><a
							href="${pageContext.request.contextPath}/products?lang=en">En</a></li>
					</ul></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>