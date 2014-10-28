<%-- 
    Document   : template.jsp
    Created on : 28-okt-2014, 10:28:04
    Author     : Deva
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>IJzerwarenOutlet | Home</title>
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
                    <h3 class="panel-title">Home</h3>
                </div>
                <div  class="panel-body">
                    <h1>Welkom bij IJzenwarenOutlet</h1>
                    <p>Bedankt voor uw bezoek!</p>
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