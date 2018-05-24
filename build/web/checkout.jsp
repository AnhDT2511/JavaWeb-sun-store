<%-- 
    Document   : checkout
    Created on : May 24, 2018, 10:54:40 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" type="text/css" href="assets/css/checkout.css">
    </head>
    <body id="style-3">
        <!-- Nav -->
        <%@include file="templates/nav.jsp"%> 
        <!-- Cover -->
        <div id="main-contain" class="container">
            <div class="row">
                <div class="col-md-8 left-size">
                    <div class="row title">
                        <div class="col-md-12">
                            <h6>Giỏ hàng</h6>
                        </div>
                    </div>
                    <ul class="checkout-list">
                        <li class="item">
                            <img src="assets/images/soldier-green-tan.jpg" alt="">
                            <span class="name">SOLDIER GREEN/TAN</span>
                            <span class="price">222,200,000<sup>đ</sup></span>
                            <span class="quantity">x2</span>
                            <span class="update">
                                <button type="button" class="btn btn-danger"><i class="fas fa-plus fa-fw"></i></button>
                                <button type="button" class="btn btn-danger"><i class="fas fa-minus fa-fw"></i></button>
                            </span>
                        </li>
                        <li class="item">
                            <img src="assets/images/traveller-navy-beige.jpg" alt="">
                            <span class="name">TRAVELLER NAVY/BEIGE</span>
                            <span class="price">2,200,000<sup>đ</sup></span>
                            <span class="quantity">x3</span>
                            <span class="update">
                                <button type="button" class="btn btn-danger"><i class="fas fa-plus fa-fw"></i></button>
                                <button type="button" class="btn btn-danger"><i class="fas fa-minus fa-fw"></i></button>
                            </span>
                        </li>
                        <li class="item">
                            <img src="assets/images/traveller-navy-beige.jpg" alt="">
                            <span class="name">TRAVELLER NAVY/BEIGE</span>
                            <span class="price">2,200,000<sup>đ</sup></span>
                            <span class="quantity">x3</span>
                            <span class="update">
                                <button type="button" class="btn btn-danger"><i class="fas fa-plus fa-fw"></i></button>
                                <button type="button" class="btn btn-danger"><i class="fas fa-minus fa-fw"></i></button>
                            </span>
                        </li>
                        <li class="result text-right">
                            <p>Số lượng sản phẩm: <strong>3</strong></p>
                            <p>Tổng số tiền:  <strong>21.000.000<sup>đ</sup></strong></p>
                            <p>
                                <input type="checkbox" class="form-check-input" value="1"> Xác nhận giỏ hàng và các
                                <a href="javascript:void(0)" data-toggle="modal" data-target="#modalTerms"> điều khoản dịch vụ</a>
                            </p>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4 right-size">
                    <div class="row title">
                        <div class="col-md-12">
                            <h6>Thông tin khách hàng</h6>
                        </div>
                    </div>
                    <div class="input-form">
                        <form action="" method="">
                            <div class="form-group">
                                <label for="name">Họ và tên:</label>
                                <input type="text" class="form-control" name="fullname">
                            </div>
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" name="email">
                            </div>
                            <div class="form-group">
                                <label for="phone">Số điện thoại:</label>
                                <input type="text" class="form-control" name="phone">
                            </div>
                            <div class="form-group">
                                <label for="address">Địa chỉ:</label>
                                <textarea class="form-control" rows="3"></textarea>
                            </div>
                            <button type="submit" class="btn btn-danger float-right">Xác nhận</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- The Modal -->
        <div class="modal fade" id="modalTerms">
            <div class="modal-dialog">
                <div class="modal-content">

                    <!-- Modal Header -->
                    <div class="modal-header">
                        <h5 class="modal-title">Điều khoản dịch vụ</h5>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>

                    <!-- Modal body -->
                    <div class="modal-body">
                        Modal body..
                    </div>

                    <!-- Modal footer -->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
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
