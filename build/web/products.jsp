<%-- 
    Document   : products
    Created on : May 11, 2018, 8:16:49 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="controller" uri="/WEB-INF/tlds/controller"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
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
        <link rel="stylesheet" type="text/css" href="assets/css/products.css">
    </head>
    <body id="style-3" data-spy="scroll" data-target=".navbar" data-offset="50">

        <!-- Nav -->
        <%@include file="nav.jsp"%> 

        <!-- Cover -->
        <div id="main-contain" class="container">
            <div class="row">
                <div class="col-md-3 pd-zero">
                    <div class="left-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>Thể loại</h6>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <%@include file="sidebar-nav.jsp"%> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-9 pd-zero">
                    <div class="right-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>
                                    Sản phẩm
                                    <span class="float-right sort" style="font-size: 1rem;">
                                        Sắp xếp giá:&nbsp;&nbsp;
                                        <a href=""><i class="fas fa-sort-amount-up mg-right-10"></i></a>
                                        <a href=""><i class="fas fa-sort-amount-down"></i></a>
                                    </span>
                                </h6>
                            </div>
                        </div>
                        <div class="row mg-top-10">    
                            <c:if test="${list == null}">
                                <controller:controller className="com.service.ProductService" 
                                                       methodName="getListProducts" returnedAttribute="list" />                              
                            </c:if>
                            <c:forEach var="i" items="${list}">
                                <c:if test="${i.status != 0}">
                                    <div class="col-6 col-md-3 mg-bottom-25">
                                        <div class="product">
                                            <c:if test="${i.status == 2}">
                                                <div class="status">
                                                    <img src="assets/images/icon-sale.png" alt="">
                                                </div>
                                            </c:if>
                                            <div class="img">
                                                <img src="${i.imageUrl}" alt="">
                                                <div class="overlay">
                                                    <p>
                                                        <a href="">
                                                            <i class="fas fa-cart-plus fa-fw mg-right-5" style="font-size: 15px;"></i> Thêm vào giỏ
                                                        </a>
                                                    </p>
                                                </div>
                                            </div>
                                            <div class="description text-center">
                                                <h6><a href="product?id=${i.id}">${i.name}</a></h6>
                                                <p>${i.price}<sup>đ</sup></p>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </c:forEach>
                        </div>
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
