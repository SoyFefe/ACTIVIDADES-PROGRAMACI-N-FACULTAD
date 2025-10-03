import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        int[] edades= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < edades.length; i++){
            System.out.print("INGRESE LA EDAD DE LA PERSONA " + (i+1) + ": ");
            edades[i]=sc.nextInt();
        }
        for (int i = 0; i < edades.length; i++){
            System.out.println("PERSONA " + (i+1) + ": " + edades[i]);
        }
        sc.close();
    }
}
