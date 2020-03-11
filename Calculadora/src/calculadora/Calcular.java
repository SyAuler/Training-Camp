package calculadora;

import java.util.Arrays;

public class Calcular {

    String decimal;
    String binario;

    public String getDecBin(String decimal) {
        int valor = Integer.parseInt(decimal);
        String result = Integer.toBinaryString(valor);
        return result;
    }

    public String getDecOct(String decimal) {
        int valor = Integer.parseInt(decimal);
        String result = Integer.toOctalString(valor);
        return result;
    }

    public String getDecHex(String decimal) {
        int valor = Integer.parseInt(decimal);
        String result = Integer.toHexString(valor);
        return result;
    }

    public int getBinDec(String binario) {
        int valor = 0;
        // soma ao valor final o dígito binário da posição * 2 elevado ao contador da posição (começa em 0)
        for (int i = binario.length(); i > 0; i--) {
            valor += Integer.parseInt(binario.charAt(i - 1) + "") * Math.pow(2, (binario.length() - i));
        }
        return valor;
    }

    public int getHexDec(String valorHexa) {
        int valor = 0;
        int posicaoCaractere = -1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = valorHexa.length(); i > 0; i--) {
            posicaoCaractere = Arrays.binarySearch(hexa, valorHexa.charAt(i - 1));
            valor += posicaoCaractere * Math.pow(16, (valorHexa.length() - i));
        }
        return valor;
    }
    
    public int getOctDec(String valorOctal) {
        int valor = 0;
        for (int i = valorOctal.length(); i > 0; i--) {
            valor += Integer.parseInt(valorOctal.charAt(i - 1) + "") * Math.pow(8, (valorOctal.length() - i));
        }
        return valor;
    }
    
/*    public String getBinHex(String binario) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder valor = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;
        char caractereEncontrado = '-';

        posicaoInicial = binario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {
            posicaoInicial = ((posicaoInicial - 4) >= 0) ? posicaoInicial - 4 : 0;
            valor.insert(0, caractereEncontrado);
            posicaoFinal = posicaoInicial;
        }
        return valor.toString();
    } */

/*    public String getBinOct(String binario) {
        StringBuilder valor = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;

        posicaoInicial = binario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {
            posicaoInicial = ((posicaoInicial - 3) >= 0) ? posicaoInicial - 3 : 0;
            valor.insert(0, getBinDec(binario.substring(posicaoInicial, posicaoFinal)));
            posicaoFinal = posicaoInicial;
        }
        return valor.toString();
    } */

/*    public String getHexBin(String valorHexa) {
        int posicao = 0;
        int posicaoArrayHexa = -1;
        StringBuilder valor = new StringBuilder();
        String valorConvertidoParaBinario = null;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        while (posicao < valorHexa.length()) {
            posicaoArrayHexa = Arrays.binarySearch(hexa, valorHexa.charAt(posicao));
            valorConvertidoParaBinario = getDecBin(posicaoArrayHexa);
            if (valorConvertidoParaBinario.length() != 4 && posicao > 0) {
                for (int i = 0; i < (4 - valorConvertidoParaBinario.length()); i++) {
                    valor.append("0");
                }
            }

            valor.append(valorConvertidoParaBinario);
            posicao++;
        }
        return valor.toString();
    } */

    
/*
    public String getHexOct(String valorHexa) {
        int valorDecimal = getHexDec(valorHexa);
        Integer.toString(valorDecimal);
        return this.getDecOct(valorDecimal);
    } */

/*    public String getOctBin(String valorOctal) {
        int posicao = 0;
        StringBuilder valor = new StringBuilder();
        String valorConvertidoParaBinario = null;

        while (posicao < valorOctal.length()) {
            valorConvertidoParaBinario = getDecBin(Integer.parseInt(valorOctal.charAt(posicao) + ""));
            if (valorConvertidoParaBinario.length() != 3 && posicao > 0) {
                for (int i = 0; i < (3 - valorConvertidoParaBinario.length()); i++) {
                    valor.append("0");
                }
            }
            valor.append(valorConvertidoParaBinario);
            posicao++;
        }
        return valor.toString();
    } */

    

/*    public String getOctHex(String valorOctal) {
        int valorDecimal = getOctDec(valorOctal);
        Integer.toString(valorDecimal);
        return getDecHex(valorDecimal);
    } */
}
