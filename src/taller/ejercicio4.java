/*4.La casa del adulto mayor tiene 37 personas registradas y requiere un reporte de los adultos con más de 85 años. 
Para ello implementa un sistema en el que se capturan el nombre y la edad de cada persona 
e imprime los datos de quienes cumplen con la condición solicitada.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:2O201187763
 */
public class ejercicio4 {
    public static void main(String[] args){
       Scanner entrada= new Scanner(System.in);
       int edad,cant = 0;
       String nombre;
       for(int i=1; i<=37;i++){
           System.out.println("digite el nombre de la persona: ");
           nombre=entrada.next();
           System.out.println("digite la edad: ");
           edad=entrada.nextInt();
           
           if(edad>=85){
               System.out.println("PERSONA QUE CUMPLE CON LA CONDICION");
               System.out.println("NOMBRE: "+nombre+" EDAD: "+edad);
               cant+=1;
           }
       }
        System.out.println("la cantidad de personas que cumplen con la condicion es: "+cant);
    }
}
