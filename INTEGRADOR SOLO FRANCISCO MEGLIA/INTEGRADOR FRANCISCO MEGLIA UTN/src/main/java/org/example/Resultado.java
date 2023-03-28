package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resultado {

        static int ganadorResultado;

    public static void leerResultado (int cantPartidos , String ruta) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea = reader.readLine();
            int contadorLineas = 1;
            while (linea != null && contadorLineas <= cantPartidos) {

                String[] lineaToArr = linea.split(";");
                new Equipo(lineaToArr[0]);
                new Equipo(lineaToArr[3]);
                int cantGoles1 = Integer.parseInt(lineaToArr[1]);
                int cantGoles2 = Integer.parseInt(lineaToArr[2]);
                if (cantGoles1 > cantGoles2) {
                    ganadorResultado = 1;
                } else if (cantGoles2 > cantGoles1) {
                    ganadorResultado = 2;
                } else if (cantGoles1 == cantGoles2) {
                    ganadorResultado = 0;
                }
                contadorLineas++;
                /* System.out.println(linea);
                linea = reader.readLine();
                contadorLineas++; */
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}



