import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // num1, num2, num3: los tres valores a comparar 
        System.out.print("num1: ");

        int num1 = input.nextInt();
        System.out.print("num2: ");

        int num2 = input.nextInt();
        System.out.print("num3: ");

        int num3 = input.nextInt();

        // --------- IF ---------
        if (num1 > num2 && num1 >= num3) {
            System.out.print("El mayor es: " + num1);
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        }else{
            System.out.println("El mayor es: " + num3);
        }

        // --------- TERNARIO ---------
        String res = (num1 >= num2 && num1 >= num3) ? ("El mayor es: " + num1)
               :(num2 >= num1 && num2 >= num3) ? ("El mayor es: " + num2)
               :("El mayor es: " + num3);
        System.out.println(res);
    }
}