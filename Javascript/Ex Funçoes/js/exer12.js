
/* 12 - Faça um programa que preencha um vetor com 5 números inteiros, 
calcule e mostre o vetor resultante de uma ordenação crescente.

*/

function vetorOrdenado(vet){
	while (true) {
		trocou = false; // fazer novo ciclo do for
		for (i=0; i < 4; i++){ //o ultimo numero não precisa analisar pq já é o maior
			if (vet[i] > vet[i+1]){
				var aux = vet[i];
				vet[i] = vet[i+1];
				vet[i+1] = aux;
				trocou = true;
			}
		}
		if (trocou == false) {break;} //não trocou as posições, esta ordenado e pode sair
	}
	return vet; 
}

vet=[];
for (i = 0; i < 5; i++){
	vet[i] = parseInt(prompt('Informe 5 números para o conjunto A'));
}

document.write(vet+'<br>');
document.write(vetorOrdenado(vet));

