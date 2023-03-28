package org.example;

public class Participante {
        public String nombre;
        Pronostico pronostico = new Pronostico();

        public Participante() {
        }

        public static int puntosTotales() {
            int puntos = 0;
            if (Pronostico.ganadorPronostico == 1 && Resultado.ganadorResultado == 1) {
                puntos = 3;
            } else if (Pronostico.ganadorPronostico == 2 && Resultado.ganadorResultado == 2) {
                puntos = 3;
            } else if (Pronostico.ganadorPronostico == 0 && Resultado.ganadorResultado == 0) {
                puntos = 1;
            }

            return puntos;
        }

    }
