package actividadesEscuela.CLASE_2025_09_30;
import java.util.Arrays;
public class act2 {
    public static void main(String[] args) {
        int[] vector1 = {2,4,6,8,10,12,14,16,18,20};
        int[] vector2 = {1,3,5,7,9,11,13,15,17,19};
        int[] vector3 = {2,5,8,3,1,6,1,8,0,23};
        int acum1=0;
        int acum2=0;
        int acum3=0;
        for(int i = 0; i<10; i++){
            acum1+=vector1[i];
            acum2+=vector2[i];
            acum3+=vector3[i];
        }
        System.out.println("Vector 1: " + Arrays.toString(vector1));
        System.out.println("Vector 2: " + Arrays.toString(vector2));
        System.out.println("Vector 3: " + Arrays.toString(vector3));
        System.out.println("Acumulado vector 1 = " + acum1);
        System.out.println("Acumulado vector 2 = " + acum2);
        System.out.println("Acumulado vector 3 = " + acum3);
        if (acum1>acum2 & acum1>acum3){
            System.out.println("El vector con un valor acumulado mayor es el 1");
        }else if(acum2>acum1 & acum2>acum3){
            System.out.println("El vector con un valor acumulado mayor es el 2");
        }else{
            System.out.println("El vector con un valor acumulado mayor es el 3");
        }
    }
}
