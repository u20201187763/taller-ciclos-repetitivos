/*15.Elabore un algoritmo que lea los siguientes datos para N alumnos: 
No. de control, Calif 1, Calif 2, Calif 3. Imprima el No. de control de los alumnos que tengan promedio >= 3.0
El promedio es ponderado, la primera calificación equivale al 30 %, la segunda al 35 % y la tercera al 35 %. 
Lo que se pide calcular es lo siguiente: 
a)	El promedio para cada alumno.
b)	Cuántos alumnos hay en primer semestre.
c)	Cuántos alumnos hay en noveno semestre.
d)	Cuántos alumnos hay en cada especialidad.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio_15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float pregrado = 0, maestria = 0, sistemas = 0;
        int especialidad, num_primersemestre = 0, num_novenosemestre = 0, semestre;
        double nota1, nota2, nota3, nota_final;
        String respuesta, num_control;
        do{
            System.out.println("digite el numero de control: ");
            num_control=entrada.next();
            System.out.println("digite el semestre cursado: (en numero) ");
            semestre=entrada.nextInt();
            switch(semestre){
                case 1:
                    num_primersemestre+=1;
                    break;
                case 9: 
                    num_novenosemestre+=1;
            }
            
            System.out.println("seleccione la especialidad: ");
            System.out.println("1. preprado");
            System.out.println("2. maestria");
            System.out.println("3. sistemas");
            especialidad=entrada.nextInt();
            switch(especialidad){
                case 1:
                    pregrado+=1;
                    break;
                case 2:
                    maestria+=1;
                    break;
                case 3:
                    sistemas+=1;
                    break;
                default:
                    System.out.println("opcion equivocada");
                }
            
            System.out.println("digite primera calificacion: ");
            nota1=entrada.nextFloat();
            System.out.println("digite segunda calificacion: ");
            nota2=entrada.nextFloat();
            System.out.println("digite tercera calificacion: ");
            nota3=entrada.nextFloat();
            nota1=nota1*0.30;
            nota2=nota2*0.35;
            nota3=nota3*0.35;
            nota_final=nota1+nota2+nota3;
            if(nota_final>=30){
                System.out.println(num_control+" ESTUDIANTE CON PROMEDIO MAYO O IGUAL A 3.0");
            }
            System.out.println("EL PROMEDIO DEL ESTUDIANTE: "+num_control+" ES: "+nota_final);
            System.out.println("desea agregar otro alumno? s/n:");
            respuesta=entrada.next();
        }while(!respuesta.equals("n")&(!respuesta.equals("N")));
        System.out.println();//salto de linea
        System.out.println("NUMEROS DE ALUMNOS EN PRIMER SEMESTRE: "+num_primersemestre);
        System.out.println("NUMEROS DE ALUMNOS EN NOVENO SEMESTRE:"+num_novenosemestre);
        System.out.println();//salto de linea
        System.out.println("ESTUDIANTES DE PREGRADOS: "+pregrado);
        System.out.println("ESTUDIANTE DE MAESTRIA: "+maestria);
        System.out.println("ESTUDIANTE DE SISTEMAS: "+sistemas);
    }
}
