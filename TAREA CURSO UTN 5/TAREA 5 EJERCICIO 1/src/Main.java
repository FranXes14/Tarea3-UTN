import java.util.*;

public class Main {
    public static void main(String[] args) {

    // EJERCICIO 1 A

        String num1 = args[0];
        String num2 = args[1];
        String num3 = args[2];
        String letraA = args[3];

        if (letraA.equals("A")) {
            Arrays.sort(args);
            System.out.println(Arrays.toString(args));
        } else if (letraA.equals("D")) {
            Arrays.sort(args , Collections.reverseOrder());
            System.out.println(Arrays.toString(args));
        } else System.out.println("ERROR");



     //EJERCICIO 1 B

        Scanner prueba = new Scanner(System.in);

     System.out.println("Ingrese 3 numeros a continuacion: ");
     int numA = prueba.nextInt();
     int numB = prueba.nextInt();;
     int numC = prueba.nextInt();

        Integer numsB[] = {numA , numB , numC};

     System.out.println("Ingrese una de las siguientes letras (A / D): ");

     String letraB = prueba.next();

     //A DE ASCENDENTE Y D DE DESCENDENTE

        if (letraB.equals("A")) {
            Arrays.sort(numsB);
            System.out.println(Arrays.toString(numsB));
        } else if (letraB.equals("D")) {
            Arrays.sort(numsB , Collections.reverseOrder());
            System.out.println(Arrays.toString(numsB));
        } else System.out.println("ERROR");



     // EJERCICIO 1 C

     if (args.length == 4) {
         String num1C = args[0];
         String num2C = args[1];
         String num3C = args[2];
         String letraAC = args[3];

         if (letraAC.equals("A")) {
             Arrays.sort(args);
             System.out.println(Arrays.toString(args));
         } else if (letraAC.equals("D")) {
             Arrays.sort(args , Collections.reverseOrder());
             System.out.println(Arrays.toString(args));
         } else System.out.println("ERROR");
     } else {
         Scanner prueba2 = new Scanner(System.in);

         System.out.println("Ingrese 3 numeros a continuacion: ");
         int numAC = prueba.nextInt();
         int numBC = prueba.nextInt();;
         int numCC = prueba.nextInt();

         Integer numsBC[] = {numAC , numBC , numCC};

         System.out.println("Ingrese una de las siguientes letras (A / D): ");

         String letraBC = prueba.next();

         //A DE ASCENDENTE Y D DE DESCENDENTE

         if (letraBC.equals("A")) {
             Arrays.sort(numsBC);
             System.out.println(Arrays.toString(numsBC));
         } else if (letraBC.equals("D")) {
             Arrays.sort(numsBC , Collections.reverseOrder());
             System.out.println(Arrays.toString(numsBC));
         } else System.out.println("ERROR");
     }












    }
}