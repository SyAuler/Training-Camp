
/* 13 - Faça um programa que receba um anúncio qualquer e uma palavra para ser 
localizada e:
a. converta a string para array;
b. informe quantas ocorrências da palavra informada existem no anúncio;
c. substitua a primeira ocorrência da palavra indicada para 'teste'.
d. retorne o anúncio após a modificação.

*/
function array(frase){
	divide = frase.split( );
	return divide;
}

function ocorrencia(palavra) {
	ocorre = palavra.length;
	return ocorre;
}

function troca(){
	trocarPalavra = frase.replace(palavra, 'teste');
	return trocarPalavra;
}

frase = prompt('Informe uma frase');
palavra = prompt('Informe uma palavra usada na frase ');


document.write('A frase é: '+frase+'<br>');
document.write('A palavra é: '+palavra+'<br>');
document.write('O array é: '+array(frase)+'<br>');
document.write('A nova frase é: '+troca());
