<%-- 
    Document   : add-items
    Created on : Oct 20, 2014, 10:04:23 PM
    Author     : gebak_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add an item:</title>
    </head>
    <body>
        <div>
        
        <form id="additemform">
                Image:   <input type="image" name="img"><br>
                Name:    <input type="text" name="ID"><br>
                ID:      <input type="text" name="ID"><br>
                Amount:  <input type="number" name="ID"><br>
                Price:  €<input type="number" name="ID"><br>
                Weight:  <input type="number" name="ID">KG<br>
                Branch:  <select name="branches">
                            <option value="alkmaar" selected>Alkmaar</option>
                            <option value="amstel">Amsterdam Amstel</option>
                            <option value="houthavens" >Amsterdam Houthavens</option>
                            <option value="beverwijk">Beverwijk</option>
                            <option value="groningen">Groningen</option>
                            <option value="haarlem">Haarlem</option>
                            <option value="haarlemZuid">Haarlem Zuid</option>
                            <option value="helmond">Helmond</option>
                            <option value="hilversum">Hilversum</option>
                            <option value="nieuwegein">Hoofdkantoor Nieuwegein</option>
                            <option value="schiedam">Schiedam</option>
                            <option value="tilburg">Tilburg</option>
                            <option value="utrecht">Utrecht</option>
                            <option value="wijchen">Wijchen</option>
                            <option value="zwolle">Zwolle</option>
                         </select><br>
                 
                         Is this item broken?<br> 
                <input type="radio" name="broken" value="Yes">Yes<br>
                <input type="radio" name="broken" value="No">No<br>
                
            </form> 
            Description:<br> <textarea name="description" form="additemform" rows="10">Enter text here...</textarea>
            <br> <input type="submit" name="submit" form = "additemform"><br>
        </div>
    </body>
</html>
