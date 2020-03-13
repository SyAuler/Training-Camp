
/* 08 - Escreva um programa que lê um vetor de inteiros e decompõe em dois
outros vetores; um contendo os componentes de ordem ímpar e o outro
contendo os componentes de ordem par. Ex: se o vetor dado for 
v = {3,5,6,8,1,4,2,3,7}, o script deve gerar os vetores 
u ={3,6,1,2,7} e w = {5,8,4,3}.
*/

function separaVetor(num) {
	cont1 = 0;
	cont2 = 0;
	vet1=[];
	vet2=[];
	for (i=0; i < 9; i++){
		if (i % 2 == 0) {
			vet1[cont1] = num[i];
			cont1++;
		} else {
			vet2[cont2] = num[i];
			cont2++;
		}
	}
	document.write('vetor UM ' + vet1 + '<BR>');
	document.write('vetor DOIS ' + vet2);
}

var num=[];
for (i=0; i < 9; i++){
	num[i] = parseInt(prompt('Informe 9 números. '+i+' de 9'));
}

document.write('Os números são ' + num + '<br>');
separaVetor(num);

