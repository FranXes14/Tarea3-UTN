import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //TAREA 5: EJERCICIO 2  [S: SUMA , M: MULTIPLICACION]

        String archivo = args[0];
        for (String linea : Files.readAllLines(Paths.get(archivo))) {

            String vec[] = linea.split(" ");

            if (args[1].equals("S")) {
                int result = 0;

                for (int i = 0; i < vec.length; i++) {

                    int numS = Integer.parseInt(vec[i]);
                    result += numS;
                }
                System.out.println(result);
            } else if (args[1].equals("M")) {
                int mult = 1;

                for (int i = 0; i < vec.length; i++) {
                    int numM = Integer.parseInt(vec[i]);
                    mult = mult * numM;
                } System.out.println(mult);
            }
        }
    }
}
