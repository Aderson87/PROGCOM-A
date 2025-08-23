import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Variable que sirve para leer el taclado 
        Scanner input = new Scanner(System.in);

        // Variable "edad": guarda el numero que ingresa el usuario 
        // Representa la edad de la persona
        System.out.print("Ingrese tu edad: ");
        int edad = input.nextInt();

        // USANDO IF 
        if(edad >= 18){
            System.out.println("Es mayor de edad");
            
        }
        
        // USUARIO IF - ELSE IF - ELSE
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else if(edad < 18){
            System.out.println("Es menor de edad");
        } else {
             System.out.println("Edad invalida");
        }

       //OPERADOR TERNARIO
       String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
       System.out.println(resultado);
      // La variable "resultado" guarda el texto que depende de la condicion 
    }
}