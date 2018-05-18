<%-- 
    Document   : sidebar-nav
    Created on : May 11, 2018, 8:57:47 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="side-nav">
    <ul class="navbar-nav ml-auto">
        <c:choose>
            <c:when test="${cId == 0}">
                <li class="nav-item">
                    <a class="nav-link active" href="products?categoryId=0">
                        <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mg-right-10"></i> Tất cả
                    </a>
                </li>
            </c:when>
            <c:otherwise>
                <li class="nav-item">
                    <a class="nav-link" href="products?categoryId=0">
                        <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mg-right-10"></i> Tất cả
                    </a>
                </li>
            </c:otherwise>
        </c:choose>

        <controller:controller className="com.service.CategoryService" 
                               methodName="getListCategories" returnedAttribute="listC" />
        <c:forEach var="i" items="${listC}">
            <c:choose>
                <c:when test="${cId == i.id}">
                    <li class="nav-item">
                        <a class="nav-link active" href="products?categoryId=${i.id}">
                            <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mg-right-10"></i> ${i.name}
                        </a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item">
                        <a class="nav-link" href="products?categoryId=${i.id}">
                            <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mg-right-10"></i> ${i.name}
                        </a>
                    </li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </ul>
</div>