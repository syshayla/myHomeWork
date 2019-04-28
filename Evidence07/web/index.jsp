<%-- 
    Document   : index
    Created on : Apr 26, 2019, 11:36:38 PM
    Author     : Sumaiya
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome! <c:out value="${fn:toUpperCase(sessionScope['loginUser'])}"/> </h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="log.jsp"/>
        </c:if>
        <a href="log.jsp">Want to log out?</a>
    </body>
</html>
