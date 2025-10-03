import java.util.Scanner;
public class act2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaracion de variables
        int[] productos = new int[12];
        int may=0;
        int men=0;
        int med=0;
        int i=0;
        int j=0;
        //for para la carga de datos en el array
        while(i<11){
            System.out.print("ingrese el precio del producto " + (i+1) + ": ");
            productos[i]=sc.nextInt();
            i++;
        }
        //for que compara los precios y los ubica si son mayor, menor, o entre
        while(j<11){
            if(productos[j]<50){
                men++;
            }else if(productos[j]>=50 & productos[j]<=100){
                med++;
            }else{
                may++;
            }
            j++;
        }
        //impresion de los resultados
        System.out.println("la cantidad de productos con precio menore a 50 son: " + men);
        System.out.println("la cantidad de productos con precio entre 50 y 100 son: " + med);
        System.out.println("la cantidad de productos con precio mayor a 100 son: " + may);
        //cerramos el scanner
        sc.close();
    }
}
