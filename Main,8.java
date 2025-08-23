import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // password: texto que ingresa el usuario como clave
        System.out.print("Ingresa la contrasena: ");
        String password =  input.nextLine();

        // --------- IF --------
        if (password.length() > 8) {
            System.out.println("Logitud OK (falta validar numero y mayucula)");
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (password.length() > 8 
           && password.matches(".*[0-9].*")
           && password.matches(".*[A-Z].*")) {
           System.out.println("Contrasena valida");
      } else if (password.length() <= 8) {
           System.out.println("Muy corta (debe ser > 8)");
      } else {
            System.out.println("Falta numero o Mayuscula");
      }

      // --------- TERNARIO --------
      String res = (password.length() > 8 
                   && password.matches(".*[0-9].*")
                   && password.matches(".*[A-Z].*"))
                  ? "Contrasena valida"
                  :"Contrasena invalida";
      System.out.println(res);

      input.close();  
    } 
}
