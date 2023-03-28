package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // LEO EL ARCHIVO RESULTADO , CANT PARTIDOS REPRESENTA LA CANTIDAD DE LINEAS  QUE VA A LEER
        Resultado.leerResultado(2 , "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR SOLO FRANCISCO MEGLIA\\resultados.csv");

        // CREO EL PARTICIPANTE Y LE AGREGO UN PRONOSTICO TAMBIEN CON UNA CANTIDAD DE PARTIDOS ESPECIFICA
        Participante par1 = new Participante();
        par1.nombre = "Juan";
        par1.pronostico.leerPronostico(2 , "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR SOLO FRANCISCO MEGLIA\\pronosticos.csv");

        // LANZO LOS PUNTOS TOTALES DEL PARTICIPANTE CON EL METODO puntosTotales() CREADO DENTRO DE PARTICIPANTE

        System.out.println("Los puntos totales de " + par1.nombre + " son: " + Participante.puntosTotales());




    }
}