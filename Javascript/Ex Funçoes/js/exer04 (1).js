
/* 04 - WHILE Faça um programa que escreva os valores menores que um 
número N, informado pelo usuário, que sejam ímpares e cuja divisão
por 11 tenha resto 5.
*/
function impares(num){
	i = 0;
	array=[];
	cont =0;
	while (i < num){
		if ((i % 2 == 1) && (i % 11 == 5)){
			array[cont]=i;
			cont++;
		}
		i++
	}
	return array;
}

num = prompt('Informe um número');

document.write('Os números ímpares e cuja divisão por 11 tem resto 5 são <br><br> '+impares(num));

