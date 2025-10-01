import java.util.Scanner;
public class act8 {
    public static void main(String[] args) {
        //declaracion de variables
        int numero= (int)(Math.random()*15) + 1;
        Scanner sc= new Scanner(System.in);
        int num1;
        int intentos=7;
        //inicio del juego
        System.out.println("adivina el número generado por la computadora (del 1 al 15)");
        System.out.println("TIENES 7 INTENTOS");
        //carga de datos
        do{
            System.out.print("ingrese un numero del 1 al 15: ");
            num1=sc.nextInt();
            intentos--;
            //if que va coomparando los numeros ingresados con el numero ganador
            if (num1==numero){
                System.out.println("FELICIDADES, ACERTO!");
            }else if(num1>numero){
                System.out.println("MENOS");
                System.out.println("te quedan " + intentos + " intentos");
            }else if(num1<numero){
                System.out.println("MÁS");
                System.out.println("te quedan " + intentos + " intentos");
            }
        }while(intentos>0 & num1!=numero );
        //if que se imprime solo si el usuario se queda sin intentos
        if(num1 != numero){
                    System.out.println("*** PERDIO EL JUEGO ***");
                    System.out.println("El número era: " + numero);
                }
        //cerramos el scanner
        sc.close();
    }
}
