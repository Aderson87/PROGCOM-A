import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // num: numero al que se le aplicla la regla FizzBuzz
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();

        // --------- IF ---------
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }

        // --------- IF - ELSE IF - ELSE ---------
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

        // --------- TERNARIO ---------
        String res = (num % 3 == 0 && num % 5 == 0) ? "FizzBuzz"
                   : (num % 3 == 0) ? "Fizz"
                   : (num % 5 == 0) ? "Buzz" 
                   : String.valueOf(num);
        System.out.println(res);
    }
}