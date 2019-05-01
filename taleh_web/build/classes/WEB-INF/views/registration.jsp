<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.az.service.UserService"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
 <link rel="stylesheet" type="text/css" href="second_web_project/CSS/bootstrap.css"/>
     <script type="text/javascript" src="second_web_project/js/jquery-3.3.1.js"></script>
     <script type="text/javascript" src="second_web_project/js/bootstrap.js"></script>
     <script type="text/javascript" src="second_web_project/js/main.js"> </script>
<title>Registration</title>
</head>
<body>

         <div style="margin-top: 50px" class="container">
           <div class=" col-md-3 col-md-offset-4">
                <form action="second_web_project/user-controller"  method="post">   
                 <h1>Register</h1>          
<!--               <div style="margin-bottom: 5px"> Username </div>   -->
                     <div class="form-group">
                    <input  name="username" type="text" class="form-control" placeholder="Username"/>
                  </div>    
               <div class="form-group">
                   <input name="password" type="password" class="form-control" placeholder="Password"/>
               </div>
               
                <div class="form-group">
                   <input name="name" type="text" class="form-control" placeholder="Name"/>
               </div>
                <div class="form-group">
                   <input name="surname" type="text" class="form-control" placeholder="Surname"/>
               </div>
                <div class="form-group">
                   <input name="age" type="number" value="" class="form-control" placeholder="Age"/>
               </div>
    
               <div class="form-group">
                    <button type="submit" class="form-control  btn btn-success">Register</button>
        </div>
               </form>
           
           </div>
          </div>
</body>
</html>