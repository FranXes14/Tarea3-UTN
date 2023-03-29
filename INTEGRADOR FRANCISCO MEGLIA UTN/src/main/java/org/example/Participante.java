package org.example;

public class Participante {
    public String nombre;
   // Pronostico pronostico = new Pronostico();

    public int cantidadPartidos;
    PRUEBA pronoRes = new PRUEBA();

    public Participante() {}

 /*   public static int puntosTotales() {
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

        public static int calcularPuntaje () {
        // Variables para almacenar los puntos obtenidos
        int puntosTotales = 0;
        int puntosGanados = 0;
        int puntosEmpatados = 0;

        // Leer los pronósticos y resultados de los partidos
        leerPronostico(cantPartidos, rutaPronostico);
        leerResultado(cantPartidos, rutaResultado);


        // Comparar los pronósticos con los resultados y sumar los puntos
        for (int i = 1; i <= cantPartidos; i++) {
            if (ganadorPronostico == ganadorResultado) {
                if (ganadorPronostico == 0) {
                    puntosEmpatados++;
                } else {
                    puntosGanados++;
                }
            }
        }

        // Calcular el total de puntos
        puntosTotales = puntosGanados * 3 + puntosEmpatados;

        // Retornar el total de puntos
        return puntosTotales;
    } */
}
