
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>All Vendors</title>
</head>
<body>
<h2>Vendors</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Code</th>
        <th>Name</th>
        <th>Type</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${vendors}" var="vendor">
    <tr>
        <td>${vendor.id}</td>
        <td>${vendor.code}</td>
        <td>${vendor.name}</td>
        <td>${vendor.type}</td>
        <td>${vendor.email}</td>
        <td>${vendor.phone}</td>
        <td>${vendor.address}</td>
        <td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
        <td><a href="showUpdate?id=${vendor.id}">Edit</a></td>
    </tr>
    </c:forEach>
</table>
<a href="showCreate">Add Vendor</a>
</body>
</html>