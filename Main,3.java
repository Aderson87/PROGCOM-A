import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Lee datos del teclado 
        Scanner input = new Scanner(System.in);

        // num1 y num2: guardan los dos numeros que ingresa el usurio
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        // --------- IF ---------
        if (num1 > num2){
            System.out.println("El mayor es: " + num1);
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        }else {
            System.out.println("Son iguales");
        }

        // --------- TERNARIO ---------
        String resultado = (num1 > num2) ? ("El mayor es: " + num1)
                         : (num2 > num1) ? ("El mayor es: " + num2)
                         : "Son iguales";
        System.out.println(resultado);
    }
}