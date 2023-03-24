package org.example;

import javax.print.DocFlavor;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PERSONA 1

        Persona per1 = new Persona();

        System.out.println("Por favor ingrese su nombre: ");
        per1.setNombre(sc.next());

        System.out.println("Ahora ingrese su apellido: ");
        per1.setApellido(sc.next());

        System.out.println("Y por ultimo su fecha de nacimiento (de esta forma: 14/09/2004): ");
        per1.setFechaDeNacimuento(sc.next());

        // PERSONA 2

        Persona per2 = new Persona();

        System.out.println("Por favor ingrese su nombre: ");
        per2.setNombre(sc.next());

        System.out.println("Ahora ingrese su apellido: ");
        per2.setApellido(sc.next());

        System.out.println("Y por ultimo su fecha de nacimiento (de esta forma: 14/09/2004): ");
        per2.setFechaDeNacimuento(sc.next());

        // GUARDAR PERSONAS y DEVOLVER TODAS LAS PERSONAS

        String arrayPersona[] = {per1.toString() , per2.toString()};

        for (String per:  arrayPersona) {
            System.out.println(per);
        }
    }
}