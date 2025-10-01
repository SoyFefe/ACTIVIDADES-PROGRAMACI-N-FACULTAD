import java.util.Scanner;
public class act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=0;
        String nombre;
        double precio=0.0;
        String nx="";
        double px=0.0;
        String opcion;
        do{
            System.out.print("ingrese el nombre del producto: ");
            nombre = sc.nextLine();
            System.out.print("ingrese el precio del producto: ");
            precio = sc.nextDouble();
            sc.nextLine();

            if(b==0){
                nx=nombre;
                px=precio;
                b=1;
            }else if(precio<px){
                nx=nombre;
                px=precio;
            }
            System.out.println("¿desea ingresar otro juego de datos? s/n");
            opcion = sc.nextLine();
        }while(opcion.equalsIgnoreCase("s"));

        System.out.println("el producto de menor precio es: " + nx + " ($"+px+")" );
        sc.close();
    }
}
