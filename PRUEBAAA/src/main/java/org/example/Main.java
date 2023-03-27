package org.example;

import lombok.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@Data
public class Main {
    public static void main(String[] args) throws IOException {

        int cantPartidos = 2;
/*
      File ruta = new File("C:\\Users\\Victoria\\Desktop\\clase 9.txt");
        FileReader fr = new FileReader (ruta);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        linea = br.readLine();
*/


       // System.out.println(linea);


        String File = "C:\\Users\\Victoria\\Desktop\\INTEGRADOR CURSO UTN\\resultados.csv";

        for (String linea: Files.readAllLines(Paths.get(File))) {
            String[] sepa = linea.split("\\.");
            for (int i = 0; i < sepa.length ; i++) {
                System.out.println(sepa[1]);
            }

        }



    }
}