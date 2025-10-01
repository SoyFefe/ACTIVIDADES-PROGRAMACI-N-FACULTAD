package actividadesEscuela;
import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial (C): ");
        double C = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés en % (r): ");
        double r = sc.nextDouble() / 100; // pasar a decimal

        System.out.print("Ingrese el tiempo en períodos (t): ");
        int t = sc.nextInt();

        // Fórmula: M = (1 + r)^t * C
        double M = Math.pow(1 + r, t) * C;
        double I = M - C;

        System.out.println("Monto total (M): " + M);
        System.out.println("Interés generado (I): " + I);

        sc.close();
    }
}
