function carrito(id){
	var imagen=$('img').eq(id).attr("src");
	var price = $("#price"+id).text();
	
		$.get("Controlador", 
				{ imagen: imagen, 
				price:price 
				},
				function(data, status){
			        alert("Data: " + data + "\nStatus: " + status);}
		);	
}

function carrito_update(){
	$("#contenedor1").html("");
	$("#contenedor2").html("");
	
	$.get("Get_Cookie", function(data){
		
		if(data=="No hay nada en el carrito"){
			$("#contenedor1").html("<h1>"+data+"</h1><br/>" +
					"<button type=\"button\" class=\"btn btn-danger\" onclick=\"window.location.reload()\">Regresar</button>");
			
		}
		
		else{
			$("#contenedor1").html(data
					+"<br/><button type=\"button\" class=\"btn btn-danger\" onclick=\"window.location.reload()\">Regresar</button>");
		}
		
		
	});
	
	
}