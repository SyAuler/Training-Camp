/*Faça um algoritmo que receba 3 números e os imprima em ordem crescente.
*/
function crescente(num){
	aux=0;
	trocou=true;
	while (trocou){
		trocou=false;
		for (i=0; i < 2; i++){
			if (num[i] > num[i+1]){
				aux = num[i];
				num[i] = num[i+1];
				num[i+1] = aux;
				trocou = true;
			}
		}
	}
	return num;
}

	var num=[];
	for (i=0; i < 3; i++){
		num[i] = parseInt( prompt('Informe 3 números'));
	}
	document.write('A ordem crescente é '+crescente(num));
