
/* 06 - Dizemos que uma matriz quadrada inteira é um quadrado mágico
se a soma dos elementos de cada linha;
a soma dos elementos de cada coluna;
e a soma dos elementos das diagonais principal e secundária são todas iguais.
Faça um programas que leia uma matriz com 3 linhas e 3 colunas e 
escreva se esta é um quadrado mágico ou não.
ex: 8-0-7 / 4-5-6 / 3-10-2
*/
function criaMatriz(){
	var matriz=[];
	
	for (i=0; i < 3; i++){
		matriz[i] = [];
		for (j=0; j < 3; j++){
			matriz[i][j] = parseInt(prompt('Informe um número '+i+' '+j));
		}
	
	}
	
	return matriz;
}
function quadradoMagico(matriz){
	linha1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
	linha2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
	linha3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
	
	coluna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
	coluna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
	coluna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
	
	diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
	diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
	
	retorno  = (linha1 == linha2) 
		&& (linha1 == linha3) 
		&& (coluna1 == coluna2) 
		&& (coluna1 == coluna3) 
		&& (diagonal1 == diagonal2)
		&& (linha1 == coluna1)
		&& (linha1 == diagonal1);
	
	return retorno;
}

var matriz = criaMatriz();

document.write(matriz+'<br>');
if (quadradoMagico(matriz) == true){
	document.write('É um quadrado mágico');
} else {
	document.write('Não é um quadrado Magico');
}

