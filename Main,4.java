import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // calificacion: numero de 0 a 100 que ingrese el usuario
        System.out.print("Ingrese tu calificacion (0-100): ");
        int calificacion = input.nextInt();

        // --------- IF ---------
        if (calificacion >= 60) {
            System.out.println("Aprobado");
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (calificacion >= 60){
            System.out.println("Aprobado");
        } else if (calificacion < 60){
            System.out.println("Reprobado");
        } else {
            System.out.println("Entrada invalida");
        }

        // --------- TERNARIO ---------
        String res = (calificacion >= 60) ? "Aprobado" : "Reprobado";
        System.out.println(res);
    }
}