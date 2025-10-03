public class act5 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100:");

        for (int num = 2; num <= 100; num++) {
            boolean esPrimo = true; 
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}
