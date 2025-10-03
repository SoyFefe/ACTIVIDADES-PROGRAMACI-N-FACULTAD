public class act4 {
    public static void main(String[] args) {
        int[] numeros=new int[50];
        int index=0;
        for(int i=0; i<=100; i++){
            if (i % 2 != 0 ){
                numeros[index] = i;
                index++;
            }
        }
        for (int j = 0; j < numeros.length; j++) {
            System.out.print(numeros[j] + " ");
        }
    }
}
