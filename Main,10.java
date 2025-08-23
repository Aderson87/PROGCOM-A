import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // saldo: dinero disponible; monto: lo que el usuario quiere retirar 
        System.out.print("Saldo disponible: ");
        double saldo = input.nextDouble();

        System.out.print("Monto a retirar: ");
        double monto = input.nextDouble();

        // ---------- IF --------- 
        if (monto <= saldo) {
            System.out.println("Operacion posible0");
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (monto <= saldo) {
            System.out.println("Operacion posible. Nuevo saldo: " + (saldo - monto));
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            System.out.println("Entrada invalida");
        }

        // --------- TERNARIO ---------
        String res = (monto <= saldo)
                   ? "Operacion posible. Nuevo saldo: " + (saldo - monto)
                   : "Fondos insuficientes";
        System.out.println(res);
    }
}