/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-06 04:16:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shoes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <!-- basic -->\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("      <!-- mobile metas -->\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("      <!-- site metas -->\r\n");
      out.write("      <title>Shoes</title>\r\n");
      out.write("      <meta name=\"keywords\" content=\"\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <meta name=\"author\" content=\"\">\r\n");
      out.write("      <!-- bootstrap css -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("      <!-- style css -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("      <!-- Responsive-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("      <!-- fevicon -->\r\n");
      out.write("      <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\r\n");
      out.write("      <!-- Scrollbar Custom CSS -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("      <!-- Tweaks for older IEs-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\r\n");
      out.write("      <!-- owl stylesheets --> \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\r\n");
      out.write("      <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\r\n");
      out.write("   </head>\r\n");
      out.write("   <!-- body -->\r\n");
      out.write("   <body class=\"main-layout\">\r\n");
      out.write("	<!-- header section start -->\r\n");
      out.write("	<div class=\"header_section header_main\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- New Arrivals section start -->\r\n");
      out.write("  <div class=\"collection_text\">Shoes</div>\r\n");
      out.write("    <div class=\"collection_section layout_padding\">\r\n");
      out.write("    	<div class=\"container\">\r\n");
      out.write("    		<h1 class=\"new_text\"><strong>New Arrivals Products</strong></h1>\r\n");
      out.write("    	    <p class=\"consectetur_text\">consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation</p>\r\n");
      out.write("    	</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layout_padding gallery_section\">\r\n");
      out.write("    	<div class=\"container\">\r\n");
      out.write("    		<div class=\"row\">\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Best Shoes </p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img4.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">60</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Best Shoes </p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img5.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">400</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Best Shoes </p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img6.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">50</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		<div class=\"row\">\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Sports Shoes</p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img7.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">70</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Sports Shoes</p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img8.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">100</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"col-sm-4\">\r\n");
      out.write("    				<div class=\"best_shoes\">\r\n");
      out.write("    					<p class=\"best_text\">Sports Shoes</p>\r\n");
      out.write("    					<div class=\"shoes_icon\"><img src=\"images/shoes-img9.png\"></div>\r\n");
      out.write("    					<div class=\"star_text\">\r\n");
      out.write("    						<div class=\"left_part\">\r\n");
      out.write("    							<ul>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    						<li><a href=\"#\"><img src=\"images/star-icon.png\"></a></li>\r\n");
      out.write("    	    					</ul>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"right_part\">\r\n");
      out.write("    							<div class=\"shoes_price\">$ <span style=\"color: #ff4e5b;\">90</span></div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		<div class=\"buy_now_bt\">\r\n");
      out.write("    			<button class=\"buy_text\">Buy Now</button>\r\n");
      out.write("    		</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    </div>\r\n");
      out.write("   	<!-- New Arrivals section end -->\r\n");
      out.write("	<!-- section footer start -->\r\n");
      out.write("    <div class=\"section_footer\">\r\n");
      out.write("    	<div class=\"container\">\r\n");
      out.write("    		<div class=\"mail_section\">\r\n");
      out.write("    			<div class=\"row\">\r\n");
      out.write("    				<div class=\"col-sm-6 col-lg-2\">\r\n");
      out.write("    					<div><a href=\"#\"><img src=\"images/footer-logo.png\"></a></div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"col-sm-6 col-lg-2\">\r\n");
      out.write("    					<div class=\"footer-logo\"><img src=\"images/phone-icon.png\"><span class=\"map_text\">(71) 1234567890</span></div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("    					<div class=\"footer-logo\"><img src=\"images/email-icon.png\"><span class=\"map_text\">Demo@gmail.com</span></div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("    					<div class=\"social_icon\">\r\n");
      out.write("    						<ul>\r\n");
      out.write("    							<li><a href=\"#\"><img src=\"images/fb-icon.png\"></a></li>\r\n");
      out.write("    							<li><a href=\"#\"><img src=\"images/twitter-icon.png\"></a></li>\r\n");
      out.write("    							<li><a href=\"#\"><img src=\"images/in-icon.png\"></a></li>\r\n");
      out.write("    							<li><a href=\"#\"><img src=\"images/google-icon.png\"></a></li>\r\n");
      out.write("    						</ul>\r\n");
      out.write("    					</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"col-sm-2\"></div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    	    </div> \r\n");
      out.write("    	    <div class=\"footer_section_2\">\r\n");
      out.write("		        <div class=\"row\">\r\n");
      out.write("    		        <div class=\"col-sm-4 col-lg-2\">\r\n");
      out.write("    		        	<p class=\"dummy_text\"> ipsum dolor sit amet, consectetur ipsum dolor sit amet, consectetur  ipsum dolor sit amet,</p>\r\n");
      out.write("    		        </div>\r\n");
      out.write("    		        <div class=\"col-sm-4 col-lg-2\">\r\n");
      out.write("    		        	<h2 class=\"shop_text\">Address </h2>\r\n");
      out.write("    		        	<div class=\"image-icon\"><img src=\"images/map-icon.png\"><span class=\"pet_text\">No 40 Baria Sreet 15/2 NewYork City, NY, United States.</span></div>\r\n");
      out.write("    		        </div>\r\n");
      out.write("    		        <div class=\"col-sm-4 col-md-6 col-lg-3\">\r\n");
      out.write("    				    <h2 class=\"shop_text\">Our Company </h2>\r\n");
      out.write("    				    <div class=\"delivery_text\">\r\n");
      out.write("    				    	<ul>\r\n");
      out.write("    				    		<li>Delivery</li>\r\n");
      out.write("    				    		<li>Legal Notice</li>\r\n");
      out.write("    				    		<li>About us</li>\r\n");
      out.write("    				    		<li>Secure payment</li>\r\n");
      out.write("    				    		<li>Contact us</li>\r\n");
      out.write("    				    	</ul>\r\n");
      out.write("    				    </div>\r\n");
      out.write("    		        </div>\r\n");
      out.write("    			<div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("    				<h2 class=\"adderess_text\">Products</h2>\r\n");
      out.write("    				<div class=\"delivery_text\">\r\n");
      out.write("    				    	<ul>\r\n");
      out.write("    				    		<li>Prices drop</li>\r\n");
      out.write("    				    		<li>New products</li>\r\n");
      out.write("    				    		<li>Best sales</li>\r\n");
      out.write("    				    		<li>Contact us</li>\r\n");
      out.write("    				    		<li>Sitemap</li>\r\n");
      out.write("    				    	</ul>\r\n");
      out.write("    				    </div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class=\"col-sm-6 col-lg-2\">\r\n");
      out.write("    				<h2 class=\"adderess_text\">Newsletter</h2>\r\n");
      out.write("    				<div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"enter_email\" placeholder=\"Enter Your email\" name=\"Name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button class=\"subscribr_bt\">Subscribe</button>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    	        </div> \r\n");
      out.write("	        </div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    </div>\r\n");
      out.write("	<!-- section footer end -->\r\n");
      out.write("	<div class=\"copyright\">2019 All Rights Reserved. <a href=\"https://html.design\">Free html  Templates</a></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Javascript files-->\r\n");
      out.write("      <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("      <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("      <script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("      <script src=\"js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("      <script src=\"js/plugin.js\"></script>\r\n");
      out.write("      <!-- sidebar -->\r\n");
      out.write("      <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("      <script src=\"js/custom.js\"></script>\r\n");
      out.write("      <!-- javascript --> \r\n");
      out.write("      <script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("      <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("         $(document).ready(function(){\r\n");
      out.write("         $(\".fancybox\").fancybox({\r\n");
      out.write("         openEffect: \"none\",\r\n");
      out.write("         closeEffect: \"none\"\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("$('#myCarousel').carousel({\r\n");
      out.write("            interval: false\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //scroll slides on swipe for touch enabled devices\r\n");
      out.write("\r\n");
      out.write("        $(\"#myCarousel\").on(\"touchstart\", function(event){\r\n");
      out.write("\r\n");
      out.write("            var yClick = event.originalEvent.touches[0].pageY;\r\n");
      out.write("            $(this).one(\"touchmove\", function(event){\r\n");
      out.write("\r\n");
      out.write("                var yMove = event.originalEvent.touches[0].pageY;\r\n");
      out.write("                if( Math.floor(yClick - yMove) > 1 ){\r\n");
      out.write("                    $(\".carousel\").carousel('next');\r\n");
      out.write("                }\r\n");
      out.write("                else if( Math.floor(yClick - yMove) < -1 ){\r\n");
      out.write("                    $(\".carousel\").carousel('prev');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            $(\".carousel\").on(\"touchend\", function(){\r\n");
      out.write("                $(this).off(\"touchmove\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("      </script> \r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
