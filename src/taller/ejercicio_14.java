/*14.Elabore un algoritmo que lea los siguientes datos para N vendedores: 
No. De vendedor, Venta, Zona de venta. Imprima la comisión para cada vendedor de acuerdo con la siguiente tabla:

Zona de Venta	    Comisión
Norte	            20 %
Sur	            18 %
Oriente	            17 %
Poniente	    21 %
Centro	            15 %
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class ejercicio_14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nombre;
        double venta=0, comision=0;
        int zona, num_vendedores = 0, i=1;
        System.out.println("digite el numero  de vendedores");
        num_vendedores=entrada.nextInt();
        while(i<=num_vendedores){
            System.out.println("digite el nombre del vendedor No°: "+i);
            nombre=entrada.next();
            System.out.println("digite el valor de venta: ");
            venta=entrada.nextDouble();
            System.out.println("selecciona la zona: ");
            System.out.println("1. norte ");
            System.out.println("2. sur ");
            System.out.println("3.oriente ");
            System.out.println("4. poniente ");
            System.out.println("5. centro ");
            zona=entrada.nextInt();
            switch(zona){
                case 1:
                    comision=venta*0.20;
                    System.out.println("el vendedor: "+nombre+" tiene una comsion del 20%");
                    System.out.println("COMISION: "+comision);
                    break;
                case 2:
                    comision=venta*0.18;
                    System.out.println("el vendedor: "+nombre+" tiene una comsion del 18%");
                    System.out.println("COMISION: "+comision);
                    break;
                case 3:
                    comision=venta*0.17;
                    System.out.println("el vendedor: "+nombre+" tiene una comsion del 17%");
                    System.out.println("COMISION: "+comision);
                    break;
                case 4:
                    comision=venta*0.21;
                    System.out.println("el vendedor: "+nombre+" tiene una comsion del 21%");
                    System.out.println("COMISION: "+comision);
                    break;
                case 5:
                    comision=venta*0.15;
                    System.out.println("el vendedor: "+nombre+" tiene una comsion del 15%");
                    System.out.println("COMISION: "+comision);
                    break;
                default:
                    System.out.println("zona equipocada...");
            }
            System.out.println();//salto de linea
            i++;
        }
    }
}
