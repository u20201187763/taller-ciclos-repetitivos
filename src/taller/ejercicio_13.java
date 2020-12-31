/*13.Leer los siguientes datos de los empleados de una compañía: 
Nombre, Sueldo, Departamento. Calcule lo siguiente:
a)	Cuántos empleados hay en cada departamento.
b)	Cuántos empleados ganan más de $ 8,000
Existen 5 departamentos: Finanzas, Sistemas, Producción, Ventas y Mantenimiento. Considere las claves necesarias.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class ejercicio_13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nombre, respuesta=null;
        float sueldo=0;
        int departamento, finanzas = 0, sistemas = 0, produccion = 0, ventas_mantenimiento = 0, mayor_sueldo = 0;
        do{
            System.out.println("digite el nombre: ");
            nombre=entrada.next();
            System.out.println("digite el sueldo: ");
            sueldo=entrada.nextFloat();
            if (sueldo>8000){
                mayor_sueldo+=1;
            }
            System.out.println("seleccione el departamento: ");
            System.out.println("1. finanzas");
            System.out.println("2. sistemas");
            System.out.println("3. produccion");
            System.out.println("4. ventas y mantenimiento");
            departamento=entrada.nextInt();
            switch(departamento){
                case 1: 
                    finanzas+=1;
                    break;
                case 2:
                    sistemas+=1;
                    break;
                case 3: 
                    produccion+=1;
                    break;
                case 4: 
                    ventas_mantenimiento+=1;
                default: 
                    System.out.println("opcion equipocada");
            }
            System.out.println("desea agregar un nievo empleado?: s/n");
            respuesta=entrada.next();
        }while(!respuesta.equals("N")&&(!respuesta.equals("n")));
        System.out.println();//salto del linea
        System.out.println("EMPLEADOS EN EL DEPARTAMENO DE FINANZAS: "+finanzas);
        System.out.println("EMPLEADOS EN EL DEPARTAMENTO DE SISTEMAS: "+sistemas);
        System.out.println("EMPLEADOS EN EL DEPARTAMENTO DE PRODUCCION: "+produccion);
        System.out.println("EMPLEADOS EN EL DEPARTAMENTO DE VENTAS Y MANTENIMIENTO: "+ventas_mantenimiento);
        System.out.println();//salto de linea
        System.out.println("EMPLEADOS QUE GANAN MAS DE 8.000: "+mayor_sueldo);
    }
}
