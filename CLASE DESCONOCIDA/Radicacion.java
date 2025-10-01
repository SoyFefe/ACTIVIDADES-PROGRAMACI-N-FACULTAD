package actividadesEscuela;
import java.util.Scanner;

public class Radicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de n: ");
        double n = sc.nextDouble();

        double r = Math.pow(a, 1.0 / n);

        System.out.println("La raíz " + n + " de " + a + " es: " + r);

        sc.close();
    }
}