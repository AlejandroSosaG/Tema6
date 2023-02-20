package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "";
        String palabra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca una palabra");
            palabra = sc.next();
            if (palabra.equalsIgnoreCase("fin")==false)
                frase += palabra + " ";
        }while (palabra.equalsIgnoreCase("fin")!=true);
        System.out.println(frase);
        sc.close();
    }
}
