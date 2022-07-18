
function mydate(){
	var val=document.getElementById("date");
	var dt=new Date();
	val.innerHTML=dt;
}


setInterval(mydate(),1000);