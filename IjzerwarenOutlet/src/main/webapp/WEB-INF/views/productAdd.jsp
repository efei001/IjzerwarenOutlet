<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String s = (String) request.getAttribute("error"); %>
<% String s2 = (String) request.getAttribute("error2"); %>
<% String s3 = (String) request.getAttribute("error3"); %>
<% String s4 = (String) request.getAttribute("error4"); %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% request.setAttribute("name_error", s); %>
<% request.setAttribute("weight_error", s2); %>
<% request.setAttribute("description_error", s3);%>
<% request.setAttribute("location_error", s4);%>


<t:genericPage>
    <jsp:body>

        <h1>New product</h1> 
        <form:form method="POST" class="form-horizontal" role="form" commandName="product" action="${pageContext.request.contextPath}/product/add">  

            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">Name</label> <font color="red"><b>${name_error}</b></font>
                <div class="col-sm-4">
                    <form:input path="name" class="form-control" id="name" placeholder="Name"/> 
                </div>
            </div>

            <div class="form-group">
                <label for="price" class="col-sm-2 control-label">Price</label>
                <div class="col-sm-4">
                    <form:input path="price" class="form-control" id="price" />
                </div>
            </div>

            <div class="form-group">
                <label for="location" class="col-sm-2 control-label">Location</label> <font color="red"><b>${location_error}</b></font>
                <div class="col-sm-4">
                    <form:input path="location" class="form-control" id="location" placeholder="Location"/>
                </div>
            </div>

            <div class="form-group">
                <label for="weight" class="col-sm-2 control-label">Weight</label> <font color="red"><b>${weight_error}</b></font>
                <div class="col-sm-4">
                    <form:input path="weight" class="form-control" id="weight" placeholder="Weight"/>
                </div>
            </div>

            <div class="form-group">
                <label for="description" class="col-sm-2 control-label">Description</label><font color="red"><b>${description_error}</b></font>
                <div class="col-sm-4">
                    <form:input path="description" class="form-control" id="description" placeholder="Description"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form:form>
    </jsp:body>
</t:genericPage>