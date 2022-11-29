<%@ page import="java.util.List" %>
<%@ page import="com.smartuniversity.dto.User" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT LIST PAGE</title>
</head>
<body>


<h1>SUBMITED STUDENT INFORMATIONS</h1>
   
   <div>
   
   <table border ="1">
   <tr>
     <td>STUDENT NAME</td>
     <td>Roll Number</td>
     <td>Email Id</td>
     <td>Mobile Number</td>
     </tr>
     
     <%
       List<User> userList = (List<User>)request.getAttribute("users");
       for(User userobj : userList){
    	   
    %>
    	   
    	  <tr>
    	  <td><%= userobj.getStudentName() %></td> 
          <td><%= userobj.getRollNumber() %></td> 
          <td><%= userobj.getEmailId() %></td> 
          <td><%= userobj.getMobileNumber() %></td> 
          </tr>
          
          <%
          
       }
          
          %>
     
        </table>
   
   </div>
</body>
</html>