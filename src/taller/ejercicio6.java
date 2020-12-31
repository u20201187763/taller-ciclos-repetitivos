/*6.Una empresa distribuidora de huevos cuenta con N repartidores, 
los cuales al final de su jornada laboral, entregan un reporte con la venta realizada. 
Implemente un ciclo para capturar el nombre y la venta (en dinero) de cada repartidor 
y al final muestre el nombre y la venta de los repartidores con mayor y menor monto
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float venta_mayor=0, venta_menor=999999999, valor;
        int cant, i = 1;
        String nombre, nombre_mayor = null, nombre_menor = null;
        System.out.println("digite la cantidad de repartidores: ");
        cant=entrada.nextInt();
        while(i<=cant){
            System.out.println("digite el nombre del repartidor N°: "+i);
            nombre=entrada.next();
            System.out.println("digite el valor de ventas: ");
            valor=entrada.nextFloat();
            if(valor>venta_mayor){
                venta_mayor=valor;
                nombre_mayor=nombre;
            }
            if (valor<venta_menor){
                venta_menor=valor;
                nombre_menor=nombre;
            }
            i++;
        }
        System.out.println("   MAYOR VENTA  ");
        System.out.println("NOMBRE: "+nombre_mayor+" VALOR: "+venta_mayor);
        System.out.println("   MENOR VENTA  ");
        System.out.println("NOMBRE: "+nombre_menor+" VALOR: "+venta_menor);
    } 
}
