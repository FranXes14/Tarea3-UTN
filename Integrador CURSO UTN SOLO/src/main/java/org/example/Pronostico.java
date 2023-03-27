package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pronostico {


    static int ganadorPronostico;
    public static void leerPronostico(int cantPartidos, String ruta) throws IOException {

        for (int i = cantPartidos; i < cantPartidos; i++) {

            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(ruta));

                String texto = br.readLine();

                String[] linea = texto.split(";");
                Equipo equipo1 = new Equipo(linea[0]);
                Equipo equipo2 = new Equipo(linea[4]);
                if (linea[1].equals("X")) {
                    ganadorPronostico = 1;
                } else if (linea[3].equals("X")) {
                    ganadorPronostico = 2;
                } else if (linea[2].equals("X")) {
                    ganadorPronostico = 10;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }


        }
    }
}

      /*  String pronostico = ruta;
        for (String line : Files.readAllLines(Paths.get(pronostico))) {
            String[] linea = line.split(";");
            Equipo equipo1 = new Equipo(linea[0]);
            Equipo equipo2 = new Equipo(linea[4]);
            if (linea[1].equals("X")) {
                ganadorPronostico = 1 ;
            } else if (linea[3].equals("X")) {
                ganadorPronostico = 2;
            } else if (linea[2].equals("X")) {
                ganadorPronostico = 0;
            }
        }

    } */



