public class Main {
    public static void main(String[] args) {

       // EJERCICIO 1 A

        int a = 5;
        int b = 14;

        while (a < b + 1) {

            int resultado = a++;
            System.out.println(resultado);
        }


        // EJERCICIO 1 B

        while (a < b + 1) {

            int resultado = a++;

            if (resultado % 2 == 0) {
                System.out.println(resultado);

            }

        }


        // EJERCICIO 1 C

        String PARoINPAR = "Par";
        while (a < b + 1) {

            int resultado = a++;

            switch (PARoINPAR) {
                case "Par":
                    if (resultado % 2 == 0) {
                        System.out.println(resultado);
                    }
                    break;

                case "Inpar":
                    if (resultado % 2 >= 1) {
                        System.out.println(resultado);
                    }
                    ;
            }
        }


        // EJERCICIO 1 D

        for (int aa = 14; aa >= 5; aa--) {
            if (aa % 2 == 0) {
                System.out.println(aa);
            }
        }



      // EJERCICIO 2

        // VARIABLES
        int ingresosM = 490000;
        int vehiculos = 2;
        int antiguedadvehiculos = 4;
        int inmuebles = 1;
        int avioneoembarcacion = 0;

        //EJERCICIO 2 D

        if ((ingresosM >= 489083) ||
        (vehiculos >= 3 && antiguedadvehiculos < 5) || (inmuebles >= 3) || (avioneoembarcacion >= 1)) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("No pertenece al segmento de ingresos altos");
        }


        int numeros[] = int [3 , 5 , 10]

        System.out.println(numeros)








    }
}
















