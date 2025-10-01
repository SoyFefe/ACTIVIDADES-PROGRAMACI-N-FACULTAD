import java.util.Scanner;
public class act6 {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc=new Scanner(System.in);
        int val1=0;
        int num3=7;
        int val2=0;
        System.out.println("Bienvenido al juego de los dados");
        //bucle que ejecuta el lanzamiento de dados
        do{
            System.out.print("presione 1 para lanzar los dados: ");
            val1=sc.nextInt();
            //if que genera los numeros
            if (val1==1){
                int num1= (int)(Math.random() * 6) + 1;
                int num2= (int)(Math.random() * 6) + 1;
                System.out.println("el numero que muestran los dados es: "+ (num1+num2));
                //if que determina los resultados
                if (num1+num2==num3){
                    System.out.println("¡USTED A GANADO!");
                    val2+=1;
                }else{
                    System.out.println("¡Usted perdio! :( ");
                    System.out.println("¡intente de nuevo! ");
                }
            }else{
                System.out.println("usted se ha equivocado, debe presionar 1");
            }
        //condicion para terminar el programa
        }while(val2==0);
        //cerramos el Scanner
        sc.close();
    }
}
