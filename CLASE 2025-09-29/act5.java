//5- Almacenar en dos vectores las notas de los cursos A y B, sabiendo que el A tiene 20 alumnos y el B, 15. Realizar las siguientes operatorias:

//a | Cuántos alumnos de cada curso están promocionando (nota >= a 7).

//b | Cuántos alumnos de cada curso quedaron Libres (nota < a 4).

//c | Promedio general de cada curso.

//d | Indicar cuál es el curso de mayor promedio.
import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] cursoA=new int[20];
        int[] cursoB=new int[15];
        int promA=0;
        int libresA=0;
        int promB=0;
        int libresB=0;
        int acumA=0;
        int acumB=0;
        double promedioA;
        double promedioB;
        //carga de datos en curso A
        for (int i = 0; i < cursoA.length; i++) {
            cursoA[i] = (int)(Math.random() * 10) + 1; 
        }
        //carga de datos en curso B
        for (int i = 0; i < cursoB.length; i++) {
            cursoB[i] = (int)(Math.random() * 10) + 1; 
        }
        
        //for con contadores para aprobados y desaprobados curso A, tambien incluye acumulador
        for (int i = 0; i < cursoA.length; i++){
            if(cursoA[i]>=7){
                promA++;
            }else if(cursoA[i]<=4){
                libresA++;
            }
            acumA+=cursoA[i];
        }
        //for con contadores para aprobados y desaprobados curso B, tambien incluye acumulador
        for (int i = 0; i < cursoB.length; i++){
            if(cursoB[i]>=7){
                promB++;
            }else if(cursoB[i]<=4){
                libresB++;
            }
            acumB+=cursoB[i];
        }

        //calculo de los promedios de ambos cursos, pasamos a double los valores en los acumuladores para asi realizar la division
        promedioA=(double) acumA / cursoA.length;
        promedioB=(double) acumB / cursoB.length;

        //imprimir alumnos aprobados y desaprobados de ambos cursos
        System.out.println("La cantidad de alumnos promocionados en el curso A es de " + promA + " y la cantidad de desaprobados es de " + libresA);
        System.out.println("La cantidad de alumnos promocionados en el curso B es de " + promB + " y la cantidad de desaprobados es de " + libresB);
        //promedio general de ambos cursos
        System.out.println("El promedio general del curso A es de: " + promedioA);
        System.out.println("El promedio general del curso B es de: " + promedioB);

        //if para comparar ambos promedios
        if(promedioA>promedioB){
            System.out.println("El curso con mayor promedio es el A");
        }else{
            System.out.println("El curso con mayor promedio es el B");
        }
        sc.close();
    }
}
