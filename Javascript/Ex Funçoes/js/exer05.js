
/* 05 - Faça um algoritmo que calcule e escreva a média aritmética
dos números pares compreendidos no intervalo [13,73]

*/
function conta(){
	var i = 0;
	var total = 0;
	var soma = 0;
	pares=[];
	
	for (i = 13; i < 73; i++){
		if ( i % 2 == 0) {
			pares[total]= i;
			total++;
		}
	}
	
	for (i = 0; i < total; i++) {
		soma = (soma + pares[i]);
	}
	document.write('Os números pares são '+pares+'<br>');
	return soma / total;
}

document.write('A media aritmética é '+ conta());
