import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        // EJERCICIO 1 A
        int counter = 0;
        String texto = "Programacion" ;
        char letra ='a';

        for (int i = 0; i < texto.length(); i++){
            texto = texto.toLowerCase();
            if (texto.charAt(i) == letra ) {
                counter++ ;
            }
        } System.out.print(counter);


        // EJERCICIO 1 B
        int a = 80 ;
        int b = 750 ;
        int c = 100;
        int numeros[] = new int[3] ;
        numeros[0] = a ;
        numeros [1] = b ;
        numeros [2] = c ;

        //ORDENAR LOS NUMEROS DEL ARRAY UTILIZANDO IF (SE ME COMPLICO UN POCO, LO PODRIA HABER HECHO MAS FACIL CON UN .SORT !)
        if (a > b && a > c) {
            if (b > c) {
                numeros[0] = a;
                numeros[1] = b;
                numeros[2] = c;
            } else if (c > b) {
                numeros[0] = a;
                numeros[1] = c;
                numeros[2] = b;
            }
            System.out.println(Arrays.toString(numeros));
        } else if (b > a && b > c) {
            if (a > c) {
                numeros[0] = b;
                numeros[1] = a;
                numeros[2] = c;
            } else if (c > a) {
                numeros[0] = b;
                numeros[1] = c;
                numeros[2] = a;
            }
            System.out.println(Arrays.toString(numeros));
        } else if (c > a && c > b) {
            if (a > b) {
                numeros[0] = c;
                numeros[1] = a;
                numeros[2] = b;
            } else if (b > a) {
                numeros[0] = c;
                numeros[1] = b;
                numeros[2] = a;
            }
            System.out.println(Arrays.toString(numeros));
        }


        //APUNTES : vector = array de numeros / Con .Sort = podemos ordenar un array mas facilmente.


        //EJERCICIO 1 C
        int numerosc[] = {1 , 5 , 5 , 15} ;
        int x = 2 ;
        int sum = 0;

        for (int i= 0 ; i < numerosc.length; i++ ) {
            if (numerosc[i] > x) {
                sum += numerosc[i];
            }
        } System.out.println("La suma de los numeros mayores a " + x + " es " + sum);

        //EJERCICIO 2

        String frase = "Hola como estas ?" ;
        String letras = "abcdefghijklmnopqrstuvwxyz" ;

        String frasecodificado= "";
        frase = frase.toLowerCase() ;

        char caracter;
        for (int i = 0 ; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            int pos = letras.indexOf(caracter);

            if (pos == -1){
                frasecodificado += caracter ;
            } else {
                frasecodificado += letras.charAt((pos + 2) % letras.length());
            }
        } System.out.print(frasecodificado);

        String[] separado = "3_tristes tigres_del_13".split("_");

        System.out.print(separado[0]);


    }
}















