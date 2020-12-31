/*7.Una empresa desea comprarles camisas a sus empleados y para ello requiere un sistema 
para capturar el nombre y la talla de cada uno. Las tallas disponibles son XS, S, M, L, XL, XXL y XXXL 
(valide con un ciclo do-while la captura de la talla). El sistema debe imprimir el nombre del empleado, 
la talla de su camisa y la cantidad de camisas de cada talla.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS  COD:20201187763
 */
public class ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nombre, talla,respuesta;
        int i=1, talla_xs = 0, talla_s=0, talla_m=0, talla_l=0, talla_xl=0, talla_xxl=0, talla_xxxl=0;
        do{
            System.out.println("digite el nombre del empleado: n° "+i);
            nombre=entrada.next();
            System.out.println("digite la talla: XS, S, M, L, XL, XXL y XXXL ");
            talla=entrada.next();
            if((talla.equals("XS"))|(talla.equals("xs"))){
                talla_xs+=1;
            }else if((talla.equals("S")) | (talla.equals("s"))){
                talla_s+=1;
            }else if ((talla.equals("M")) | (talla.equals("m"))){
                talla_m+=1;
            }else if((talla.equals("L")) | (talla.equals("l"))){
                talla_l+=1;
            }else if ((talla.equals("XL")) | (talla.equals("xl"))){
                talla_xl+=1;
            }else if((talla.equals("XXL")) | (talla.equals("xxl"))){
                talla_xxl+=1;
            }else if((talla.equals("XXXL")) | (talla.equals("xxl"))){
                talla_xxxl+=1;
            }
            System.out.println("EMPLEADO: "+nombre+" TALLA: "+talla);
            i++;
            
            System.out.println("DESEA AGREGAR UN NUEVO USUARIO?: s/n");
            respuesta=entrada.next();
        }while(!respuesta.equals("n"));
        System.out.println("   CANTIDADES DE CAMISAS POR TALLAS:  ");
        System.out.println("talla XS: "+talla_xs);
        System.out.println("talla S: "+talla_s);
        System.out.println("talla M: "+talla_m);
        System.out.println("talla L: "+talla_l);
        System.out.println("talla XL: "+talla_xl);
        System.out.println("talla XXL: "+talla_xxl);
        System.out.println("talla XXXL: "+talla_xxxl);
    }
}
