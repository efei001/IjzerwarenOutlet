<%-- 
    Document   : template.jsp
    Created on : 28-okt-2014, 10:28:04
    Author     : Deva
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>IJzerwarenOutlet | Register</title>
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
                    <h3 class="panel-title">Register</h3>
                </div>
                <div  class="panel-body">
                    <form name="registration" action="RegServlet" method="post">
                        <input type="hidden" name="pagename" value="register"/>
                        <table class="myTableForm">
                            <tr>
                                <td><label for="name">Name</label></td>
                                <td><input class="form-control" type="text" id="name" name="name"/></td>
                            </tr>

                            <tr>
                                <td><label for="password">Password</label></td>
                                <td><input class="form-control" type="password" id="password" name="password"/></td>
                            </tr>

                            <tr>
                                <td>Gender</td>
                                <td><input type="radio" name="gender" id="Male" value="male"><label for="male">Male</label><br><input type="radio" name="gender" id="female" value="female"><label for="female">Female</label></td>
                            </tr>

                            <tr>
                                <td><label for="email">Email</label></td>
                                <td><input class="form-control" type="text" id="email" name="email"></td>
                            </tr>

                            <tr>
                                <td><label for="age">Age</label></td>
                                <td><input class="form-control" type="number" id ="age" name="age"/></td>
                            </tr>

                            <tr>
                                <td><label for="province">Province</label></td>
                                <td>
                                    <select class="form-control" id="province" name="province">
                                        <option value="Drenthe">Drenthe</option>
                                        <option value="Flevoland">Flevoland</option>
                                        <option value="Friesland">Friesland</option>
                                        <option value="Gelderland">Gelderland</option>
                                        <option value="Groningen">Groningen</option>
                                        <option value="Limburg">Limburg</option>
                                        <option value="Noord-Brabant">Noord-Brabant</option>
                                        <option value="Noord-Holland">Noord-Holland</option>
                                        <option value="Overijssel">Overijssel</option>
                                        <option value="Utrecht">Utrecht</option>
                                        <option value="Zeeland">Zeeland</option>
                                        <option value="Zuid-Holland">Zuid-Holland</option>
                                    </select></td>
                            </tr>

                            <tr>
                                <td><label for="address">Address</label></td>
                                <td>
                                    <textarea class="form-control" id="address" name="address"></textarea>
                                </td>
                            </tr>

                            <tr>
                                <td><label for="postalCode">Postal Code</label></td>
                                <td><input class="form-control" type="text" id="postalCode" name="postalCode"/></td>
                            </tr>

                            <tr>
                                <td><button class="btn btn-danger" type="submit">Submit</button></td>
                            </tr>

</table>
                    </form>
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