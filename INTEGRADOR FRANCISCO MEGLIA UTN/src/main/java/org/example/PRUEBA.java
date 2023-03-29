package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PRUEBA {


    // GANADOR PRONOSTICO

    static int ganadorPronostico;

    public static int[] leerPronostico (int cantPartidos , String ruta) {
        int[] resultadosPronosticados = new int[cantPartidos];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea = reader.readLine();
            int contadorLineas = 1;
            while (linea != null && contadorLineas <= cantPartidos) {

                String[] lineaToArr = linea.split(";");
                new Equipo(lineaToArr[0]);
                new Equipo(lineaToArr[4]);
                if (lineaToArr[1].equals("X")) {
                    ganadorPronostico = 1;
                } else if (lineaToArr[3].equals("X")) {
                    ganadorPronostico = 2;
                } else if (lineaToArr[2].equals("X")) {
                    ganadorPronostico = 0;
                }
                resultadosPronosticados[contadorLineas-1] = ganadorPronostico;
                contadorLineas ++;
                linea = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultadosPronosticados;
    }


    // GANADOR RESULTADO


    static int ganadorResultado;

    public static int[] leerResultado (int cantPartidos , String ruta) {
        int[] resultados = new int[cantPartidos];
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
                resultados[contadorLineas-1] = ganadorResultado;
                contadorLineas++;
                linea = reader.readLine();
            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        return resultados;
    }

    // CALCULAR PUNTAJE

    public static int calcularPuntaje(int[] resultadosPronosticados, int[] resultadosReales) {
        int puntajeTotal = 0;
        for (int i = 0; i < resultadosPronosticados.length; i++) {
            if (resultadosPronosticados[i] == resultadosReales[i]) {
                if (resultadosPronosticados[i] == 0) {
                    puntajeTotal += 1;
                } else {
                    puntajeTotal += 3;
                }
            }
        }
        return puntajeTotal;
    }

    /*
    public static int compararResultados(int cantPartidos, String rutaPronostico, String rutaResultado) {
        int puntos = 0;
        leerPronostico(cantPartidos, rutaPronostico);
        leerResultado(cantPartidos, rutaResultado);
        for (int i = 1; i <= cantPartidos; i++) {
            if (Pronostico.ganadorPronostico == Resultado.ganadorResultado) {
                if (Resultado.ganadorResultado != 0) {
                    puntos += 3;
                } else {
                    puntos += 1;
                }
            }
        }
        return puntos;
    } */
}
