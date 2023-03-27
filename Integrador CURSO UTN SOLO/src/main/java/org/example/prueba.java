package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class prueba {
    static int ganadorPrueba;

    public static void prueba(int cantPartis, String ruta) throws IOException {

        String file = ruta;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


     /*   String resultado = ruta;
        for (String line : Files.readAllLines(Paths.get(resultado))) {
            String[] linea = line.split(";");
            Equipo equipo1 = new Equipo(linea[0]);
            Equipo equipo2 = new Equipo(linea[3]);
            int cantGoles1 = Integer.parseInt(linea[1]);
            int cantGoles2 = Integer.parseInt(linea[2]);

            if (cantGoles1 > cantGoles2) {
                ganadorResultado = 1;
            } else if (cantGoles2 > cantGoles1) {
                ganadorResultado = 2;
            } else if (cantGoles1 == cantGoles2) {
                ganadorResultado = 0;
            }
        } */
    }
}


