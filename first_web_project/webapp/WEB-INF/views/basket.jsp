<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.az.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.az.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basket</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/CSS/bootstrap.css"/>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"> </script>

</head>
<body>
  
  <table>
   <c:forEach items="${sessionScope.basketList}" var="product">
    <tr>
      <td>${product.id }</td>
      <td>${product.name }</td>
      <td>${product.price }</td>
    </tr>
    </c:forEach>
  </table>



</body>
</html>