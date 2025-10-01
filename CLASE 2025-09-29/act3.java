public class act3 {
    public static void main(String[] args) {
        double[] Alturas = {1.74, 1.50, 1.65, 1.71, 1.55};
        double acum=0;
        double prom;
        int bajas=0;
        int altas=0;
        int iguales=0;
        for (int i=0; i<Alturas.length;i++){
            acum+=Alturas[i];
        }
        prom=(acum/(Alturas.length));
        System.out.println("IMPRESION DE VECTOR ALTURAS");
        for (int j=0; j<Alturas.length;j++){
            System.out.println("PERSONA " + j + ": " + Alturas[j]);
            if (Alturas[j]<prom){
                bajas++;
            }else if(Alturas[j]>prom){
                altas++;
            }else{
                iguales++;
            }
        }
        System.out.println("");
        System.out.println("El promedio de altura es de: " + prom);
        System.out.println("La cantidad de personas con altura mayor al promedio es de: " + altas);
        System.out.println("La cantidad de personas con altura menor al promedio es de: " + bajas);
        System.out.println("La cantidad de personas con altura igual al promedio es de: " + iguales);
    }
}
