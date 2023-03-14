import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String entrada = "C:\\Users\\megli\\Desktop\\TAREAS CURSO JAVA UTN\\TAREA CURSO UTN 5\\TAREA 5 EJERCICIO 3\\archivoEnt.txt";
        for (String line: Files.readAllLines(Paths.get(entrada))) {

            String salida = "C:\\Users\\megli\\Desktop\\TAREAS CURSO JAVA UTN\\TAREA CURSO UTN 5\\TAREA 5 EJERCICIO 3\\archivoSal.txt";



            String frase = line ;
            String letras = "abcdefghijklmnopqrstuvwxyz" ;

            String codOdeco = args[1];
            String frasecodificado= "";
            String frasedecodificada= "";
            frase = frase.toLowerCase() ;
            Integer p = Integer.valueOf(args[0]);
            char caracterC;

            switch (codOdeco) {

                case "C" : // CODIFICAR
                    for (int i = 0 ; i < frase.length(); i++) {
                        caracterC = frase.charAt(i);
                        int pos = letras.indexOf(caracterC);

                        if (pos == -1){
                            frasecodificado += caracterC ;
                        } else {
                            frasecodificado += letras.charAt((pos + p ) % letras.length());
                        }
                    } Files.writeString(Paths.get(salida) , frasecodificado);
                    //System.out.print(frasecodificado);
                    break;

                case "D": // DECODOFICAR

                    for (int i = 0; i < frase.length(); i++) {
                        caracterC = frase.charAt(i);
                        int posD = letras.indexOf(caracterC);

                        if (posD == -1){
                            frasedecodificada += caracterC ;
                        } else {
                            if (posD - p < 0) {
                                frasedecodificada += letras.charAt(letras.length() + (posD - p));
                            } else {
                                frasedecodificada += letras.charAt((posD - p) % letras.length());
                            }
                        }
                    } Files.writeString(Paths.get(salida) , frasedecodificada);
                    //System.out.print(frasedecodificada);
                    break;

                default: System.out.println("COLOQUE D O C EN EL PARAMETRO");
            }
        }

    }
}
