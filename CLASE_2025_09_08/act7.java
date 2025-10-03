import java.util.Scanner;
public class act7 {
    public static void main(String[] args) {
        //declaracion de variables
        int i=0;
        String[] candidatos=new String[100];
        int[] votos=new int[100];
        int val1=0;
        Scanner sc = new Scanner(System.in);
        int ganador=0;
        int votosmax=0;
        System.out.println("¡elecciones 2025!");
        //bucle para la carga de datos
        do{
            System.out.print("ingrese el nombre del candidato "+(i+1)+": ");
            candidatos[i]=sc.nextLine();
            System.out.print("ingrese la cantidad de votos de el candidato "+(i+1)+": ");
            votos[i]=sc.nextInt();
            sc.nextLine();
            i++;
            System.out.print("presione 1 si desea ingresar otro candidato o 2 si desea finalizar: ");
            val1=sc.nextInt();
            sc.nextLine();
            if (i >= 100) {
                System.out.println("Capacidad máxima alcanzada.");
                break;
            }
        }while(val1==1);
        //for que compara los votos y determina el ganador
        for(int j=0; j<i;j++){
            if(votos[j]>votosmax){
                votosmax=votos[j];
                ganador=j;
            };
        }
        //impresion de resultados
        System.out.println("El candidato ganador de las elecciones 2025 es " + candidatos[ganador] + " con la cantidad de " + votosmax + " votos");
        //cerramos el scanner
        sc.close();
    }
}
