/*2.Una heladería desea obtener un reporte semanal de ventas. 
Para ello debe capturar en un sistema todas las facturas de ventas realizadas. 
Cada factura contiene la cantidad y el sabor de las paletas vendidas. Los sabores y los precios son:
limón ($2500), nuez ($2800), lulo ($2600), fresa ($2000) y crema ($3000). 
El sistema debe imprimir la cantidad de paletas vendidas de cada sabor, el valor vendido y la venta total. 
Considere que una factura puede tener varias paletas de diferentes sabores.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cant_facturas, cant_limon, cant_nuez, cant_lulo, cant_fresa, cant_crema;
        int suma_limon = 0, suma_nuez = 0, suma_lulo = 0, suma_fresa = 0, suma_crema = 0;
        float venta_total, valor_limon = 0, valor_nuez = 0, valor_lulo = 0, valor_fresa = 0, valor_crema = 0;
        final int limon=2500, nuez=2800, lulo=2600, fresa=2000, crema=3000;
        System.out.println("Digite la cantidad de facturas: ");
        cant_facturas=entrada.nextInt();
        
        for(int i=1; i<=cant_facturas; i++){
            System.out.println("FACTURA N°: "+i);
            System.out.println("digite la cantidad de paletas sabor LIMON vendidad: ");
            cant_limon=entrada.nextInt();
            suma_limon=suma_limon+cant_limon;
            System.out.println("digite la cantidad de paletas sabor NUEZ vendidad: ");
            cant_nuez=entrada.nextInt();
            suma_nuez=suma_nuez+cant_nuez;
            System.out.println("digite la cantidad de paletas sabor LULO vendidad: ");
            cant_lulo=entrada.nextInt();
            suma_lulo=suma_lulo+cant_lulo;
            System.out.println("digite la cantidad de paletas sabor FRESA vendidad: ");
            cant_fresa=entrada.nextInt();
            suma_fresa=suma_fresa+cant_fresa;
            System.out.println("digite la cantidad de paletas sabor CREMA vendidad: ");
            cant_crema=entrada.nextInt();
            suma_crema=suma_crema+cant_crema;
        }
        valor_limon=limon*suma_limon;
        valor_nuez=nuez*suma_nuez;
        valor_lulo=lulo*suma_lulo;
        valor_fresa=fresa*suma_fresa;
        valor_crema=crema*suma_crema;
        
        venta_total=valor_limon+valor_nuez+valor_lulo+valor_fresa+valor_crema;
        
        System.out.println("         REPORTE SEMANAL DE VANTAS          ");
        System.out.println("cantidad de paletas sabor limon "+suma_limon+" valor: "+valor_limon);
        System.out.println("cantidad de paletas sabor nuez "+suma_nuez+" valor: "+valor_nuez);
        System.out.println("cantidad de paletas sabor lulo "+suma_lulo+" valor: "+valor_lulo);
        System.out.println("cantidad de paletas sabor fresa "+suma_fresa+" valor: "+valor_fresa);
        System.out.println("cantidad de paletas sabor crema "+suma_crema+" valor: "+valor_crema);
        System.out.println("LA VENTA TOTAL ES: "+venta_total);
    }
}
