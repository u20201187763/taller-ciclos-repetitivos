/*1.Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido recientemente. 
Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el nombre de cada bebé y su sexo 
(implemente un ciclo do-while para validar la captura, siendo M para masculino y F para femenino). 
Al final, debe imprimir la cantidad de bebés de cada sexo.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num_nacidos = 0, i=1, H = 0, F = 0; 
        String sexo, nombre;
        System.out.println("digite la cantidad de nacimientos: ");
        num_nacidos=entrada.nextInt();
        do{
            System.out.println("digite el nombre del bebe ");
            nombre=entrada.next();
            System.out.println("digite el sexo del bebe: H/F");
            sexo=entrada.next();
            if (sexo.equals("H")|| (sexo.equals("h"))){
                H+=1;
            }else if (sexo.equals("F")| (sexo.equals("f"))){
                F+=1;
            }
            System.out.println("el nombre del bebe es: "+nombre+" el genero es: "+sexo);
           i++;
        }while(i<=num_nacidos);
        System.out.println("la cantidad de bebe hombre es: "+H);
        System.out.println("la cantidad de bebes mujeres es: "+F);
    }
}
