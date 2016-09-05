function validateForm() {
   var nm = document.forms["myform"]["name"].value;
var letters = /^[A-Za-z]+$/;
   var eFormat = /\S+@\S+\.\S+/;
   var phoneno = /^\d{10}$/;
var addrFormat = /^[a-zA-Z0-9\,\' '\-]+$/;
var bol=true;
var e = document.forms["myform"]["email"].value;
var ph = document.forms["myform"]["phonen"].value;
var addr = document.forms["myform"]["add"].value;
var gender=document.getElementsByName("gender");
var certi=document.getElementsByName("A");
   if (nm == null || nm == ""||nm.length<Number(3)) {
       alert("Name must be filled out having minimum 3 letters");
       return false;
   }
else if(!nm.match(letters)){
alert("Name can not contain  digits");
       return false;
}
else if (e == null ||!e.match(eFormat)){
       alert("enter valid mail-id please");
       return false;
   }
else if (ph == null || !ph.match(phoneno) ){
       alert("enter valid phone number please must contain 10 digits in it");
       return false;
   }
else if (addr == null ||!addr.match(addrFormat) ){
       alert("please enter address . special characters are not allowed");
       return false;
   }

else if (gender[0].checked==false && gender[1].checked==false){
       alert("please select gender");
       return false;
   }
else {
	for(var i=0;i<certi.length;i++){
		if(certi[i].checked==true)
		{
			bol=false;
			break;
		}
	}
		if(bol==true){
			alert("Please filled atleast one checkbox");
			return true;
		}
	
}
}