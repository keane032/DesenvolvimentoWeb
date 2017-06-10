n1.oninput =  function (){
    var n1 = parseInt(document.getElementById('n1').value, 10);
    var n2 = parseInt(document.getElementById('n2').value, 10);
    document.getElementById('resultado').innerHTML = n1 * n2;   
} 
n2.oninput =  function (){
    var n1 = parseInt(document.getElementById('n1').value, 10);
    var n2 = parseInt(document.getElementById('n2').value, 10);
    document.getElementById('resultado').innerHTML = n1 * n2;   
} 


function atu(event){

        var eixoY = window.event.clientY;
		var eixoX = window.event.clientX;
		
		var elemento = document.querySelector("#mouse");

		elemento.setAttribute("style","position: relative");

		elemento.style.top = (eixoY) +"px";
		elemento.style.left = (eixoX) + "px";


}

function nivel(){

	var altura = document.querySelector('#a');
	var massa =  document.querySelector('#m');
	
	var imc = massa.value/(altura.value*altura.value);	

	

	 if(imc < 16){
		document.getElementById('x').innerHTML = 'Magreza grave'+imc;
	}else if( imc < 17 && imc > 16){
		document.getElementById('x').innerHTML = 'Magreza moderada'+imc;
	}else if( imc > 17 && imc < 18){
		 document.getElementById('x').innerHTML = 'Magreza leve'+imc;
	}else if(18 < imc && imc< 25){
		 document.getElementById('x').innerHTML = 'Saudável'+imc;
	}else if (25 < imc && imc < 30){
		 document.getElementById('x').innerHTML = 'Sobrepeso'+imc;
	}else if (30 < imc && imc < 35){
		 document.getElementById('x').innerHTML = 'Obesidade Grau I'+imc;
	}else if (35 < imc && imc < 40){
		 document.getElementById('x').innerHTML = 'Obesidade Grau II'+imc;
	}else if ( imc > 40){
		 document.getElementById('x').innerHTML = 'Obesidade Grau III'+imc;
	}

}
































