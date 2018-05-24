<%-- 
    Document   : nav
    Created on : May 11, 2018, 8:47:52 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-md bg-light navbar-light">
    <div class="container">
        <a class="navbar-brand" href="#">SunChoShop</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">HOT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">NEW</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Giảm giá</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Phụ kiện</a>
                </li>
            </ul>
            <div class="ml-auto">
                <ul class="navbar-nav">
                    <!-- Dropdown -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                            <i class="fas fa-cart-arrow-down fa-fw mg-right-5" style="font-size: 16px;"></i> Giỏ hàng
                            <span class="badge badge-danger mg-left-5">0</span>
                        </a>
                        <%@include file="cart.jsp"%> 
                    </li>
                    <form class="form-inline mg-left-20" action="products" method="POST">
                        <div class="input-group">
                            <input type="text" name="textSearch" class="form-control" placeholder="Tìm kiếm">
                            <div class="input-group-append">
                                <button type="submit" class="input-group-text"><i class="fas fa-search fa-fw icon-color"></i></button>
                            </div>
                        </div>
                    </form>
                </ul>
            </div>
        </div>
    </div>
</nav>