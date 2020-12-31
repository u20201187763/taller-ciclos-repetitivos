/*11.Cada equipo de la liga nacional de fútbol tiene un cuadro de 22 jugadores. 
Por cada equipo se capturan los siguientes datos: nombre del jugador, peso y edad. 
Los datos correspondientes a los 10 equipos de la liga se recolectan y se envían a la sede central para su análisis. 
Los datos son capturados en orden por cada equipo; es decir, los primeros 22 son del equipo 1, 
los siguientes 22 del equipo 2 y así sucesivamente. 
Diseñe un diagrama de flujo para calcular los siguientes valores estadísticos:

a)	Pesos y edades promedio de cada uno de los 10 equipos.
b)	Peso y edad promedio de todos los jugadores de la liga.
c)	Número de equipos con peso promedio mayor de 75 kg.
d)	Número de equipos con edad promedio menor de 18 años.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class ejercicio_11 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int edad = 0, peso = 0;
        float peso_promedio_equipo = 0, edad_promedio_equipo = 0, peso_promedio = 0, edad_promedio = 0; 
        float peso_promediomayor = 0, edad_promediomenor = 0, edad_promedio_total, peso_promedio_total;
        String nombre;
        
        for(int i=1; i<=10; i++){
            for(int j=1; j<=22; j++){
                System.out.println("DATOS DEL EQUIPO N°: "+i);
                System.out.println("digite el nombre del jugador n°: "+j);
                nombre=entrada.next();
                System.out.println("digite el peso del jugador: ");
                peso=entrada.nextInt();
                System.out.println("digite la edad del jugador: ");
                edad=entrada.nextInt();
                peso_promedio_equipo+=peso;
                edad_promedio_equipo+=edad;
            }
            peso_promedio+=peso_promedio_equipo;
            edad_promedio+=edad_promedio_equipo;
            peso_promedio_equipo/=22;//por quipo son 22 jugadores
            edad_promedio_equipo/=22;//por equipo son 22 jugadores
            if (edad_promedio_equipo<18){
            edad_promediomenor+=1;
            }
            
            if (peso_promedio_equipo>75){
            peso_promediomayor+=1;
            }
            System.out.println();//salto de linea
            System.out.println("EL PESO PROMEDIO DEL EQUIPO N°: "+i+" ES: "+peso_promedio_equipo);
            System.out.println("LA EDAD PROMEDIO DEL EQUIPO N°: "+i+" ES: "+edad_promedio_equipo);
            System.out.println();//salto de linea
            peso_promedio_equipo=0;
            edad_promedio_equipo=0;
        }
        peso_promedio_total=peso_promedio/220; //en toda la liga hay 220 jugadores
        System.out.println();//salto de linea
        System.out.println("EL PESO PROMEDIO DE TODA LA LIGA ES: "+peso_promedio_total);
        edad_promedio_total=edad_promedio/220; //en toda la liga hay 220 jugadores 
        System.out.println("LA EDAD PROMEDIO DE TODA LA LIGA ES: "+edad_promedio_total);
        System.out.println();//salto de linea
        System.out.println("NUMERO DE EQUIPOS CON PESO PROMEDIO MAYOR A 75KG: "+peso_promediomayor);
        System.out.println("NUMERO DE EQUIPOS CON EDAD PROMEDIO MENOR A 18 AÑOS: "+edad_promediomenor);
    }
}
