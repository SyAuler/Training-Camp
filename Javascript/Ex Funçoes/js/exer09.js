
/* 09 - Escreva um programa que exclui um componente de ordem dada de um vetor dado,
criando um novo vetor. Por exemplo, se o vetor dado for v = {2,5,7,10,12,13}
e o componente a ser deletado for a de ordem 4, o script deve
fornecer o vetor u = {2,5,7,12,13}

*/
function novoVetor(num,pos){
	num2=[];
	cont=0;
	for (i=0; i < 6; i++){
		if (pos != i) { //quando for igual a posição informada, não inclui no 2º vetor
			num2[cont] = num[i];
			cont++;
		}
	}
	return num2;
}

var num=[];
for (i=0; i < 6; i++){
	num[i] = parseInt( prompt('Informe 6 números') );
}

while (true) {
	posicao = parseInt(prompt('Informe a posição a ser excluida'));
	if ((posicao > 0) && (posicao <= 6)) {break;} 
}

document.write('Os valores informados sao '+num+'<br>');
document.write('Os novos valores sao '+novoVetor(num, posicao));

