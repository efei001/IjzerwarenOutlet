<%-- 
    Document   : template.jsp
    Created on : 28-okt-2014, 10:28:04
    Author     : Deva
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>IJzerwarenOutlet | Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <!-- Include for the menu -->
        <%@ include file="menu.jsp" %>
        <!-- Start of wrapper -->
        <div id="container">
            <!-- Start of content -->
            <div id="content" class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Login</h3>
                </div>
                <div  class="panel-body">
                <table class="myTableForm">
                                <tr class="test">
                                    <td>User Name</td>
                                    <td><input type="text" class="form-control" name="txtUserName"/></td>
                                </tr>
                                <tr>
                                    <td>Password</td>
                                    <td><input type="password"  class="form-control" name="txtPassword"/></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><button class="btn btn-success" type="submit">Login</button><a href="signup.jsp">
                                        <input class="btn btn-danger" type="button" value="Signup" />
                                    </a></td>
                                </tr>
                            </table> 
                </div>
            </div>
            <!-- End of content -->
            <!-- Include for the sidebar -->
            <%@ include file="sidebar.jsp" %>
        </div>
        <!-- End of wrapper -->
        <!-- Include for the footer -->
        <%@ include file="footer.html" %>
    </body>
</html>