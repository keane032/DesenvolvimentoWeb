$("#adicionar").click(function () {
	
	$.post({
	
		
		   url: "Lista7/home",
		   data: $('#tarefa').value,
		   success: function(){
		     alert('Adicionado');
		   }
	
		});
	
	
});

