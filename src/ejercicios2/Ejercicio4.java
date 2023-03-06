package ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String frase, orden = "";
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras.length -1; j++) {
                if (palabras[j].compareTo(palabras[j+1]) <= 0){
                    max = j;
                }else
                    max = j+1;
            }
            orden += palabras[max] + " ";
        }
        System.out.println(orden);
        sc.close();
    }
}
