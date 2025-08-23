import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // anio: ano a evaluar
        System.out.print("Ingrese un anio: ");
        int anio = input.nextInt();


        // --------- IF ---------
        if (anio % 4 == 0) {
            System.out.println("Podria se bisiesto (falta validar 100 y 400)");
        }

        // --------- IF - ELSE IF - ELSE ----------
        if (anio % 400 == 0) {
            System.out.println("Es bisiesto");
        } else if (anio % 100 == 0) {
            System.out.println("No es bisiesto");
        } else if (anio % 4 == 0) {
                System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        // --------- TERNARIO ---------
        String res = (anio % 400 == 0) ? "Es bisiesto"
                   : (anio % 100 == 0) ? "No es bisiesto"
                   : (anio % 4 == 0) ? "Es bisiesto"
                   : "No es bisiesto";
        System.out.println(res);
    }
}