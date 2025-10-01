import java.util.Scanner;
public class act2 {
    public static void main(String[] args) {
        int m;
        int numeroInicial;
        int numeroFinal;
        int multiplos=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese el numero inical: ");
        numeroInicial=sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        numeroFinal=sc.nextInt();
        System.out.print("ingrese el numero del cual queremos hallar los multiplos: ");
        m=sc.nextInt();
        for(int i = numeroInicial;i <= numeroFinal; i++){
            if (i % m == 0){
                multiplos++;
            }
        }
        System.out.println("la cantidad de numeros multiplos de " + m + " en un rango de " + numeroInicial + " a " + numeroFinal + " es de: " + multiplos );
        sc.close();
    }
}
