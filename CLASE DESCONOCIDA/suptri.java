package actividadesEscuela;
import java.util.Scanner;
public class suptri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=0.00;
        double h=0.00;
        System.out.print("ingrese la base del triangulo: ");
        b=sc.nextDouble();
        System.out.print("ingrese la altura del triangulo: ");
        h=sc.nextDouble();
        double sup=b*h/2;
        System.out.println("La superficie del triangulo es de: "+sup);
        sc.close();
    }
}
