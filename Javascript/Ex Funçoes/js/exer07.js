
/* 07 - Considere que uma matriz contém as 5 cidades mais populosas
de 7 estados do BR. Faça um programa que;
a. leia a população de cada cidade;
b. calcule e escreva o número (índice) do município mais populoso e 
o número do estado a que pertence;
c. E considerando que a 5 coluna contenha sempre a população 
da capital do estado, calcule a média da população das capitais dos 7 estados.

*/
function criaMatriz(){
	var matrix=[];

	for (i=0; i < estados; i++) {
		matrix[i] = [];
		matrix[i][posEstado] = prompt('Informe o Estado');
		matrix[i][posCidades] = [];
	
		for (r=0; r < cidades; r++) {
			matrix[i][posCidades][r] = []
		
			if (r == posCapital) { // É a capital
				matrix[i][posCidades][r][posCidadeNome] = prompt('Informe a Capital');
				matrix[i][posCidades][r][posCidadePop] = parseInt( prompt('Informe a populacao da Capital') );
			} else {
				matrix[i][posCidades][r][posCidadeNome] = prompt('Informe a Cidade');
				matrix[i][posCidades][r][posCidadePop] = parseInt( prompt('Informe a populacao da Cidade') );
			}
		}
	}
	return matrix;
}

function mostraDadosMatrix(matrix) {
	document.write('Dados da Matrix ' + matrix + '<BR>');
	document.write('--------------------------------------------' + '<BR>');
}

function resolveQuestaoA(matrix) {
	document.write('LETRA A. A populução das cidades são' + '<BR>');
	for (i=0; i < estados; i++) {
		for (r=0; r < cidades; r++) {
			if (r == posCapital) { // É a capital
				document.write('UF ' + matrix[i][posEstado]  + ' Capital ' + matrix[i][posCidades][r][posCidadeNome] + ' Populacao ' + matrix[i][posCidades][r][posCidadePop] + '<BR>');
			} else {
				document.write('UF ' + matrix[i][posEstado]  + ' Cidade ' + matrix[i][posCidades][r][posCidadeNome] + ' Populacao ' + matrix[i][posCidades][r][posCidadePop] + '<BR>');
			}	
		}
	}
	document.write('--------------------------------------------' + '<BR>');
}

function resolveQuestaoB(matrix) {
	UF = '';
	Cidade = '';
	maiorPopCidade = 0;
	for (i=0; i < estados; i++) {
		for (r=0; r < cidades; r++) {
			if (matrix[i][posCidades][r][posCidadePop] > maiorPopCidade) {
				UF = matrix[i][posEstado];
				Cidade = matrix[i][posCidades][r][posCidadeNome]; 
				maiorPopCidade = matrix[i][posCidades][r][posCidadePop];
			}
		}	
	}
	document.write('LETRA B. Cidade e UF da cidade mais populosa' + '<BR>');
	document.write('UF ' + UF + ' Cidade ' + Cidade + ' Populacao ' + maiorPopCidade + '<BR>');
	document.write('--------------------------------------------' + '<BR>');
}

function resolveQuestaoC(matrix) {
	soma = 0;
	for (i=0; i < estados; i++) {
		soma = soma + matrix[i][posCidades][posCapital][posCidadePop];
	}
	document.write('Media de populacao das capitais ' + soma / estados + '<BR>');
}
var posEstado = 0;
var posCidades = 1;
var posCidadeNome = 0;
var posCidadePop = 1;

var estados = parseInt(prompt('Informe a quantidade de estados')); //Quantidade de Estados
var cidades = parseInt(prompt('Informe a quantidade de cidades'));; //Quantidade de Cidades
var posCapital = cidades - 1; //Posicao da Capital

matrix = criaMatriz();
mostraDadosMatrix(matrix);
resolveQuestaoA(matrix);
resolveQuestaoB(matrix);
resolveQuestaoC(matrix);

