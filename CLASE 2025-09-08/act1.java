import java.util.Scanner;
public class act1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaración de variables
        int sueldo;
        int[] sueldos = new int[100];
        int i=0;
        //bucle while que utiliza true y funciona como bucle infinito
        while (true) {
            //carga de datos
            System.out.print("ingrese el sueldo del empleado: ");
            sueldo=sc.nextInt();
            //condicional para cortar el bucle
            if (sueldo==99999) {
                break;
            }
            //carga de datos en el array
            sueldos[i]=sueldo;
            //incremento del identador 1 en 1
            i++;
        }
        //creamos los contadores
        int may = 0;
        int men = 0;
        int suma=0;
        //bucle for que recorre el array
        for (int j=0; j<i;j++) {
            //if que compara y cuenta los sueldos mayores o iguales a 5000 y menores a 5000
            if (sueldos[j]>=5000){
                may++;
            } else{
                men++;
            };
            //funcion que suma todos los sueldos
            suma+=sueldos[j];
        }
        //utilizo el operador "?" que si no se cargo ningun sueldo solo muestra 0.0 y si se cargaron, ejecuta el calculo para sacar el promedio
        double prom = (i > 0) ? (double) suma / i : 0.0;
        //impresion de los resultados
        System.out.println("la cantidad de sueldos mayores a $5000 es de: " + may);
        System.out.println("la cantidad de sueldos menores a $5000 es de: " + men);
        System.out.println("el promedio de todos los sueldos es de: "+ prom);
        //cerramos el scanner
        sc.close();
    }
}
