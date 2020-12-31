/*5.Un centro penitenciario tiene N internos registrados y requiere un reporte con el nombre y la condena (en meses) 
de los internos con menos de 36 meses de condena. También debe mostrar la cantidad de internos que cumplen con dicha condición.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio5 {
     public static void main(String[] args){
         Scanner entrada=new Scanner (System.in);
         String nombre, respuesta;
         int condena, cant = 0;
         do{
             System.out.println("digite el nombre: ");
             nombre=entrada.next();
             System.out.println("digite la condena en meses: ");
             condena=entrada.nextInt();
             if(condena<36){
                System.out.println("CUMPLE LA CONDICION");
                System.out.println("NOMBRE: "+nombre+" CONDENA: "+condena);
                cant+=1;
            }
            System.out.println("dese agregar otro usuario? s/n");
            respuesta=entrada.next();
         }while(!respuesta.equals("n"));
         System.out.println("LA CANTIDAD DE USUARIOS QUE CUMPLEN CON LA CONDICION ES: "+cant);
     }
}
