
/* 10 - Faça um programa que preencha dois vetores, X e Y, com 5 números inteiros 
cada. Calcule e mostre um vetor resultante da união de X com Y (todos os elementos
de x e de y sem repetições). 

*/

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
function calcUniao(vet1, vet2){
	vet3=[];
	cont=0;
	for (i=0; i < 5; i++){
		if (SeNaoTem(vet3, vet1[i], cont)) {
			vet3[cont] = vet1[i];
			cont++;
		}
		if (SeNaoTem(vet3, vet2[i], cont)) {
			vet3[cont] = vet2[i];
			cont++;
		}
	}
	return vet3;
}
vet1=[];
vet2=[];
for (i = 0; i < 5; i++){
	vet1[i] = parseInt(prompt('Informe 5 números para o conjunto A'));
}
for (i = 0; i < 5; i++){
	vet2[i] = parseInt(prompt('Informe 5 números para o conjunto B'));
}
document.write(vet1+'<br>');
document.write(vet2+'<br><br>');
document.write(calcUniao(vet1,vet2));

