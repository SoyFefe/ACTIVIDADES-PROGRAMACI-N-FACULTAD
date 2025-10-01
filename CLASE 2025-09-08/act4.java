import java.util.Scanner;
public class act4 {
    public static void main(String[] args) {
        //Definimos las variables
        int i=1;
        int a=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        //while donde ingresan los datos
        while(i<=10){
            System.out.print("ingrese un numero: ");
            n=sc.nextInt();
            //condicional que suma a
            if(i>5){
                a+=n;
            }
            //incrementa el contador
            i++;
        }
        //imprimos a
        System.out.println("el numero a es: " + a);
        //cerramos el scanner
        sc.close();
    }
}
