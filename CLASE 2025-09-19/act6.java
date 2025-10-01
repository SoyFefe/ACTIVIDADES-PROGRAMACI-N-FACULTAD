import java.util.Scanner;
public class act6 {
    public static void main(String[] args) {
        int m=0;
        int n=0;
        String caracter="#";
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Cuantas filas desea ingresar en la tabla? ");
        m=sc.nextInt();
        System.out.print("Cuantas columnas desea ingresar en la tabla? ");
        n=sc.nextInt();

        for (int i=0; i <= m; i++){
            for (int j=0; j <= n; j++){
                System.out.print(caracter+" ");
            }
            System.out.println("");
        }    
        sc.close();
    }
}
