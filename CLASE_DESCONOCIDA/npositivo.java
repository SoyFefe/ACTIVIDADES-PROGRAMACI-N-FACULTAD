package actividadesEscuela.CLASE_DESCONOCIDA;
import java.util.Scanner;
public class npositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = sc.nextInt();

        int suma = n * (n + 1) / 2;

        System.out.println("La suma de los " + n + " primeros números enteros positivos es: " + suma);

        sc.close();
    }
}


