import java.util.Scanner;
public class act3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeroInicial;
        int numeroFinal;
        int multiplos=0;
        int numPar=0;
        int numImpar=0;
        int acum=0;
        System.out.print("Ingrese el numero inicial: ");
        numeroInicial=sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        numeroFinal=sc.nextInt();
        for(int i = numeroInicial; i <= numeroFinal; i++ ){
            if (i % 3 == 0){
                multiplos++;
            }

            if (i % 2 == 0){
                numPar++;
            }else{
                numImpar++;
            }

            acum+=i;
        }
        System.out.println("rango de numeros : "+ numeroInicial + "-" + numeroFinal );
        System.out.println("La cantidad de numeros multiplos de tres en el rango es de: " + multiplos);
        System.out.println("la cantidad de numeros pares en el rango es de " + numPar + " y la de numeros impares es de " + numImpar);
        System.out.print("la suma de todos los numeros dentro del rango es de: " + acum);
        sc.close();
    }
}
