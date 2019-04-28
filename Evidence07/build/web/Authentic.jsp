<%-- 
    Document   : Authentic
    Created on : Apr 26, 2019, 11:37:06 PM
    Author     : Sumaiya
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${ empty param.fname or empty param.lname or empty param.password}">
        <c:redirect url="log.jsp">
            <c:param name="errMsg" value="Please fill the required field"/>
        </c:redirect> 
        </c:if>
        
        <c:if test="${not empty param.fname and param.lname and param.password}">
            <s:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin"
                             user="root" password="1234"/>
            <s:query dataSource="${db}" var="sql">
                select count(*) as counts from login
                where First Name='${param.fname}'
                and Last Name='${param.lname}'
                and Password='${param.password}'
            </s:query>
            <c:forEach items="${sql.rows}" var="r">
                <c:choose>
                    <c:when test="${r.counts gt 0}">
                        <c:set scope="session" var="loginUser" value="${param.fname}"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="log.jsp" >
                            <c:param name="errMsg" value="information doesn't match!"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
