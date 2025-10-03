import java.util.Scanner;
public class act4 {
    public static void main(String[] args) {
        int numero;
        //uso long porque se pueden guardar mas numeros que con int
        long factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese un numero entero para hallar el factorial: ");
        numero=sc.nextInt();
        
        for(int i=1; i <= numero; i++){
            factorial*=i;
        }
        System.out.println("el factorial del numero " + numero + " es: " + factorial);
        sc.close();
    }
}
