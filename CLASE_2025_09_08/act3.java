import java.util.Scanner;
public class act3 {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner sc=new Scanner(System.in);
        double[] pers= new double[10];
        double prom;
        double sum=0.0;
        int i=0;
        int j=0;
        //while para la carga de datos
        while(i<10){
            System.out.print("ingrese el peso de la persona " + (i+1) + ": ");
            pers[i]=sc.nextDouble();
            i++;
        }
        //while que suma todos los elementos de la lista
        while(j<10){
            sum+=pers[j];
            j++;
        }
        //funcion que calcula el promedio
        prom=sum/pers.length;

        //condicional que imprime el resultado segun el promedio
        if(prom<55.0){
            System.out.println("peso insuficiente");
        }else if(prom>=55.0 & prom<70.0){
            System.out.println("peso ideal");
        }else if(prom>=70.0 & prom<85.0){
            System.out.println("peso normal");
        }else{
            System.out.println("peso excedido");
        }
        //cerramos el Scanner
        sc.close();
    }
}
