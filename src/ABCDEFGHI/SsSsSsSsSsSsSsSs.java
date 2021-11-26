/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
public class SsSsSsSsSsSsSsSs {
    public static void main(String args []) throws ParseException{
        
        //Manejo de Fechas
        Date fecha;
        
        //Instancion de Fechas
        //Momento actual
        //fecha = new Date();
       // System.out.println(fecha);
        
        //Un punto en el tiempo
        //tres formas
        
        //primera
        //fecha = new Date(111,0,10);
        //System.out.println(fecha);
        
        //Segunda
        //Calendar c = new GregorianCalendar(2021,11,20);
        //fecha = c.getTime();
       // System.out.println(fecha);
        
        //Tercera
        //fecha = new Date(5000000);
        //System.out.println(fecha);
        
        //Forma Extra
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        fecha=sd.parse("2021/11/9");
        System.out.println(fecha);
        
        
        ArrayList<Date> misFecha = new ArrayList();
        //SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        int opcion = 0;
        while(opcion != 3){
            
        }
        
    }
    
    
}
