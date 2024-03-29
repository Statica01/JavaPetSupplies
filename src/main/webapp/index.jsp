<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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

<jsp:include page="views/shared/navbarView.jsp"/>

<!-- Page Content -->
<div class="container">

    <div class="row">

        <div class="col-lg-3">

            <h1 class="my-4">Shop Name</h1>
            <div class="list-group">
                <a href="#" class="list-group-item">Cat</a>
                <a href="#" class="list-group-item">Dog</a>
                <a href="#" class="list-group-item">Bird</a>
            </div>

        </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

            <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="views/assets/images/clawClipperCat.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="views/assets/images/toothpasteBird.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="views/assets/images/toyDogSoftPlush.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="row">

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/toyCatBathCatDuck.jpg"
                                         alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Cat Bath Toy</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur!</p>
                        </div>
                        <div class="card-footer">
                            <a href="#link" type="button" class="btn btn-secondary btn-sm" role="button">Add to Wishlist</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/shampooCat.jpg" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Cat Shampoo</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur! Lorem ipsum dolor sit amet.</p>
                        </div>
                        <div class="card-footer">
                            <a href="#link" type="button" class="btn btn-secondary btn-sm" role="button">Add to Wishlist</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/shampooDog.jpg" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Dog Shampoo</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur!</p>
                        </div>
                        <div class="card-footer">
                            <a href="#link" type="button" class="btn btn-secondary btn-sm" role="button">Add to Wishlist</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/brushCat.png" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Cat Brush</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur!</p>
                        </div>
                        <div class="card-footer">
                            <a href="#link" type="button" class="btn btn-secondary btn-sm" role="button">Add to Wishlist</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/brushDog.jpg" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Dog Brush</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur! Lorem ipsum dolor sit amet.</p>
                        </div>
                        <div class="card-footer">
                            <a href="#link" type="button" class="btn btn-secondary btn-sm" role="button">Add to Wishlist</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="views/assets/images/toyDogFrisbee.jpg" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#">Dog Toy Frisbee</a>
                            </h4>
                            <h5>$24.99</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam
                                aspernatur!</p>
                        </div>
                        <div class="card-footer">
                            <form action="${pageContext.request.contextPath}index.do" method="post">
                                <input type="hidden" name="id" value="${nr}" />
                                <input type="submit" class="btn btn-secondary btn-sm" value="Add to wishlist" />
                            </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="views/styles/vendor/jquery/jquery.min.js"></script>
<script src="views/styles/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>