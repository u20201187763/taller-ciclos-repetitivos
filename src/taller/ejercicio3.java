/*3.El sistema meteorológico local requiere un sistema para capturar la temperatura promedio de cada día de la semana
e imprimir el nombre del día y un mensaje de la percepción de la temperatura de acuerdo con el valor capturado según la siguiente 
tabla:
  Temperatura	          Mensaje
Menor o igual que cero	 Congelante
1 a 10°C	         Muy frío
11 a 20°C	         Frío
21 a 24°C	         Templado
25 a 29°C	         Agradable
30 a 35°C	         Caliente
36°C o más	         Muy caliente
*/
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS  COD:20201187763
 */
public class ejercicio3 {
    public static void main(String[] args){
        Scanner entrada=new Scanner (System.in);
        String dia, mensaje;
        int temperatura, i=1; 
        while(i<=7){
            System.out.println("digite el nombre del dia: ");
            dia=entrada.next();
            System.out.println("digite la temperatura del dia: ");
            temperatura=entrada.nextInt();
            if(temperatura<=0){
               mensaje="congelante" ;
            }else if (temperatura>=1 && temperatura<=10){
                mensaje="muy frio";
            }else if (temperatura>=11 && temperatura<=20){
                mensaje="frio";
            }else if (temperatura>=21 && temperatura<=24){
                mensaje="templado";
            }else if (temperatura>=25 && temperatura<=29){
                mensaje="agradable";
            }else if (temperatura>=30 && temperatura<=35){
                mensaje="caliente";
            }else{
                mensaje="muy caliente";
            }
            System.out.println("el dia de hoy es: "+dia+" percepcion de la temperatura: "+mensaje);
            i++;
        }
    }
}
