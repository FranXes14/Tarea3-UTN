package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.example.PRUEBA.*;

public class Main {
    public static void main(String[] args) {

        /* Primero creo el participante , le asigno un nombre, una cantidad de partidos y dos metodos (pronoRes.leerPronostico para leer el pronostico
         y prono.Res.leerResultado para leer el resultado. */
        Participante par1 = new Participante();
        par1.nombre = "Juan";
        par1.cantidadPartidos = 2;
        par1.pronoRes.leerPronostico(2 , "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR FRANCISCO MEGLIA UTN\\pronosticos.csv");
        par1.pronoRes.leerResultado(2 , "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR FRANCISCO MEGLIA UTN\\resultados.csv" );

        /* Luego creo dos variables con las mimas rutas (rutaPronostico y rutaResultado) para despues utilizarlas dentro de 2 arrays con los cuales
        a partir de ellos comparo los resultados con mi metodo de calcularPuntaje .*/
        String rutaPronostico =  "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR FRANCISCO MEGLIA UTN\\pronosticos.csv";
        String rutaResultado = "C:\\Users\\megli\\OneDrive\\Escritorio\\INTEGRADOR FRANCISCO MEGLIA UTN\\resultados.csv";
        int[] resultadosPronosticados = leerPronostico(par1.cantidadPartidos, rutaPronostico);
        int[] resultadosReales = leerResultado(par1.cantidadPartidos, rutaResultado);
        int puntajeTotal = calcularPuntaje(resultadosPronosticados, resultadosReales);

        /* Por ultimo hago un sout de el puntaje total */
        System.out.println("Puntaje total: " + puntajeTotal);

        /*PD: Las clases Pronostico y Resultado no las borre por si en algun futuro para otra entrega con mas complejidad
        me llegan a ser utiles pero por ahora solo estoy usando la clase PRUEBA */

    }
}