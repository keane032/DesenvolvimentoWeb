$(document).ready(function(){
	$('#ajax_form').submit(function(event){
		var dados = jQuery( this ).serialize();

		$.ajax({
			type: "POST",
			url: "adiciona",
			data: dados,
			success: function()
			{
				location.reload();
			}
		});
		event.preventDefault()
		
	});
});

