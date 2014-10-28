<%-- 
    Document   : profile
    Created on : Sep 30, 2014, 11:31:21 AM
    Author     : jaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
       <div>
            <h1>Profile</h1>
        </div>
        <div>
            <a href="index.jsp">Home</a>
            <a href="login.jsp">Login</a>
            <a href="storage.jsp">Storage</a>
        </div>
        <br>
        <form>
            <table>
              <tr>
                <td align="right">First Name:</td>
                <td align="left"><input type="text" name="first" /></td>
              </tr>
              <tr>
                <td align="right">Last Name:</td>
                <td align="left"><input type="text" name="last" /></td>
              </tr>
              <tr>
                <td align="right">Email:</td>
                <td align="left"><input type="text" name="email" /></td>
              </tr>
              <tr>
                <td align="right">Adress:</td>
                <td align="left"><input type="text" name="email" /></td>
              </tr>
              <tr>
                <td align="left"><input type="submit" name="submit" /></td>
              </tr>
            </table>
        </form>
    </body>
</html>
