/*12.Leer los siguientes datos de los alumnos de una escuela: 
Número de control, Nivel, Especialidad. Calcular lo siguiente:
a)	Cuántos alumnos son de bachillerato
b)	Cuántos alumnos son de profesional
c)	Cuántos alumnos son de maestría
d)	Cuántos alumnos son de sistemas
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio_12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner  (System.in);
        String respuesta = null, nivel;
        float numero_control, bachillerato = 0, profesional = 0, maestria = 0, sistemas = 0;
        int especialidad;
        do{
            System.out.println("digite el numero de control");
            numero_control=entrada.nextFloat();
            System.out.println("digite el nivel ");
            nivel=entrada.next();
            System.out.println("seleccione la especialidad: ");
            System.out.println("1. bachiller");
            System.out.println("2. profesional");
            System.out.println("3. maestria");
            System.out.println("4. sistemas");
            especialidad=entrada.nextInt();
            switch(especialidad){
                case 1:
                    bachillerato+=1;
                    break;
                case 2:
                    profesional+=1;
                    break;
                case 3:
                    maestria+=1;
                    break;
                case 4:
                    sistemas+=1;
                    break;
                default:
                    System.out.println("opcion equivocada");
            }
            System.out.println("desea agregar otro alumno?: s/n");
            respuesta=entrada.next();
        }while(!respuesta.equals("N")&&(!respuesta.equals("n")));
        System.out.println();//salto de linea
        System.out.println("ALUMNOS DE BACHILLERATO: "+bachillerato);
        System.out.println("PROFESIONALES: "+profesional);
        System.out.println("ALUMNOS DE MAESTRIA: "+maestria);
        System.out.println("ALUMNOS DE SISTEMAS: "+sistemas);
    }
}
