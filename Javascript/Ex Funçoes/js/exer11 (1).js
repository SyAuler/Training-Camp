
/* 11 - Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. 
Calcule e mostre o vetor resultante apresentando a diferença entre X e Y
(todos os elementos de x que não existam em Y, sem repetições).

*/

qde = 10;

function SeNaoTem(vet3, valor, cont) { // valor é igual ao vet1[i] e o vet2[i]
	retorno = true;
	for (r=0; r < cont; r++){
		if (vet3[r] == valor) {
			retorno = false;
			break;
		}
	}
	return retorno;
}

function calcDiferenca(vet1, vet2){
	vet3=[];
	cont=0;
	for (i = 0; i < qde; i++){
		achou = false;
		for (r = 0; r < qde; r++){
			if (vet1[i] == vet2[r]) {
				achou = true;
				break;
			}
		}
		if ((achou == false) && (SeNaoTem(vet3, vet1[i], cont))) {
			vet3[cont] = vet1[i];
			cont++;
		}
	}
	for (i = 0; i < qde; i++){
		achou = false;
		for (r = 0; r < qde; r++){
			if (vet2[i] == vet1[r]) {
				achou = true;
				break;
			}
		}
		if ((achou == false) && (SeNaoTem(vet3, vet2[i], cont))) {
			vet3[cont] = vet2[i];
			cont++;
		}
	}
	return vet3;
}

vet1=[];
vet2=[];

for (i = 0; i < qde; i++){
	vet1[i] = parseInt(prompt('Informe 10 números para o conjunto A'));
}

for (i = 0; i < qde; i++){
	vet2[i] = parseInt(prompt('Informe mais 10 números para o conjunto B'));
}

document.write(vet1+'<br>');
document.write(vet2+'<br>');
document.write('A diferenca e: ' + calcDiferenca(vet1,vet2));
