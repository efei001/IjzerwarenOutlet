<%-- 
    Document   : template.jsp
    Created on : 28-okt-2014, 10:28:04
    Author     : Deva
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>IJzerwarenOutlet | About us</title>
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
                    <h3 class="panel-title">About us</h3>
                </div>
                <div  class="panel-body">
                    <img src="img/logo.jpg">
                    <h2>IJzenwaren Outlet</h2>
                    <p> Hier worden ijzerwaren waar een beperkte voorraad van is aangeboden voor een superscherp tarief </p>
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