import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triángulos: ");
        int N = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("\nTriángulo " + i);

            System.out.print("Ingrese la base: ");
            double base = sc.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = sc.nextDouble();

            double superficie = (base * altura) / 2;

            
            System.out.println("Base: " + base + " - Altura: " + altura + " - Superficie: " + superficie);

            
            if (superficie > 12) {
                contador++;
            }
        }

        // Mostrar resultado final
        System.out.println("\nCantidad de triángulos con superficie mayor a 12: " + contador);

        sc.close();
    }
}
