<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.az.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.az.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Products</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/CSS/bootstrap.css" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/main.js">
	
</script>

</head>
<body>
	<!--  ara qoymusdun burda , + db-de komp category-si olan product yox idi-->
		<c:set var="catID" value="${param['cat']}" scope="page" />
	<c:set var="search" value="${param['search']}" scope="page" />
	<c:set var="page" value="${param['page']}" scope="page" />
	<c:set var="size" value="${param['size']}" scope="page" />

	<div class="container">

		<%@include file="./layouts/_header.jsp"%>

		<div style="margin-top: 20px">


			<jsp:useBean id="productService"
				class="com.az.service.ProductService" scope="page" />

			<jsp:useBean id="categoryService"
				class="com.az.service.CategoryService" scope="page" />

			<jsp:useBean id="currencyService"
				class="com.az.service.CurrencyService" scope="page"></jsp:useBean>

			<c:set var="valCurs"
				value="${pageScope.currencyService.getCurencies()}" scope="page" />
			<div class="col-md-3 row ">

				<div class="list-group">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Category <span class="icon-bar"></span>
							<span class="icon-bar"></span> <span class="icon-bar"></span></a>
						<ul class="dropdown-menu">

							<c:forEach var="category"
								items="${pageScope.categoryService.getListCategory(lang)}">

								<c:url value="/products" var="catURL">
									<c:param name="cat" value="${category.id}"></c:param>
								</c:url>

								<c:choose>
									<c:when
										test="${not empty param['cat'] and param['cat'] eq category.id}">
										<a href="${catURL}" class="list-group-item active visible-lg">${category.name}</a>
									</c:when>
									<c:otherwise>
										<a href="${catURL}" class="list-group-item">${category.name}</a>
									</c:otherwise>
								</c:choose>

							</c:forEach>
						</ul></li>
				</div>
				<div class="thumbnail">
					<c:forEach var="valute"
						items="${pageScope.valCurs.valType[1].valute}">
						<c:if
							test="${valute.code eq 'USD' or
        valute.code eq 'EUR' or 
        valute.code eq 'TRY' or
        valute.code eq 'IRR' }">
							<h4>${valute.name}&nbsp;${valute.value}AZN</h4>
						</c:if>
					</c:forEach>

				</div>

			</div>

			<div class="col-md-9 ">
				<c:forEach var="product"
					items="${pageScope.productService.getListProduct(pageScope.catID,pageScope.search,lang,page,size)}">
					<div style="margin: 5px" class=" col-md-3">
						<img width="85px" height="85px" src="/images/${product.imagePath}" />
						<div class="caption">
							<h4>${product.name}</h4>
							<p>${product.price}AZN</p>
							<p>
								<a href="/images/${product.imagePath}" class=" btn btn-primary"
									role="button"> <fmt:message key="viewproduct"
										bundle="${lng}"></fmt:message>
								</a>
								<button pId="${product.id}" type="submit"
									class=" btnAddToBasket btn btn-default">
									<fmt:message key="addtobasket" bundle="${lng}"></fmt:message>
								</button>
							</p>
						</div>
						<br />
					</div>
				</c:forEach>
			</div>


			<div class="row" align="center">
				<nav aria-label="Page navigation">
				<ul class="pagination pagination-lg">
					<li><c:if test="${page>1}">
							<c:url var="peUrl" value="?page=${page-1}"></c:url>
							<a href="${peUrl}" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
							</a>
						</c:if></li>

					<c:forEach begin="1"
						end="${pageScope.productService.countPageInation(pageScope.catID,pageScope.search,pageScope.page,pageScope.size)}"
						var="i">

						<c:url var="pageUrl" value="?page=${i}"></c:url>

						<c:choose>
							<c:when test="${i eq 1 and empty param['page']}">
								<li class="active"><a href="${pageUrl}">${i}</a></li>
							</c:when>
							<c:when test="${param['page'] eq i}">
								<li class="active"><a href="${pageUrl}">${i}</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${pageUrl}">${i}</a></li>
							</c:otherwise>
						</c:choose>

					</c:forEach>
					</li>
					<c:set scope="page"
						value="${pageScope.productService.countPageInation(pageScope.catID,pageScope.search,pageScope.page,pageScope.size)}"
						var="i"></c:set>
					<li><c:if test="${empty param['page'] or page<i}">
							<c:url var="nextUrl" value="?page=${page+1}"></c:url>

							<a href="${nextUrl}" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
							</a></li>
					</c:if>


				</ul>
				</nav>
			</div>

		</div>

	</div>

	<div style="margin-top: 50px" class="row"><%@include
			file="./layouts/_footer.jsp"%></div>

</body>
</html>