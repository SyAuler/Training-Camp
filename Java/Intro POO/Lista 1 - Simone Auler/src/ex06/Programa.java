/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {
        Data dia = new Data(12,10,2015);
        
        System.out.println("Data Agora: " + dia.formatarData());
    }
}
