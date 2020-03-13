
/* 03 - CASE Escreva um programa que leia um peso na Terra e 
o número de um planeta e retorne o valor do seu peso neste planeta.
A relação de planetas é dada a seguir, juntamente com o valor 
das gravidades relativas à Terra.
Ref = Gravidade = Planeta
1 = 0,37 = Mercúrio
2 = 0,88 = Vênus
3 = 0,38 = Marte
4 = 2,64 = Jupiter
5 = 1,15 = Saturno
6 = 1,17 = Urano
Para calcular o peso no planeta use a fórmula:
Pplaneta = PTerra / 10 * gravidade

*/
function pesoCalculado(pesoTerra, numeroPlaneta) {

	switch (numeroPlaneta) {
		case 1:
			gravidade = 0.37;
			planeta = 'Mercurio';
			break;
		case 2:
			gravidade = 0.88;
			planeta = 'Venus';
			break;
		case 3:
			gravidade = 0.38;
			planeta = 'Marte';
			break;
		case 4:
			gravidade = 2.64;
			planeta = 'Jupiter';
			break;
		case 5:
			gravidade = 1.15;
			planeta = 'Saturno';
			break;
		case 6:
			gravidade = 1.17;
			planeta = 'Urano';
			break;
		default:
			document.write("Valor não reconhecido");
			break;
		}
	document.write('O planeta é '+planeta+'<br>');	
	return pesoTerra / 10 * gravidade;
}

pesoTerra = parseInt( prompt('Digite um peso do Planeta') );
numeroPlaneta = parseInt( prompt('Digite o numero do planeta - De 1 até 6') );

document.write('O peso do planeta é '+pesoCalculado(pesoTerra, numeroPlaneta).toFixed(2));

