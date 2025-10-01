package actividadesEscuela;
import java.util.Scanner;

public class PromedioTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera temperatura: ");
        int t1 = sc.nextInt();
        System.out.print("Ingrese la segunda temperatura: ");
        int t2 = sc.nextInt();
        System.out.print("Ingrese la tercera temperatura: ");
        int t3 = sc.nextInt();

        int promedio = (t1 + t2 + t3) / 3;

        System.out.println("El promedio de las temperaturas es: " + promedio);
        sc.close();
    }
}
