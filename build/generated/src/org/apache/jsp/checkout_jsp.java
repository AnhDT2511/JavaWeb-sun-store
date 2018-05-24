package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/templates/nav.jsp");
    _jspx_dependants.add("/templates/cart.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Products</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"Shortcut Icon\" href=\"img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Fonts Awesome v5-->\n");
      out.write("        <script defer src=\"assets/font-awesome-v5/js/fontawesome-all.js\"></script>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/base.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/common.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/checkout.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"style-3\">\n");
      out.write("        <!-- Nav -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-light navbar-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">SunChoShop</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">HOT</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">NEW</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Giảm giá</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Phụ kiện</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"ml-auto\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <!-- Dropdown -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                            <i class=\"fas fa-cart-arrow-down fa-fw mg-right-5\" style=\"font-size: 16px;\"></i> Giỏ hàng\n");
      out.write("                            <span class=\"badge badge-danger mg-left-5\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"dropdown-menu shopping-cart\">\n");
      out.write("    <div id=\"style-4\" class=\"shopping-cart-items\">\n");
      out.write("        <a class=\"dropdown-item item\" href=\"#\">\n");
      out.write("            <div class=\"media\">\n");
      out.write("                <img src=\"assets/images/soldier-green-tan.jpg\" alt=\"\" style=\"\">\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <p class=\"item-name\">Sony DSC-RX100M III</p>\n");
      out.write("                    <p class=\"mg-0\">\n");
      out.write("                        <span class=\"item-price\">15.000.000<sup>đ</sup></span>\n");
      out.write("                        <span class=\"item-quantity\">x 1</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"dropdown-item item\" href=\"#\">\n");
      out.write("            <div class=\"media\">\n");
      out.write("                <img src=\"assets/images/soldier-green-tan.jpg\" alt=\"\" style=\"\">\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <p class=\"item-name\">Sony DSC-RX100M III</p>\n");
      out.write("                    <p class=\"mg-0\">\n");
      out.write("                        <span class=\"item-price\">15.000.000<sup>đ</sup></span>\n");
      out.write("                        <span class=\"item-quantity\">x 1</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"dropdown-item item\" href=\"#\">\n");
      out.write("            <div class=\"media\">\n");
      out.write("                <img src=\"assets/images/soldier-green-tan.jpg\" alt=\"\" style=\"\">\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <p class=\"item-name\">Sony DSC-RX100M III</p>\n");
      out.write("                    <p class=\"mg-0\">\n");
      out.write("                        <span class=\"item-price\">15.000.000<sup>đ</sup></span>\n");
      out.write("                        <span class=\"item-quantity\">x 1</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"dropdown-item item\" href=\"#\">\n");
      out.write("            <div class=\"media\">\n");
      out.write("                <img src=\"assets/images/soldier-green-tan.jpg\" alt=\"\" style=\"\">\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <p class=\"item-name\">Sony DSC-RX100M III</p>\n");
      out.write("                    <p class=\"mg-0\">\n");
      out.write("                        <span class=\"item-price\">15.000.000<sup>đ</sup></span>\n");
      out.write("                        <span class=\"item-quantity\">x 1</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"dropdown-item item\" href=\"#\">\n");
      out.write("            <div class=\"media\">\n");
      out.write("                <img src=\"assets/images/soldier-green-tan.jpg\" alt=\"\" style=\"\">\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <p class=\"item-name\">Sony DSC-RX100M III V6</p>\n");
      out.write("                    <p class=\"mg-0\">\n");
      out.write("                        <span class=\"item-price\">15.000.000<sup>đ</sup></span>\n");
      out.write("                        <span class=\"item-quantity\">x 1</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"shopping-cart-footer\">\n");
      out.write("        <div class=\"text-right\">\n");
      out.write("            <p>Số sản phẩm: <strong>3</strong></p>\n");
      out.write("            <p>Tổng số tiền: <strong>21.000.000<sup>đ</sup></strong></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"text-right\">\n");
      out.write("            <a href=\"#\" class=\"btn btn-danger float-right\">Thanh toán</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write(" \n");
      out.write("                    </li>\n");
      out.write("                    <form class=\"form-inline mg-left-20\" action=\"products\" method=\"POST\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"textSearch\" class=\"form-control\" placeholder=\"Tìm kiếm\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button type=\"submit\" class=\"input-group-text\"><i class=\"fas fa-search fa-fw icon-color\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write(" \n");
      out.write("        <!-- Cover -->\n");
      out.write("        <div id=\"main-contain\" class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-7\">\n");
      out.write("                    sadasd\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    sf222222222222\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
