package actividadesEscuela.CLASE_2025_09_30;
import java.util.Arrays;

public class act5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i=0; i<vector.length;i++){
            vector[i]=(int)(Math.random() *100);
        }
        System.out.println("Vector: " + Arrays.toString(vector));
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambio
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        System.out.println("Vector ordenado: " + Arrays.toString(vector));
    }
}
