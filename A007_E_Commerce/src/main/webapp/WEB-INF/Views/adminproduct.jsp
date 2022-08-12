<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Admin | Product</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style1.css" rel="stylesheet">
</head>

<body>
    <div class="container-xxl position-relative bg-white d-flex p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>
        <!-- Spinner End -->


        <!-- Sidebar Start -->
        <div class="sidebar pe-4 pb-3">
           <jsp:include page="sidebar.jsp"></jsp:include>
        </div>
        <!-- Sidebar End -->


        <!-- Content Start -->
        <jsp:include page="adminheader.jsp"></jsp:include>
            <!-- Navbar End -->


           <section class="why_section layout_padding">
         <div class="container">
         
            <div class="row">
               <div class="col-lg-6 offset-lg-2">
                  <div class="full">
                  <h3 class="text-info">Product Add Here</h3>
                     <form:form class="form-horizontal form-material" modelAttribute="product" action="addProduct" method="post" enctype="multipart/form-data">
                           <form:hidden path="productId"/>
                             <div class="form-group mb-4">
                                        <label class="col-sm-12">Select Category</label>
                                        <div class="col-sm-12 border-bottom">
                                            <select class="form-select shadow-none p-0 border-0 form-control-line" name="catid">
                                                <c:forEach var="dt" items="${categories}">
                                                <option value="${dt.getCatId()}">${dt.getCat_name()}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="col-sm-12 border-bottom">
                                           <form:label path="productName" class="col-sm-12">Product Name</form:label>
                                           <div class="col-md-12 border-bottom p-0">
                                        	<form:input path="productName" class="form-select shadow-none p-0 form-control-line"/>
											</div>
                                        </div>
                                         <div class="col-sm-12 border-bottom">
                                           <form:label path="price" class="col-sm-12">Price</form:label>
                                            <div class="col-md-12 border-bottom p-0">
												<form:input path="price" class="form-select shadow-none p-0 form-control-line"/>
											</div>
                                        </div>
                                         <div class="col-sm-12 border-bottom">
                                           <form:label path="company" class="col-sm-12">Company</form:label>
                                            <div class="col-md-12 border-bottom p-0">
                                        	<form:input path="company" class="form-select shadow-none p-0 form-control-line"/>
                                       		</div>
                                        </div>
                                         <div class="col-sm-12 border-bottom">
                                           <form:label path="qty" class="col-sm-12">Quantity</form:label>
                                            <div class="col-md-12 border-bottom p-0">
                                        	<form:input path="qty" class="form-select shadow-none p-0 form-control-line"/>
                                       		</div>
                                        </div>
                                         <div class="col-sm-12 border-bottom">
                                          <label class="col-sm-12">Product Image</label>
                                         <div class="col-md-12 border-bottom p-0">
                                          <input type="file" class="form-select shadow-none p-0 form-control-line" name="file">
                                         </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group mb-4">
                                        <div class="col-sm-12">
                                            <button class="btn btn-success" type="submit">Add Product</button>
                                        </div>
                                    </div>
                            </form:form>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <div class="container-fluid pt-4 px-4">
                <div class="row g-4">
                    <div class="col-12">
                        <div class="bg-light rounded h-100 p-4">
                            <h6 class="mb-4">Product Table</h6>
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Id</th>
                                            <th scope="col">Product Name</th>
                                            <th scope="col">Price</th>
                                            <th scope="col">Company</th>
                                            <th scope="col">Quantity</th>
                                            <th scope="col">Product Image</th>
                                            <th scope="col">Category Name</th>
                                            <th scope="col" colspan="2">Action</th>
                                           
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="dt" items="${products}">
                                    <tr>
                                            <td>${dt.getProductId()}</td>
                                            <td>${dt.getProductName()}</td>
                                            <td>${dt.getPrice()}</td>
                                            <td>${dt.getCompany()}</td>
                                            <td>${dt.getQty()}</td>
                                            <td>${dt.getImage()}</td>
                                            <td>${dt.getCategory().getCat_name()}</td>
                                            <td><a href="updateProduct?uid=${dt.getProductId()}" class="btn btn-primary">Update</a></td>
                                            <td><a href="deleteProduct?uid=${dt.getProductId()}" class="btn btn-danger">Delete</a></td>
                                        </tr>
                                    </c:forEach>   
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Form End -->
            
        </div>
        <!-- Content End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/chart/chart.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/tempusdominus/js/moment.min.js"></script>
    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>