/*17.Elabore un algoritmo que lea los siguientes datos de N empleados: 
Nombre, Sexo, Tipo de incapacidad, Días de incapacidad. El tipo de incapacidad puede ser por enfermedad o por accidente. 
Calcular:
a)	Número de empleados con más de 20 días de incapacidad.
b)	Total empleados incapacitados por enfermedad.
c)	Total empleados incapacitados por accidente.
d)	Total días de incapacidad.
e)	Total hombres incapacitados por accidente.
f)	Porcentaje de mujeres incapacitadas.
g)	Total días de incapacidad por enfermedad en mujeres.
h)	Promedio de días de incapacidad por enfermedad.
i)	Promedio de días de incapacidad por accidente.
 */
package taller;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class ejercicio_17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dias_incapacidad, incapacidad_mayordias=0, tipo_incapacidad, incapacidad_enfermedad = 0, incapacidad_accidente = 0, total_dias = 0, incapacitados_hombresaccidente=0;
        int cant_personas=0, cant_mujeres = 0, dias_incapacidadmujeres=0, dias_enfermedad = 0, dias_accidente=0;
        String nombre, sexo, respuesta;
        float porcentaje_mujer;
        do{
            cant_personas++;
            System.out.println("digite el nombre del trabajador: ");
            nombre=entrada.next();
            System.out.println("digite el sexo: M/H");
            sexo=entrada.next();
            if (sexo.equals("M")|(sexo.equals("m"))){
                cant_mujeres+=1;
            }
            System.out.println("digite el numero de dias de incapacidad: ");
            dias_incapacidad=entrada.nextInt();
            total_dias+=dias_incapacidad;//total de dias de incapacidad
            if (dias_incapacidad>20){
                incapacidad_mayordias+=1;//personas con mas de 20 dias de incapacidad
            } 
            System.out.println("selecione el tipo de incapacidad: ");
            System.out.println("1. enfermedad");
            System.out.println("2. accidente");
            tipo_incapacidad=entrada.nextInt();
            switch(tipo_incapacidad){
                case 1: 
                    incapacidad_enfermedad+=1;//saber personas incapacitador por enfermedad
                    dias_enfermedad+=dias_incapacidad;//total dias incapacidas por enfermedad
                    if(sexo.equals("M")|(sexo.equals("m"))){
                     dias_incapacidadmujeres+=dias_incapacidad;//saber dias total de incapacidad de mujeres por enfermedad
                    }
                    break;
                case 2: 
                    incapacidad_accidente+=1;//total personas incapacidos por accidente
                    dias_accidente+=dias_incapacidad;//total dias incapacidas por accidente
                    if(sexo.equals("h")|(sexo.equals("H"))){
                     incapacitados_hombresaccidente+=1;//saber cuantos hombre hay incapacitador por accidente
                    }
                    break;
            }
            
            System.out.println("desea agregar otro trabajador?: s/n");
            respuesta=entrada.next();
        }while(!respuesta.equals("N")&(!respuesta.equals("n")));
        porcentaje_mujer=(cant_mujeres*100)/cant_personas;//sacar porcentaje de mujeres incapacitadas
        System.out.println();//salto de linea
        System.out.println("NUMERO DE EMPLEADOS CON MAS DE 20 DIAS DE INCAPACIDAD: "+incapacidad_mayordias);
        System.out.println("NUMERO DE EMPLEADOS INCAPACITADOS POR ENFERMEDAD: "+incapacidad_enfermedad);
        System.out.println("NUMERO DE EMPLEADOS INCAPACITADOS POR ACCIDENTE: "+incapacidad_accidente);
        System.out.println("TOTAL DE DIAS DE INCAPACIDAD: "+total_dias);
        System.out.println("TOTAL DE HOMBRES INCAPACITADOR POR ACCIDENTE: "+incapacitados_hombresaccidente);
        System.out.println("PORCENTAJE DE MUJERES INCAPACITADAS: "+porcentaje_mujer+"%");
        System.out.println("NUMERO DE DIAS DE INCAPACIDAD MUJERES POR ENFERMEDAD: "+dias_incapacidadmujeres);
        System.out.println("TOTAL DIAS DE INCAPACIDAD POR ENFERMEDAD: "+dias_enfermedad);
        System.out.println("TOTAL DIAS DE INCAPACIDAD POR ACCIDENTE: "+dias_accidente);
        
    }
}
