package actividadesEscuela.CLASE_DESCONOCIDA;
import java.util.Scanner;
public class alturas {
    public static void main(String[] args) {
        double suma=0.00;
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<3;i++){
            System.out.print("ingrese el nombre del alumno: ");
            String alumno=sc.nextLine();
            System.out.print("ingrese la altura de "+alumno+": ");
            double altura=sc.nextDouble();
            sc.nextLine();
            suma+=altura;
        }
        
        double prom=suma/3;
        System.out.println("el promedio de altura de los 3 alumnos es de: "+ prom);
        sc.close();
    }
}
