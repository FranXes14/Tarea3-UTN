package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.Data;

public class Resultado {


    static int ganadorResultado;

    public static void leerResultado(int cantPartis , String ruta) throws IOException {

        for (int i = 0; i < cantPartis; i++) {
            BufferedReader br = null;

            try {

                br = new BufferedReader(new FileReader(ruta));

                String texto = br.readLine();

                String[] linea = texto.split(";");
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

            } catch (Exception e) {
                System.out.println("Error: Fichero no encontrado");
            }
        }
    }
}

     /*   String resultado = ruta;
        for (String line : Files.readAllLines(Paths.get(resultado))) {
            String[] linea = line.split(";");
            Equipo equipo1 = new Equipo(linea[0]);
            Equipo equipo2 = new Equipo(linea[3]);
            int cantGoles1 = Integer.parseInt(linea[1]);
            int cantGoles2= Integer.parseInt(linea[2]);

            if (cantGoles1 > cantGoles2) {
                ganadorResultado = 1 ;
            } else if (cantGoles2 > cantGoles1) {
                ganadorResultado = 2;
            } else if (cantGoles1 == cantGoles2) {
                ganadorResultado = 0;
            }
        }
    }
} */
