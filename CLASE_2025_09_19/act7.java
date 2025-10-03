import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Ingrese el número final: ");
        int fin = sc.nextInt();

        
        System.out.print("¿Hasta qué número quiere multiplicar cada tabla? ");
        int limite = sc.nextInt();

        for(int i=inicio; i<=fin; i++){
            for (int j=1; j<=limite; j++){
                System.out.println(i + " * " + j + " = " + (i*j) );
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
