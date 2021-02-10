<%--
  Created by IntelliJ IDEA.
  User: C
  Date: 2021-02-01
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="controllers.*" %>
<%@ page import="domain.entities.shop.Product" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Java Pet Supplies</title>

    <!-- Bootstrap core CSS -->
    <link href="styles/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="styles/css/shop-homepage.css" rel="stylesheet">

    <title>Pet Supplies</title>
</head>
<body>
<div class = "wishList">
    <table class="table table-bordered table-striped" id="WishProducts">
        <thead>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <% out.print("product: "); Product p = (Product)request.getAttribute("product"); %>
        <tr>
            <td>
            <% out.print(p.getProductName()); %>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="//ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.1.min.js"></script>
<script src="//ajax.aspnetcdn.com/ajax/bootstrap/3.2.0/bootstrap.min.js"></script>

</body>
</html>