package org.example;

import lombok.Data;

import java.io.IOException;

public class Participante {

    public String nombre;

    Pronostico pronostico = new Pronostico();

    public static int puntosTotales(){

        int puntos = 0;
       if (Pronostico.ganadorPronostico == 1 && prueba.ganadorPrueba == 1) {
           puntos = 1;
        } else if (Pronostico.ganadorPronostico == 2 && prueba.ganadorPrueba == 2) {
           puntos = 1;
        } else if (Pronostico.ganadorPronostico == 0 && prueba.ganadorPrueba == 0) {
           puntos = 1;
        }
       return puntos;
    }
}
