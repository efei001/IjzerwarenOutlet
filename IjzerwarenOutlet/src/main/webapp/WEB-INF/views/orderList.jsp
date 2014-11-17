<%-- 
    Document   : orderList
    Created on : Nov 17, 2014, 12:59:20 PM
    Author     : gebak_000
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<% String s = (String) request.getAttribute("message"); %>
<% request.setAttribute("succes", s);%>

<t:genericPage>
    <jsp:body>
        <h1>${paginaTitel}</h1>
        <c:if test="${not empty succes}"><font color="green"><b>${succes}</b></font></c:if>

            <c:choose>
                <c:when test="${products.size() != 0}">
                <table  class="table table-striped">
                    <tr>
                        <td><strong> Date</strong></td>
                        <td><strong> ID</strong></td>
                        <td><strong> Amount </strong></td>
                        <td><strong> Location</strong></td>
                        <td><strong> Total Price </strong></td>
                        <td><strong> Shipping Costs</strong></td>
                    </tr>
                    <c:forEach var="order" items="${orders}">
                        <tr>
                            <td>${order.date}</td>
                            <td>${order.id}</td>
                            <td>${order.location}</td>
                            <td>${order.Amount}</td>
                            <td>${order.totalPrice}</td>
                            <td>${order.shippingCosts}</td>
                            <td>

                            </td>
                        </tr> 
                    </c:forEach>
                </table>
                </c:when>
                <c:otherwise>
                    <!-- Als er geen gebruikers zijn, wordt deze melding getoond -->
                    Er zijn geen orders gevonden.
                </c:otherwise>
            </c:choose>
        <p>
            <a href="index.jsp">Home</a>
        </p>
        <p>
            <a href="login.jsp">Login</a>
        </p>
        <p>
            <a href="profile.jsp">Profile</a>
        </p>

    </jsp:body>
</t:genericPage>
