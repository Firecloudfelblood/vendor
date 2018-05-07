<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Vendor</title>
</head>
<body>
<form action="saveVen" method="post">
    <pre>
<label for="id">Id:</label><input type="text" id="id" name="id">
<label for="code">Code:</label><input type="text" id="code" name="code">
<label for="name">Name:</label><input type="text" id="name" name="name">
<label for="type">Type:</label><select type="text" id="type" name="type">
        <option value="Regular">Regular</option>
        <option value="Contract">Contract</option>

    </select>
<label for="email">Email:</label><input type="text" id="email" name="email">
<label for="phone">Phone:</label><input type="text" id="phone" name="phone">
<label for="address">Address:</label><input type="text" id="address" name="address">
    <input type="submit" value="Save">
        </pre>
</form>
${msg}
<br>
<a href="displayVendors">View All</a>
</body>
</html>