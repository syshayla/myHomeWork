<%-- 
    Document   : log
    Created on : Apr 26, 2019, 11:36:52 PM
    Author     : Sumaiya
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please login!..</h1>
        <form action="Authentic.jsp">
            First Name: <input type="text" name="fname"/>
            Last Name: <input type="text" name="lname"/>
            Password: <input type="password" name="password"/><hr/>
            <input type="submit" value="LogIn"/>
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </body>
</html>
