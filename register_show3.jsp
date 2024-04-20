<%@ page import="com.mypack.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all users</title>

</head>
<body>
<form>
	<div align="center">
		
  <table>
     
        <tr>
           <th>User id</th>
           <th>Full name</th>
           <th>E-mail</th>
           <th>Password</th>
           <th>Birth day</th>
           <th>Gender</th>
           <th>Profession</th>
           <th>Married</th>
           <th>Note</th><th>View</th><th>update</th><th>delete</th>
        </tr>
       
              
            <c:forEach var="user" items="${users}">  
           <tr>  
           <td><c:out value="${user.uid}"/></td>  
           <td><c:out value="${user.name}"/></td>  
           <td><c:out value="${user.email}"/></td>  
           <td><c:out value="${user.password}"/></td>
           <td><c:out value="${user.birthday}"/></td>
           <td><c:out value="${user.gender}"/></td>                       
           <td><c:out value="${user.profession}"/></td>            
           <td><c:out value="${user.married}"/></td>               
           <td><c:out value="${user.note}"/></td>
           <td><a href="/user/${user.uid}">${user.uid}</a>
           <td><a href="/user/${user.uid}">${user.uid}</a>
           <td><a href="/user/${user.uid}">${user.uid}</a>
           </tr>             
           </c:forEach>            
           
  </table>  </div></form></body></html>