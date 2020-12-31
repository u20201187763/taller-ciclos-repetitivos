/*16.Elabore un algoritmo que lea los siguientes datos de N trabajadores: 
Clave, Categoría, Sueldo, Años de antigüedad, Sexo.  
Calcule lo siguiente:
a)	Sueldo promedio por cada categoría.
b)	Cuántos empleados ganan más de $ 10,000.
c)	Cuántos empleados tienen más de 15 años de antigüedad.
d)	Cuántas mujeres de categoría A ganan más de $ 8,500.
e)	Cuántos empleados con 10 o más años de antigüedad, ganan menos de $ 6,000.
f)	Cuántos empleados de categoría C ganan más de $ 12,500.
Existen 3 categorías: A, B y C
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio_16 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int num_trabajadores, clave, años_antiguedad, empleados_mayorsueldo = 0, empleados_mayorantiguedad = 0, empleado_mayor_8500 = 0, empleado_10antiguedad = 0, empleado_categoriaC = 0;
        float sueldo, categoria_A = 0, categoria_B = 0, categoria_C = 0; 
        String categoria, sexo;
        int j=0, k=0, l = 0;//para llevar la cuenta de personas de cada categoria
        
        System.out.println("digite el numero de trabajadores");
        num_trabajadores=entrada.nextInt();
        
        for (int i=1; i<=num_trabajadores; i++){
            System.out.println("digite la clave del trabajador No°: "+i);
            clave=entrada.nextInt();
            System.out.println("digite el sueldo: ");
            sueldo=entrada.nextFloat();
            if(sueldo>10000){
                empleados_mayorsueldo+=1;//empleados que ganan mas de 10.000
            }

            System.out.println("digite los años de antiguedad: ");
            años_antiguedad=entrada.nextInt();
            if(años_antiguedad>15){
                empleados_mayorantiguedad+=1;//empleados con mas de 15 años de antiguedad
            }
            if(años_antiguedad>=10){//personas con 10 0 mas años de antiguedad que gana menos de 6.000
                if(sueldo<6000){
                    empleado_10antiguedad+=1;
                }
            }
            System.out.println("seleciona el sexo: H/M");
            sexo=entrada.next();   
            System.out.println("seleciona la categoria: A, B, C");
            categoria=entrada.next();
            switch(categoria){
                case "A":
                    categoria_A+=sueldo;
                    j++;
                    if(sexo.equals("M")|(sexo.equals("m"))){//mujeres de la categoria A que gana mas de 8.500
                       if(sueldo>8500){
                           empleado_mayor_8500+=1;
                       }
                    }
                    break;
                case "B":
                    categoria_B+=sueldo;
                    k++;
                    break;
                case "C":
                    categoria_C+=sueldo;
                    l++;
                    if(sueldo>12500){//personas de la categoria C que ganan mas de 12.500
                        empleado_categoriaC+=1;
                    }
                    break;
            }
            System.out.println();//salto de linea
        }
        categoria_A/=j;//sacar promedio de sueldo
        categoria_B/=k;//sacar promedio de sueldo
        categoria_C/=l;//sacar promedio de sueldo
        System.out.println("    SUELDO PROMEDIO ");
        System.out.println("salario promedio categoria A:" +categoria_A);
        System.out.println("salario promedio categoria B:" +categoria_B);
        System.out.println("salario promedio categoria C:" +categoria_C);
        System.out.println();//salto de linea
        System.out.println("NUMERO DE EMPLEADOS QUE GANAN MAS DE 10.000: "+empleados_mayorsueldo);
        System.out.println("NUMERO DE EMPLEADOS QUE TIENEN MAS DE 15 AÑOS DE ANTIGUEDAD: "+empleados_mayorantiguedad);
        System.out.println("NUMERO DE MUJERES DE CATEGORIA A QUE GANAN MAS DE 8.500: "+empleado_mayor_8500);
        System.out.println("NUMERO DE PERSONAS QUE TIENEN 10 O MAS AÑOS DE ANTIGUEDAD QUE GANAN MENOS DE 6000: "+empleado_10antiguedad);
        System.out.println("NUMERO DE EMPLEADOS DE CATEFORIA C QUE GANA MAS DE 12.500: "+empleado_categoriaC);
    }
}
