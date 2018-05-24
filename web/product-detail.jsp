<%-- 
    Document   : products-detail
    Created on : May 11, 2018, 8:47:36 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Product Details</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="Shortcut Icon" href="img/favicon.ico">

        <!-- Fonts Awesome v5-->
        <script defer src="assets/font-awesome-v5/js/fontawesome-all.js"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" type="text/css" href="assets/css/base.css">
        <link rel="stylesheet" type="text/css" href="assets/css/common.css">
        <link rel="stylesheet" type="text/css" href="assets/css/product-details.css">
    </head>
    <body id="style-3">
        <!-- Nav -->
        <%@include file="templates/nav.jsp"%> 

        <!-- Cover -->
        <div id="main-contain" class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="img mg-top-15">
                        <img src="assets/images/${product.imageUrl}" alt="${product.name}">
                    </div>
                </div>
                <div class="col-md-1"></div>
                <div class="col-md-5">
                    <div class="product-details">
                        <h5>${product.name}</h5>
                        <p class="price">${product.price}<sup>đ</sup>
                            <c:if test="${product.status == 2}">
                                <span class="badge badge-success mg-left-10">SALE</span>
                            </c:if>
                        </p>
                        <a href="products?categoryId=0" class="go-back"><i class="fas fa-chevron-left fa-lg"></i></a>
                        <a href="" class="btn-add-to-cart">
                            <i class="fas fa-cart-plus fa-fw fa-lg mg-right-5"></i> Thêm vào giỏ hàng
                        </a>
                        <p class="size">
                            Kích thước: ${product.size}
                        </p>
                        <p class="description">
                            ${product.description}
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <script src="assets/js/jquery/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="assets/js/bootstrap/bootstrap.min.js"></script>
        <script src="assets/js/app.js"></script>
    </body>
</html>
