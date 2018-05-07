
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Vendor</title>
</head>
<body>
<form action="updateVen" method="post">
    <pre>
<label for="id">Id:</label><input type="text" id="id" name="id" value="${vendor.id}" readonly="true">
<label for="code">Code:</label><input type="text" id="code" name="code" value="${vendor.code}">
<label for="name">Name:</label><input type="text" id="name" name="name" value="${vendor.name}">
<label for="type">Type:</label><select type="text" id="type" name="type">
        <option ${vendor.type == 'Regular'? 'selected' : ''}>Regular</option>
        <option ${vendor.type == 'Contract'? 'selected' : ''}>Contract</option>

    </select>
<label for="email">Email:</label><input type="text" id="email" name="email" value="${vendor.email}">
<label for="phone">Phone:</label><input type="text" id="phone" name="phone" value="${vendor.phone}">
<label for="address">Address:</label><input type="text" id="address" name="address" value="${vendor.address}">
    <input type="submit" value="Save">
        </pre>
</form>
${msg}
<br>
<a href="displayVendors">View All</a>
</body>
</html>