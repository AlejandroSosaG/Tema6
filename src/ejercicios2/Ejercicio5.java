package ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String palabra, secuencia = "";
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        palabra = sc.next();
        System.out.println("Introduzca la cantidad de letras en las que desea dividir la palabra");
        n = sc.nextInt();
        for (int i = 0; i < palabra.length(); i+=n) {
            if (i+n<=palabra.length())
                secuencia += palabra.substring(i, i+n);
            else
                secuencia += palabra.substring(i);
            secuencia += "\n";
        }
        System.out.println(secuencia);
    }
}
