<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.get("country",{},function(rt){
		$("#countrydata").html(rt);
	})
})
$("#btn").click(function(){
	var uname=$("#uname").val();
		$.get("data",{uname:unames},function(rt){
			alert(rt);
		})
})
function getstate(val) {
	$.get("state",{val},function(rt){
		//alert("ok");
		$("#statedata").html(rt);
	})
}
function getProduct(val) {
	$.get('product',{val},function(rt){
		$("#productlist").html(rt);
	})
}
</script>
</head>
<body>
	<input type="text" id="uname">
	<button id="btn">Send</button>
	
	<select id="countrydata" onchange="getstate(value)">
	<option value="">---Select Country---</option>
	</select>
	<select id="statedata">
	<option value="">---Select State--</option>
	</select>
	<input type="text" placeholder="Search Product" id="product" onkeyup="getProduct(value)">
	<div id="productlist"></div>
</body>
</html>