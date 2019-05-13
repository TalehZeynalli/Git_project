<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
<title>Login</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/CSS/bootstrap.css"/>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"> </script>

</head>

<%
      String error=request.getParameter("error");
%>


<body>



     <div style="margin-top: 100px" class="container">
      <div class=" col-md-3 col-md-offset-4">
          <form action="${pageContext.request.contextPath }/user-controller" method="get">
            <div class="form-group" style="color:red;">
             <% if(error !=null && error.equals("ue")){
             %>
              <span class="lbl lbl-danger"> <%
         
             out.print("Username ve ya parol sehvdir!");
            %></span>
          
          </div>
          <%} %>
          
               <div class="form-group">
                   <input name="username" type="text" class="form-control" placeholder="Username"/>
               </div>
    
               <div class="form-group">
                   <input name="password" type="password" class="form-control" placeholder="Password"/>
               </div>
    
               <div class="form-group">
                   <button type="submit" class="form-control  btn btn-success">Login</button>
               </div>
               <a href="${pageContext.request.contextPath}/registration">Registration</a>
         </form>
     </div>
  </div>
  </body>
</html>