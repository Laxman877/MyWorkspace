function start(){
	//alert("ok js calling")
}
function getdata(){
	var uname=document.getElementById("uname").value;
	alert(uname);
}
function unameData(val){
	var dt=document.getElementById("unameData").value;
	dt.innerHTML=val;
}
function textclick(){
	var uname=document.getElementById("uname");
	
	uname.style.backgroundColor = 'pink';
	uname.style.width="150px";
	uname.style.height="30px";
}

var  dt=new Date();
document.getElementById('date').innerHTML=dt;