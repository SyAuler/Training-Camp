package ex06;

import java.text.DateFormat;
import java.util.Date;

public class Data {

    int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
  
    public String formatarData() {
        return String.format("%02d/%02d/%02d", this.dia, this.mes, this.ano);
	
    }
}
