import java.util.Scanner;

public class act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0; 
        int cantidad = 8; 

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " (en metros): ");
            double altura = sc.nextDouble();
            suma += altura;
        }

        double promedio = suma / cantidad;

        System.out.println("\nEl promedio de las alturas es: " + promedio + " metros");

        sc.close();
    }
}
