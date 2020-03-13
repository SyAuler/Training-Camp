/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;



public class ConverterData extends Converter{
        
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    //objeto para a tela
    @Override
    public Object convertForward(Object value) {
        Calendar c = (Calendar) value;
        return sdf.format(c.getTime());
        
    }
    
    // tela objeto 
    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        Calendar c= Calendar.getInstance();
        try{
            c.setTime(sdf.parse(str));
            return c;
        }catch(Exception e){
            return null;
        }
                
    }
    
    public java.sql.Date converterDataParaDateUS(Date pData) throws Exception{
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy/MM/dd");
        String dataString = formatarDate.format(pData);
        if (pData == null || pData.equals("")){
            return null;
        }
        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            date = new java.sql.Date( ((java.util.Date)formatter.parse(dataString)).getTime());
        } catch (ParseException e){
            throw e;
        }
        return date;
    }
    
}
