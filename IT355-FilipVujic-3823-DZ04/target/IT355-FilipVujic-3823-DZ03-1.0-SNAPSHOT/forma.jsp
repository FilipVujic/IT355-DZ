<%-- 
    Document   : forma
    Created on : Sep 11, 2021, 1:42:11 PM
    Author     : filip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Citanje Checkbox podataka</title>
    </head>
    <body>
    <center>
        <h1>Citanje Checkbox podataka</h1>
        <h1>Dobrodošli, <%= request.getParameter("ime")%>!</h1>
    </center>
    <ul>
        <c:if test="${'on'.equals(pageContext.request.getParameter('fit'))}">
            <li><p><b>FIT oblelezen:</b>
                        <%= request.getParameter("fit")%>
                    <a href="http://www.metropolitan.ac.rs/osnovne-studije/
                       fakultet-informacionih-tehnologija/">Posetite FIT</a>
                </p></li>
            </c:if>
            <c:if test="${'on'.equals(pageContext.request.getParameter('fdu'))}">
            <li><p><b>FDU obelezen:</b>
                        <%= request.getParameter("fdu")%>
                    <a href="http://www.metropolitan.ac.rs/
                       fakultet-digitalnih-umetnosti-2/">Posetite FDU</a>
                </p></li>
            </c:if>
            <c:if test="${'on'.equals(pageContext.request.getParameter('fam'))}">
            <li><p><b>FAM oblezen:</b>
                        <%= request.getParameter("fam")%>
                    <a href="http://www.metropolitan.ac.rs/osnovne-studije/
                       fakultet-za-menadzment/">Posetite FAM</a>
                </p></li>
            </c:if>
    </ul>
</body>
</html>
