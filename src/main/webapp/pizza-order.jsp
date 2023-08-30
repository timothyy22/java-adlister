<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="pizza">
  <label for="crust">Choose a crust:</label>
  <select name="crust" id="crust">
    <option value="thin">thin</option>
    <option value="hand tossed">hand tossed</option>
    <option value="stuffed crust">stuffed crust</option>
    <option value="chicago">chicago</option>
  </select>
  <br><br>

  <label for="crustsize">What size:</label>
  <select name="crustsize" id="crustsize">
    <option value="small">small</option>
    <option value="medium">medium</option>
    <option value="large">large</option>
  </select>
  <br><br>

  <label for="saucetype">sauce:</label>
  <select name="saucetype" id="saucetype">
    <option value="pizza">Pizza Sauce</option>
    <option value="bbq">BBQ Sauce</option>
    <option value="garlic">Garlic Sauce</option>
  </select>
  <br><br>


  <p>toppings</p>
  <input type="checkbox" name="toppings" id="Pepperoni" value="Pepperoni">
  <label for="Pepperoni"> Pepperoni</label><br>
  <input type="checkbox" name="toppings" id="Sausage" value="Sausage">
  <label for="Sausage">Sausage</label><br>
  <input type="checkbox" name="toppings" id="Mushrooms" value="Mushrooms">
  <label for="Mushrooms">Mushrooms</label><br>
  <input type="checkbox" name="toppings" id="Onions" value="Onions">
  <label for="Onions">Onions</label><br>

  <input type="text" name="delivery" placeholder="Enter your adress">



  <input type="submit" value="Submit">
</form>

</body>
</html>
