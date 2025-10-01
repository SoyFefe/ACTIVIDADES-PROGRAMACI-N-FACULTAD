import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horasExtra=0;
        int sueldo=0;
        System.out.print("Por favor, introduzca el numero de horas trabajadas durate la semana: ");
        int horas = sc.nextInt();

        if(horas>40){
            horasExtra=horas-40;
            horas-=horasExtra;
        }

        sueldo=(horas*12)+(horasExtra*16);

        System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        sc.close();
    }
}
