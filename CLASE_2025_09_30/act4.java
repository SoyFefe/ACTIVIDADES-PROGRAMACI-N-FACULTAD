package actividadesEscuela.CLASE_2025_09_30;
import java.util.Arrays;

public class act4 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int cont=0;
        for(int i = 0; i < vector.length;i++){
            vector[i] = (int)(Math.random() * 100);
        }
        int quinto=vector[4];
        System.out.println("Vector: " + Arrays.toString(vector));
        for(int j = 0; j<vector.length; j++){
            if(vector[j]>quinto){
                cont++;
            }
        }
        System.out.println("La cantidad de valores enteros que tienen un valor mayor al de el quinto elemento("+vector[4]+") es de: " + cont);
    }
}
