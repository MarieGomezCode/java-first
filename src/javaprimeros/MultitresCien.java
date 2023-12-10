package javaprimeros;

public class MultitresCien {
    public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                System.out.println(i);
            }
        }
    }
}
//Usa un bucle for para imprimir todos los múltiplos de 3, entre 1 y 100.