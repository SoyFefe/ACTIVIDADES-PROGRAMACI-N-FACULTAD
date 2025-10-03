import java.util.Scanner;
public class act1 {
    public static void main(String[] args) {
        int numeroInicial;
        int numeroFinal;
        int numeroNegativo=0;
        int numeroPositivo=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el numero inicial: ");
        numeroInicial=sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        numeroFinal=sc.nextInt();
        for(int i = numeroInicial; i <= numeroFinal; i++ ){
            if(i<0){
                numeroNegativo++;
            }else{
                numeroPositivo++;
            }
            System.out.println(i);
        }
        System.out.println("La cantidad de numeros negativos es de: " + numeroNegativo);
        System.out.println("La cantidad de numeros positivos es de: " + numeroPositivo);
        sc.close();

    }
    
}