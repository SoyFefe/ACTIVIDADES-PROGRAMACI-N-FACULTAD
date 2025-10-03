import java.util.Scanner;

public class act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menos3000 = 0;
        int entre3000y5000 = 0;
        int mas5000 = 0;
        double total = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = sc.nextDouble();

            
            if (sueldo < 3000) {
                menos3000++;
            } else if (sueldo <= 5000) { 
                entre3000y5000++;
            } else {
                mas5000++;
            }

            
            total += sueldo;
        }

        
        System.out.println("\nResultados:");
        System.out.println("a) Empleados con sueldo < 3000: " + menos3000);
        System.out.println("b) Empleados con sueldo entre 3000 y 5000: " + entre3000y5000);
        System.out.println("c) Empleados con sueldo > 5000: " + mas5000);
        System.out.println("d) Sueldo total a abonar: $" + total);

        sc.close();
    }
}
