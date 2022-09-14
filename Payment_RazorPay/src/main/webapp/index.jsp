<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<script src="https://checkout.razorpay.com/v1/checkout.js"></script>

<script type="text/javascript">
function payment()
{
	var amt = document.getElementById("amount").value;
	if(amt=="" || amt==null){
		alert("Amount Required!!!")
	}
	
	$.post("pay", {amount : amt}, function(resp){
		
		const response=JSON.parse(resp);
			
			var options = {
			    "key": "rzp_test_tlQG57afw3aL5q", // Enter the Key ID generated from the Dashboard
			    "amount": response.amount, // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
			    "currency": "INR",
			    "name": "Acme Corp",
			    "description": "Test Transaction",
			    "image": "data:image/png;base64,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",
			    "order_id": response.id, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
			    "handler": function (response){
			        console.log(response.razorpay_payment_id);
			        console.log(response.razorpay_order_id);
			        console.log(response.razorpay_signature);
			        alert("payment received!!!");
			    },
			    "prefill": {
			        "name": "",
			        "email": "",
			        "contact": ""
			    },
			};
			
			var rzp1 = new Razorpay(options);
			rzp1.on('payment.failed', function (response){
				console.log(response.error.code);
				console.log(response.error.description);
				console.log(response.error.source);
			    console.log(response.error.step);
			    console.log(response.error.reason);
			    console.log(response.error.metadata.order_id);
			    console.log(response.error.metadata.payment_id);
			    alert("payment failed!!!");
			});
			rzp1.open();
	})
}
</script>
</head>
<body>
<input type="text" name="amount" id="amount">
<button onclick="payment()">Pay</button>
</body>
</html>