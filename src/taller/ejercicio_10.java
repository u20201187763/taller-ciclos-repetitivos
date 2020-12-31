/*10.Un distribuidor de juguetes ha hecho una excelente compra de 10,000 juguetes en cajas rectangulares de diversos tamaños. 
El distribuidor desea poner las cajas en esferas plásticas de brillantes colores y sellarlas como paquetes sorpresa. 
Las esferas son de cuatro diámetros diferentes: 4, 6, 8 y 10 pulgadas, 
por lo que para realizar todo en orden desea saber cuántas esferas de cada diámetro debe comprar. 
Puesto que la diagonal de una caja rectangular cuyas dimensiones son A, B y C está dada por
D=raiz(a^2 + b^2 + c^2)
y es, además, la dimensión mayor, el distribuidor debe calcular las longitudes de las diagonales de las cajas 
y determinar el número de las que son de 4 pulgadas o menos, las comprendidas entre 4 y 6 pulgadas, etc. 
Diseñe un algoritmo en diagrama de flujo que lea las dimensiones de cada caja, calcule la longitud de sus diagonales e 
imprima el número de esferas de cada tamaño que necesita comprar para empacar los juguetes.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class ejercicio_10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double longitud_a, longitud_b, longitud_c;
        int diametro_a = 0, diametro_b = 0, diametro_c = 0, diametro_d = 0, diamtro_e = 0;
        double calculo=0;
        for(int i=1; i<=10000; i++){//ciclo para 10.000 cajas/juguetes
            System.out.println("CAJA N°: "+i);
            System.out.println("digite la longitud A: ");
            longitud_a=entrada.nextFloat();
            System.out.println("digite la longitud B: ");
            longitud_b=entrada.nextFloat();
            System.out.println("digite la longitud C: ");
            longitud_c=entrada.nextFloat();
            
            //calculo de la ecuacion para halla la dimension
            calculo=Math.sqrt((Math.pow(longitud_a,2)+(Math.pow(longitud_b,2)+(Math.pow(longitud_c,2)))));
            calculo=Math.round(calculo); //redondeo del numero
            System.out.println("calculo: "+calculo);
            if(calculo<=4){
                diametro_a+=1;
            }else if (calculo>4 && calculo<=6){
                diametro_b+=1;
            }else if (calculo>6 && calculo<=8){
                diametro_c+=1;
            }else if (calculo>8 && calculo<=10){
                diametro_d+=1;
            }    
        }
        System.out.println("    CANTIDAD DE CAJAS SEGUN MEDIDAS ");
        System.out.println("CAJAS DE 4 O MENOR DIAMETRO: "+diametro_a);
        System.out.println("CAJAS DE 5 A 6 DIAMETRO: "+diametro_b);
        System.out.println("CAJAS DE 7 a 8 DIAMETRO: "+diametro_c);
        System.out.println("CAJAS DE 9 a 10 DIAMETRO: "+diametro_d);
    }
}
