<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: C
  Date: 2021-02-01
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Java Pet Supplies</title><h>Brattpets 2.0</h>

    <!-- Bootstrap core CSS -->
    <link href="views/styles/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="views/styles/css/shop-homepage.css" rel="stylesheet">

</head>
<body>
<jsp:include page="shared/navbarView.jsp"/>
<div class="wishList">
    <table class="table table-bordered table-striped" id="WishProducts">
        <thead>
        <tr>
            <th>Product Id</th>
            <th></th>
            <th>Name</th>
            <th></th>
            <th>Category</th>
            <td></td>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${wishList}" var="wishList">

            <tr>
                <td>
                        ${wishList.productId}
                </td>
                <td></td>
                <td>
                        ${wishList.productName}
                </td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                        ${wishList.productPrice}
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white"></p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="styles/vendor/jquery/jquery.min.js"></script>
<script src="styles/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>