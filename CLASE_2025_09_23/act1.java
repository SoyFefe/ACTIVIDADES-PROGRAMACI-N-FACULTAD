import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese solo la hora en un rango de 00 a 23: ");
        int hora = sc.nextInt();

        if(hora>=21 & hora<=05){
            System.out.println("¡Buenas Noches!");
        }else if(hora>=6 & hora<=12){
            System.out.println("¡Buenos Dias!");
        }else if(hora>=13 & hora<=20){
            System.out.println("¡Buenas Tardes!");
        }else{
            System.out.println("ERROR");
            System.out.println("Recuerde que debe de utilizar un rango horario de 00 a 23");
        }
        sc.close();
    }
}