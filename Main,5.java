import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // num: munero entero e evaluar
            System.out.print("Ingrese un numero: ");
        int num = input.nextInt();

        // --------- IF ---------
        if (num % 2 == 0) {
            System.out.println("Par");
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (num % 2 == 0) {
            System.out.println("Par");
        } else if (num % 2 != 0) {
            System.out.println("Impar");
        } else {
            System.out.println("Entrada invalida");
        }

        // --------- TERNARIO ---------
        String res = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println(res);
    }
}