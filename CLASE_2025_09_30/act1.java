package actividadesEscuela.CLASE_2025_09_30;

public class act1 {
    public static void main(String[] args) {
        double[] precios=new double[30];
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int acum=0;
        //carga de datos en el vector
        for(int i = 0; i < precios.length;i++){
            //generador de numeros aleatorios
            double aleatorio = (Math.random() * 300);
            //multiplica, redondea y divide el numero para que asi queden decimales con dos numeros despues de la coma
            precios[i] = Math.round(aleatorio * 100.0) / 100.0;
        }
        //imprimimos el vector
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i+1) + ": " + precios[i]);
        }
        //for con condicionales if para comparar cada numero
        for (int i = 0; i < precios.length; i++) {
            if(precios[i]<100.00){
                cont1++;
            }else if(precios[i]>=100.00 & precios[i]<200.00){
                cont2++;
            }else if(precios[i]>=200.00){
                cont3++;
            };
            acum+=precios[i];
        }
        
        System.out.println("La cantidad de productos con un valor menor a $100 es de: " + cont1);
        System.out.println("La cantidad de productos con un valor mayor a $100 y menor a $200 es de: " + cont2);
        System.out.println("La cantidad de productos con un valor mayor a $200 es de: " + cont3);
        System.out.println("La suma completa de todos los productos da un igual a: " + acum);
        
    }
}
