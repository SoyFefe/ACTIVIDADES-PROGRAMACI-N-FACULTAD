package actividadesEscuela.CLASE_2025_09_30;

public class act3 {
    public static void main(String[] args) {
        int[] vector1= new int[5];
        int[] vector2= new int[5];
        int[] vector3= new int[5];
        System.out.println("vector 1: ");
        for(int i = 0; i < vector1.length;i++){
            vector1[i] = (int)(Math.random() * 5);
            System.out.print(vector1[i] + ", ");
        }
        System.out.println("");
        System.out.println("vector 2: ");
        for(int i = 0; i < vector2.length;i++){
            vector2[i] = (int)(Math.random() * 5);
            System.out.print(vector2[i] + ", ");
        }
        System.out.println("");
        System.out.println("suma de vectores");
        for(int i=0; i<vector1.length;i++){
            vector3[i]=vector1[i]+vector2[i];
            System.out.print(vector3[i] + ", ");
        }
    }
}
