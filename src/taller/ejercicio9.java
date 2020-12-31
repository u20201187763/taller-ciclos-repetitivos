/*9.Una compañía ha tenido un excelente año y desea premiar a sus empleados con un aumento de salarios. 
Los sueldos deben ajustarse a la siguiente forma:
Sueldo actual	           Aumento
Hasta $9,000	            20 %
$9,001 - $13,000	    17 %
$13,001 - $ 18,000	    12 %
Sobre $18,000	            6 %
La compañía tiene 50 empleados. Diseñe un algoritmo en diagrama de flujo que lea el nombre de cada empleado y su sueldo actual, 
y que imprima el nombre, el sueldo actual y el sueldo aumentado. 
Al final de la lista debe proporcionar también, el monto total de la nómina actual 
y el monto total de la nueva nómina que incluye los aumentos mencionados.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS  COD:20201187763
 */
public class ejercicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nombre;
        int i=1;
        double sueldo_actual, sueldo_aumentado = 0, aumento, sueldo_actual_t = 0, sueldo_aumentado_t = 0;
        while(i<=50){
            System.out.println("digite el nombre del empleado N° "+i);
            nombre=entrada.next();
            System.out.println("digite el sueldo actual: ");
            sueldo_actual=entrada.nextFloat();
            if(sueldo_actual<=9000){
                aumento=(sueldo_actual*0.20);
                sueldo_aumentado=sueldo_actual+aumento;
            }else if (sueldo_actual>9001 && sueldo_actual<=13000){
                aumento=(sueldo_actual*0.17);
                sueldo_aumentado=sueldo_actual+aumento;
            }else if (sueldo_actual>13001 && sueldo_actual<=18000){
                aumento=(sueldo_actual*0.12);
                sueldo_aumentado=sueldo_actual+aumento;
            }else if(sueldo_actual>18000){
                aumento=(sueldo_actual*0.06);
                sueldo_aumentado=sueldo_actual+aumento;
            }
            System.out.println("NOMBRE: "+nombre+" SUELDO ACTUAL: "+sueldo_actual+" SUELDO AUMENTADO: "+sueldo_aumentado);
            sueldo_actual_t=sueldo_actual_t+sueldo_actual;
            sueldo_aumentado_t=sueldo_aumentado_t+sueldo_aumentado;
            i++;
        }
        System.out.println("MONTON TOTAL SUELDO ACTUAL: "+sueldo_actual_t);
        System.out.println("MONTON TOTAL SUELDO AUMENTO: "+sueldo_aumentado_t);
    }
    
}
