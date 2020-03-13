
/* 02 - Considerando o ano de nascimento de uma pessoa fornecido por ela,
faça um programa que escreva todos os  anos bissextos que esta pessoa viveu. 
Obs: para o ano N ser bissexto, N deve ser divisível por 4, 
mas não pode ser divisível por 100, E N deve ser divisível por 400.

*/
function bissexto(nasc){
	var ano=[];
	var bi=0;
	for (i=nasc; i < 2018; i++){
		cond1 = ((i % 4 == 0) && !(i % 100 == 0));
		cond2 = ((i % 100 == 0) && (i % 400 == 0));
		if ((cond1) || (cond2)) {
			ano[bi] = i;
			bi++;
		}
	}
	return ano;
}

var nasc = prompt('Informe seu ano de nascimento');

document.write('Os anos bissextos que a pessoa viveu são '+bissexto(nasc));

