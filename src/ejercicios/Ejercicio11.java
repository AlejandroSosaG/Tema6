package ejercicios;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
       String frase;
       String palabra = "";
       int tamaño = 0;
       String[] palabras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>palabra.length()){
                palabra = palabras[i];
                tamaño = palabra.length();
            }
        }
        System.out.println("Palabra más larga: " + palabra + ", tamaño: " + tamaño);
        sc.close();
    }
}
