function validate(){
   
	var validaciones=0;
	var a,b=0,c=0;
	var mensaje="";
	for(var i=0; i< $("input").length; i++){
		if($("input")[i].checkValidity()==false){
			validaciones++;
			mensaje+= $("input")[i].validationMessage+" en el recuadro"+(i+1)+"\n";
				
		}
	}
	
	$("#alerta").text(mensaje)
	
	
	if(validaciones==0){
		
		a=$("input")[0].value;
		if($("input")[1].value!="" && $("input")[1].value!=null){
			b=$("input")[1].value;	
		}
		if($("input")[2].value!="" && $("input")[2].value!=null){
			c=$("input")[2].value;	
		}
		alert(b)
		$.ajax({url: "Servlet", async: true,  data:{
	        	a: a,
	        	b: b,
	        	c: c
	        }, success: function(result){
	            alert(result);
	        }});
	}
}