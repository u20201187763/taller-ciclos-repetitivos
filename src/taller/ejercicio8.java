/*8.Un centro de salud cuenta con 1270 expedientes en su archivo y desea identificar a las personas con mayor y menor peso. 
Para ello implementa un sistema mediante el cual se capturan el nombre y peso de cada paciente y al finalizar,
se imprime el nombre y kgs. de las personas con mayor y menor peso.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nombre, nombre_mayor = null, nombre_menor = null;
        int mayor_peso=0, menor_peso=999, peso;
        for(int i=1; i<=1270;i++){// 1270 expedientes
            System.out.println("digite el nombre del paciente N°: "+i);
            nombre=entrada.next();
            System.out.println("digite el peso del paciente: ");
            peso=entrada.nextInt();
            if(peso>mayor_peso){
                mayor_peso=peso;
                nombre_mayor=nombre;
            }
            if(peso<menor_peso){
                menor_peso=peso;
                nombre_menor=nombre;
            }
        }
        System.out.println("    PACIENTE CON MAYOR PESO ");
        System.out.println("NOMBRE: "+nombre_mayor+" PESO: "+mayor_peso);
        System.out.println("    PACIENTE CON MENOR PESO ");
        System.out.println("NOMBRE: "+nombre_menor+" PESO: "+menor_peso);
    }
}
